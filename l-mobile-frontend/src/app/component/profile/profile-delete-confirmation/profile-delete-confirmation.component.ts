import { Component, Input } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-profile-delete-confirmation',
  templateUrl: './profile-delete-confirmation.component.html',
  styleUrls: ['./profile-delete-confirmation.component.css']
})
export class ProfileDeleteConfirmationComponent {

	@Input() id: string | undefined;

	constructor(private modalService: NgbModal) {}

	closeModal(action: string) {
    console.log('modal action');
    console.log(action);
		this.modalService.dismissAll();
	}
}
