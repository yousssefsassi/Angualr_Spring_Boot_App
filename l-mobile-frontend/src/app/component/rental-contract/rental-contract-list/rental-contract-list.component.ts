import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RentalContractService } from '../../layout/service/rental-contract.service';
@Component({
  selector: 'app-rental-contract-list',
  templateUrl: './rental-contract-list.component.html',
  styleUrls: ['./rental-contract-list.component.css']
})
export class RentalContractListComponent implements OnInit {

  listRental:any[]=[];
  constructor(private rentalcontractservice: RentalContractService, private router: Router){

  }

  ngOnInit(): void {
    this.rentalcontractservice.getListRentalContract().subscribe(res=>{
      this.listRental=res;
    })
  }
  goToDetail(id: any){
    localStorage.setItem('rentalContractId',id);
    this.router.navigate(['/control-panel/rental-contract/details']);
  }

  goToEdit(id: any){
    localStorage.setItem('rentalContractId',id);
    this.router.navigate(['/control-panel/rental-contract/edit']);
  }

  delete(id: any){
    this.rentalcontractservice.deleteRentalById(id).subscribe(res=>{
      this.ngOnInit();
    })
  }


}
