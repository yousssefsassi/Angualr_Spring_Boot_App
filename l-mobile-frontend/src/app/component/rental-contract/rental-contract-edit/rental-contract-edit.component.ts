import { Component, OnInit } from '@angular/core';
import { RentalContractService } from '../../layout/service/rental-contract.service';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-rental-contract-edit',
  templateUrl: './rental-contract-edit.component.html',
  styleUrls: ['./rental-contract-edit.component.css'],
  providers:[DatePipe ]
})
export class RentalContractEditComponent implements OnInit{
  rentalContractForm: FormGroup;
  rentalContract:any;
  constructor(public datepipe: DatePipe , private router:Router ,private builder: FormBuilder, private rentalcontractservice: RentalContractService,private snackBar: MatSnackBar){
    this.rentalContractForm = this.builder.group({
      id:[],
      validFrom:[],
      validTo:[],
      price:[],
      reference:[],
      salesman:[],
      rentalDevices:[]
    })
  }
  ngOnInit(): void {
    this.rentalcontractservice.getRentalById(localStorage.getItem('rentalContractId')).subscribe(res=>{
      this.rentalContract=res;

      this.rentalContractForm = this.builder.group({
        id:[res.id],
        validFrom:[this.datepipe.transform(res.validFrom, 'yyyy-MM-dd')],
        validTo:[this.datepipe.transform(res.validTo, 'yyyy-MM-dd')],
        price:[res.price],
        reference:[res.reference],
        salesman:[res.salesman],
        rentalDevices:[res.rentalDevices]
      })
    })



  }
  update(){
    this.rentalcontractservice.updateRentalContract(this.rentalContractForm.value).subscribe(res=>{
      console.log(res);
      this.router.navigate(['/control-panel/rental-contract/list'])
    })
  }

  getValue(event: any){

    console.log(new Date(event.value.toDate()))
  }
}
