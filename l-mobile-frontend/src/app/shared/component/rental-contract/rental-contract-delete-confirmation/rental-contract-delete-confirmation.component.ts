import { Component, Input } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-rental-contract-delete-confirmation',
  templateUrl: './rental-contract-delete-confirmation.component.html',
  styleUrls: ['./rental-contract-delete-confirmation.component.css']
})
export class RentalContractDeleteConfirmationComponent {

	@Input() id: string | undefined;

	constructor(private modalService: NgbModal) {}

	closeModal(action: string) {
    console.log('modal action');
    console.log(action);
		this.modalService.dismissAll();
	}
}
