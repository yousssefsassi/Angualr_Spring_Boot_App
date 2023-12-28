import { Component, ViewEncapsulation,OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { RentalDeviceDeleteConfirmationComponent } from '../rental-device-delete-confirmation/rental-device-delete-confirmation.component';
import { RentalDeviceService } from 'src/app/service/rental-device.service';

@Component({
  selector: 'app-rental-device-details',
  templateUrl: './rental-device-details.component.html',
  styleUrls: ['./rental-device-details.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class RentalDeviceDetailsComponent implements OnInit{

  rentalDevice:any;
	constructor(private modalService: NgbModal, private rentalDeviceService: RentalDeviceService) {}
  ngOnInit(): void {
    this.rentalDeviceService.getRentalById(localStorage.getItem('rentalDeviceId')).subscribe(res=>{
      this.rentalDevice=res;
    })
  }

	openModal(rentalDeviceId: string) {
		const modalRef = this.modalService.open(RentalDeviceDeleteConfirmationComponent, { modalDialogClass: "custom-modal-dialog" });
		modalRef.componentInstance.id = rentalDeviceId;
	}
}
