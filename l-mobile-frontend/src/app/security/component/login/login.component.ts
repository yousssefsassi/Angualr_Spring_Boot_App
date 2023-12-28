import { Component } from '@angular/core';
import { Credentials } from '../../model/credentials.model';
import { LoggedInUser } from '../../model/logged-in-user.model';
import { AuthService } from '../../service/auth.service';
import { JWT_OPTIONS, JwtHelperService } from '@auth0/angular-jwt';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers:[{provide: JWT_OPTIONS , useValue: JWT_OPTIONS}, JwtHelperService]
})
export class LoginComponent {
  loginMessage = '';
  showLoginMessage = false;
  credentials: Credentials;

  constructor(private authService: AuthService, private jwtHelper: JwtHelperService, private router:Router) {
    this.credentials = { email: '', password: '' };
    localStorage.clear();
  }

  onLogin() {
    console.log('credentials');
    console.log(this.credentials);
    this.authService.authentificateUser(this.credentials).subscribe(res=>{
      localStorage.setItem('username',this.jwtHelper.decodeToken(res.accessToken).sub);
      localStorage.setItem('role',this.jwtHelper.decodeToken(res.accessToken).authorities[0].authority);

      let role = this.jwtHelper.decodeToken(res.accessToken).authorities[0].authority;
      if (role=='ROLE_SALESMAN'){
        this.router.navigate(['/home']);
      } else {
        this.router.navigate(['/control-panel/dashboard']);
      }

    });
    this.loginMessage = 'Login with success!';
    this.showLoginMessage = true;

    setTimeout(() => {
      this.showLoginMessage = false;
    }, 3000);
  }
}
