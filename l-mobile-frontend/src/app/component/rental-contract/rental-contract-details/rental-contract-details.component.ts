import { Component } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { RentalContractDeleteConfirmationComponent } from '../rental-contract-delete-confirmation/rental-contract-delete-confirmation.component';
import { RentalContractService } from '../../layout/service/rental-contract.service';

@Component({
  selector: 'app-rental-contract-details',
  templateUrl: './rental-contract-details.component.html',
  styleUrls: ['./rental-contract-details.component.css']
})
export class RentalContractDetailsComponent {

	rentalContract:any;
	constructor(private modalService: NgbModal, private rentalcontractservice: RentalContractService) {}
  ngOnInit(): void {
    this.rentalcontractservice.getRentalById(localStorage.getItem('rentalContractId')).subscribe(res=>{
      this.rentalContract=res;
    })
  }
	openModal(rentalContractId: string) {
		const modalRef = this.modalService.open(RentalContractDeleteConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = rentalContractId;
	}
}
