import { Component, Input } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-tradein-contract-delete-confirmation',
  templateUrl: './tradein-contract-delete-confirmation.component.html',
  styleUrls: ['./tradein-contract-delete-confirmation.component.css']
})
export class TradeinContractDeleteConfirmationComponent {

	@Input() id: string | undefined;

	constructor(private modalService: NgbModal) {}

	closeModal(action: string) {
    console.log('modal action');
    console.log(action);
		this.modalService.dismissAll();
	}
}
