import { Component, Input } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-profile-status-change-confirmation',
  templateUrl: './profile-status-change-confirmation.component.html',
  styleUrls: ['./profile-status-change-confirmation.component.css']
})
export class ProfileStatusChangeConfirmationComponent {

	@Input() id: string | undefined;

	constructor(private modalService: NgbModal) {}

	closeModal(action: string) {
    console.log('modal action');
    console.log(action);
		this.modalService.dismissAll();
	}
}
