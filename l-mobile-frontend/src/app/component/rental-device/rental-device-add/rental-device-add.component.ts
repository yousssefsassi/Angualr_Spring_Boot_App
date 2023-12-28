import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RentalDeviceService } from 'src/app/service/rental-device.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-rental-device-add',
  templateUrl: './rental-device-add.component.html',
  styleUrls: ['./rental-device-add.component.css']
})
export class RentalDeviceAddComponent implements OnInit{
  photo:any;
  rentalDeviceForm: FormGroup;
  constructor(private builder: FormBuilder, private rentaldeviceService: RentalDeviceService,private snackBar: MatSnackBar){
    this.rentalDeviceForm = this.builder.group({
      description:[],
      brand:[],
      serialNumber:[],
      pictureFilePath:[],
      c:[],
      yearOfManufacture:[],
      createdAt:[],
      salesman:[{email:localStorage.getItem('username')}],
      deviceType:[]
    })

  }

  ngOnInit(): void {
  }


  addRentalDevice(){
    this.rentaldeviceService.addRentalDevice(this.rentalDeviceForm.value).subscribe(res=>{
      console.log(res);
      this.showSuccessMessage();
    })
  }
  showSuccessMessage() {

    this.snackBar.open('Device added successfully', 'Done', {
      duration: 4000, // Duration in milliseconds
      verticalPosition: "top", // Allowed values are  'top' | 'bottom'
      horizontalPosition: "center" // Allowed values are 'start' | 'center' | 'end' | 'left' | 'right'
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
    };
  }


}
