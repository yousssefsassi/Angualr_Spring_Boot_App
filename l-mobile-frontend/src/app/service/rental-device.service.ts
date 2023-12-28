import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ENVIRONMENT } from 'src/environments/environment';
export const API_URL = `${ENVIRONMENT.BASE_URL}/v1/service/rental-device`;
export const API_URLGET = `${ENVIRONMENT.BASE_URL}/v1/service/rental-device/all`;

@Injectable({
  providedIn: 'root'
})
export class RentalDeviceService {

  constructor(private httpClient: HttpClient, private router: Router) { }

  addRentalDevice(rentalDevice: any): Observable<any> {
    return this.httpClient.post<any>(`${API_URL}`, rentalDevice);
  }

  getListRentalDevice(): Observable<any[]> {
    return this.httpClient.get<any[]>(`${API_URLGET}`);
  }

  getRentalById(id:any): Observable<any> {
    return this.httpClient.get<any>(API_URL+'/'+id);
  }

  deleteRentalById(id:any): Observable<any> {
    return this.httpClient.delete<any>(API_URL+'/'+id);
  }
}
