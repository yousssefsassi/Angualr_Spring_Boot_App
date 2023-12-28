import { Component, ViewEncapsulation } from '@angular/core';
import { TradeinDeviceDeleteConfirmationComponent } from '../tradein-device-delete-confirmation/tradein-device-delete-confirmation.component';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-tradein-device-details',
  templateUrl: './tradein-device-details.component.html',
  styleUrls: ['./tradein-device-details.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class TradeinDeviceDetailsComponent {

	constructor(private modalService: NgbModal) {}

	openModal(tradeinDeviceId: string) {
		const modalRef = this.modalService.open(TradeinDeviceDeleteConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = tradeinDeviceId;
	}
}
