import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RentalDeviceService } from 'src/app/service/rental-device.service';

@Component({
  selector: 'app-rental-device-list',
  templateUrl: './rental-device-list.component.html',
  styleUrls: ['./rental-device-list.component.css']
})
export class RentalDeviceListComponent implements OnInit{
  listRental:any[]=[];
  constructor(private renteldviseService: RentalDeviceService, private router: Router){

  }

  ngOnInit(): void {
    this.renteldviseService.getListRentalDevice().subscribe(res=>{
      this.listRental=res;
    })
  }

  goToDetail(id: any){
    localStorage.setItem('rentalDeviceId',id);
    this.router.navigate(['/control-panel/rental-device/details']);
  }

  goToEdit(id: any){
    localStorage.setItem('rentalDeviceId',id);
    this.router.navigate(['/control-panel/rental-device/edit']);
  }

  delete(id: any){
    this.renteldviseService.deleteRentalById(id).subscribe(res=>{
      this.ngOnInit();
    })
  }

}
