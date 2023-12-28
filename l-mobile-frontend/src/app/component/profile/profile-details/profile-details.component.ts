import { Component } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { ProfileStatusChangeConfirmationComponent } from '../profile-status-change-confirmation/profile-status-change-confirmation.component';
import { ProfileDeleteConfirmationComponent } from '../profile-delete-confirmation/profile-delete-confirmation.component';

@Component({
  selector: 'app-profile-details',
  templateUrl: './profile-details.component.html',
  styleUrls: ['./profile-details.component.css']
})
export class ProfileDetailsComponent {

	constructor(private modalService: NgbModal) {}
	
	openProfileStatusChangeModal(profileId: string) {
		const modalRef = this.modalService.open(ProfileStatusChangeConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = profileId;
	}
	
	openProfileDeleteModal(profileId: string) {
		const modalRef = this.modalService.open(ProfileDeleteConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = profileId;
	}
}
