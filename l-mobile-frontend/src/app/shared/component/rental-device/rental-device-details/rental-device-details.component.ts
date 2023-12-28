import { Component, ViewEncapsulation } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { RentalDeviceDeleteConfirmationComponent } from '../rental-device-delete-confirmation/rental-device-delete-confirmation.component';

@Component({
  selector: 'app-rental-device-details',
  templateUrl: './rental-device-details.component.html',
  styleUrls: ['./rental-device-details.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class RentalDeviceDetailsComponent {

	constructor(private modalService: NgbModal) {}

	openModal(rentalDeviceId: string) {
		const modalRef = this.modalService.open(RentalDeviceDeleteConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = rentalDeviceId;
	}
}
