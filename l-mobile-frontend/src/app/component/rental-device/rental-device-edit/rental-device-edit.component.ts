import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RentalDeviceService } from 'src/app/service/rental-device.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-rental-device-edit',
  templateUrl: './rental-device-edit.component.html',
  styleUrls: ['./rental-device-edit.component.css'],
  providers:[DatePipe ]
})
export class RentalDeviceEditComponent implements OnInit{
  photo:any;
  rentalDeviceForm: FormGroup;
  rentalDevice:any;
  constructor(public datepipe: DatePipe ,private router:Router ,private builder: FormBuilder, private rentaldeviceService: RentalDeviceService,private snackBar: MatSnackBar){
    this.rentalDeviceForm = this.builder.group({
      description:[],
      brand:[],
      serialNumber:[],
      pictureFilePath:[],
      purchasePrice:[],
      yearOfManufacture:[],
      createdAt:[],
      salesman:[{email:localStorage.getItem('username')}],
      deviceType:[]
    })

  }

  ngOnInit(): void {
    this.rentaldeviceService.getRentalById(localStorage.getItem('rentalDeviceId')).subscribe(res=>{
      this.rentalDevice=res;
      this.rentalDeviceForm = this.builder.group({
        id:[res.id],
        description:[res.description],
        brand:[res.brand],
        serialNumber:[res.serialNumber],
        pictureFilePath:[res.pictureFilePath],
        purchasePrice:[res.purchasePrice],
        yearOfManufacture:[ this.datepipe.transform(res.yearOfManufacture, 'yyyy-MM-dd')],
        createdAt:[res.createdAt],
        salesman:[res.salesman],
        deviceType:[res.deviceType]
      })
    })

  }


  addRentalDevice(){
    this.rentaldeviceService.addRentalDevice(this.rentalDeviceForm.value).subscribe(res=>{
      console.log(res);
      this.router.navigate(['/control-panel/rental-device/list'])
    })
  }
  showSuccessMessage() {

    this.snackBar.open('Device added successfully', 'Close', {
      duration: 4000, // Duration in milliseconds
      horizontalPosition: 'end', // 'start', 'center', or 'end'
      verticalPosition: 'top',
    });
  }


  recuperPhoto(fileInput: any): void {
    this.photo = fileInput.target.files[0];
    const fileReader = new FileReader();
    fileReader.readAsDataURL(this.photo);
    fileReader.onload = (e: any) => {
      console.log('fileReader.result');
      console.log(fileReader.result);
      this.rentalDeviceForm.get('pictureFilePath')?.setValue(fileReader.result);
      this.rentalDevice.pictureFilePath=fileReader.result;
    };
  }


}
