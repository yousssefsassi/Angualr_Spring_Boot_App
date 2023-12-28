import { Component } from '@angular/core';
import { TradeinContractDeleteConfirmationComponent } from '../tradein-contract-delete-confirmation/tradein-contract-delete-confirmation.component';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-tradein-contract-details',
  templateUrl: './tradein-contract-details.component.html',
  styleUrls: ['./tradein-contract-details.component.css']
})
export class TradeinContractDetailsComponent {

	constructor(private modalService: NgbModal) {}

	openModal(tradeinContractId: string) {
		const modalRef = this.modalService.open(TradeinContractDeleteConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = tradeinContractId;
	}
}
