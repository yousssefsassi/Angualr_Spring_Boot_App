import { Component, Input } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-tradein-device-delete-confirmation',
  templateUrl: './tradein-device-delete-confirmation.component.html',
  styleUrls: ['./tradein-device-delete-confirmation.component.css']
})
export class TradeinDeviceDeleteConfirmationComponent {

	@Input() id: string | undefined;

	constructor(private modalService: NgbModal) {}

	closeModal(action: string) {
    console.log('modal action');
    console.log(action);
		this.modalService.dismissAll();
	}
}
