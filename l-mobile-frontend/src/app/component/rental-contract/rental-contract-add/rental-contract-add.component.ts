import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RentalDeviceService } from 'src/app/service/rental-device.service';
import { RentalContractService } from '../../layout/service/rental-contract.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-rental-contract-add',
  templateUrl: './rental-contract-add.component.html',
  styleUrls: ['./rental-contract-add.component.css']
})
export class RentalContractAddComponent implements OnInit{

  formAddContract:FormGroup;
  constructor(private router:Router,private builder:FormBuilder, private renteldviseService: RentalDeviceService, private rentalContractService: RentalContractService){

    /************************************
     * formAddContract ;;; tous les attribus
     *
     *
     */
    this.formAddContract=this.builder.group({
      rentalDevices:[],
      validFrom:[],
      validTo:[],
      reference:[],
      price:[],
      salesman:[{email:localStorage.getItem('username')}]
    })
  }

  ngOnInit(): void {
    this.renteldviseService.getListRentalDevice().subscribe(res=>{
      this.deviceList=res;
    })
  }
  deviceList:any[]=[]


  addContract(){
    console.log(this.formAddContract.value);
    this.rentalContractService.addRentalContract(this.formAddContract.value).subscribe(res=>{
      this.router.navigate(['/control-panel/rental-contract/list']);
    })
  }
}
