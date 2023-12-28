import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ENVIRONMENT } from 'src/environments/environment';

export const API_URL = `${ENVIRONMENT.BASE_URL}/v1/service/rental-contract`;
export const API_URL_UPDATE = `${ENVIRONMENT.BASE_URL}/v1/service/rental-contract/update`;

export const API_URLGET = `${ENVIRONMENT.BASE_URL}/v1/service/rental-contract/all`;

@Injectable({
  providedIn: 'root'
})
export class RentalContractService {

  constructor(private httpClient: HttpClient, private router: Router) { }

  addRentalContract(rentalContract: any): Observable<any> {
    return this.httpClient.post<any>(`${API_URL}`, rentalContract);
  }
  updateRentalContract(rentalContract: any): Observable<any> {
    return this.httpClient.post<any>(`${API_URL_UPDATE}`, rentalContract);
  }
  getListRentalContract(): Observable<any[]> {
    return this.httpClient.get<any[]>(`${API_URLGET}`);
  }

  getRentalById(id:any): Observable<any> {
    return this.httpClient.get<any>(API_URL+'/'+id);
  }

  deleteRentalById(id:any): Observable<any> {
    return this.httpClient.delete<any>(API_URL+'/'+id);
  }
}


