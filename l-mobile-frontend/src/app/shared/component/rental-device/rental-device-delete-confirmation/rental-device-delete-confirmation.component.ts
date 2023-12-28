import { Component, Input } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-rental-device-delete-confirmation',
  templateUrl: './rental-device-delete-confirmation.component.html',
  styleUrls: ['./rental-device-delete-confirmation.component.css']
})
export class RentalDeviceDeleteConfirmationComponent {

	@Input() id: string | undefined;

	constructor(private modalService: NgbModal) {}

	closeModal(action: string) {
    console.log('modal action');
    console.log(action);
		this.modalService.dismissAll();
	}
}
