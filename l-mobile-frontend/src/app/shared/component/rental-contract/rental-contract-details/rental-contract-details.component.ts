import { Component } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { RentalContractDeleteConfirmationComponent } from '../rental-contract-delete-confirmation/rental-contract-delete-confirmation.component';

@Component({
  selector: 'app-rental-contract-details',
  templateUrl: './rental-contract-details.component.html',
  styleUrls: ['./rental-contract-details.component.css']
})
export class RentalContractDetailsComponent {

	constructor(private modalService: NgbModal) {}

	openModal(rentalContractId: string) {
		const modalRef = this.modalService.open(RentalContractDeleteConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = rentalContractId;
	}
}
