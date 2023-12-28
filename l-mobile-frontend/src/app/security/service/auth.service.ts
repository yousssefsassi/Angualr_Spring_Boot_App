import { Injectable } from '@angular/core';
import { ENVIRONMENT } from '../../../environments/environment';
import { RegistrationInfo } from '../model/registration-info.model';
import { HttpClient } from '@angular/common/http';
import { Observable, tap } from 'rxjs';
import { Credentials } from '../model/credentials.model';
import { LoggedInUser } from '../model/logged-in-user.model';
import { Router } from '@angular/router';
import { LocalStorageObjectNameList } from '../../shared/constant/local-storage-object-name-list';
import { RoleSetNameList } from '../../shared/constant/role-set-name-list';


export const API_URL = `${ENVIRONMENT.BASE_URL}/v1/service/auth`;

export const API_URLSALESMAN = `${ENVIRONMENT.BASE_URL}/v1/service/salesman`;


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private httpClient: HttpClient, private router: Router) { }
  updatesalesman(registrationInfo: any): Observable<any> {
    return this.httpClient.post<any>(API_URLSALESMAN+'/update', registrationInfo);
  }

  getsalesman(email: any): Observable<any> {
    return this.httpClient.get<any>(API_URLSALESMAN+'/byemail/'+email);
  }
  register(registrationInfo: RegistrationInfo): Observable<any> {
    return this.httpClient.post<any>(`${API_URL}/register`, registrationInfo);
  }

  authenticate(credentials: Credentials): Observable<LoggedInUser> {
    return this.httpClient.post<LoggedInUser>(`${API_URL}/authenticate`, credentials).pipe(
      tap((loggedInUser: LoggedInUser) => {
        localStorage.setItem(LocalStorageObjectNameList.LOGGED_IN_USER, JSON.stringify(loggedInUser));
        switch (loggedInUser.accountType) {
          case RoleSetNameList.ADMIN:
            this.router.navigate(['admin']); // navigate(['admin', 'home']);
            break;
          case RoleSetNameList.SALESMAN:
            this.router.navigate(['salesman']);
            break;
          default:
            console.error('Unsupported account type!');
        }
      })
    );
  }

  getLoggedInUser(): LoggedInUser {
    return JSON.parse(localStorage.getItem(LocalStorageObjectNameList.LOGGED_IN_USER)!) as LoggedInUser;
  }

  authentificateUser(credentials: any): Observable<any> {

  return this.httpClient.post<any>(`${API_URL}/authenticate`, credentials);
  }




}
