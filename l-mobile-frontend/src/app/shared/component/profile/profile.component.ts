import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RegistrationInfo } from 'src/app/security/model/registration-info.model';
import { AuthService } from 'src/app/security/service/auth.service';
@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  registrationInfo: FormGroup;
  userRoleNameList = ["ADMIN", "SALESMAN"];

  constructor(private authService: AuthService , private builder:FormBuilder) {
    this.registrationInfo = this.builder.group({
      id:[],
      firstName: [],
      lastName:  [],
      email:  [],
      password:  [],
      roleList: []
    })
  }

  ngOnInit(): void {
    this.authService.getsalesman(localStorage.getItem('username')).subscribe(res=>{
      this.registrationInfo =  this.builder.group({
        id:[res.id],
        firstName: [res.firstName],
        lastName: [res.lastName],
        email: [res.email],
        password: [res.password],
        roleList: [res.roleList]
      })
    })
  }

  onSignUp() {
    console.log('registrationInfo');
    console.log(this.registrationInfo);
    this.authService.updatesalesman(this.registrationInfo.value).subscribe(res=>{
      console.log(res);
      localStorage.setItem('username',this.registrationInfo.get('email')!.value)
    })
  }

  onSelectAccountType(event: Event) {

  }
}
