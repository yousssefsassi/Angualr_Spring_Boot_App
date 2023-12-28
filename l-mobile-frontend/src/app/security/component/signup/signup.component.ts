import { Component, OnInit } from '@angular/core';
import { LoggedInUser } from '../../model/logged-in-user.model';
import { RegistrationInfo } from '../../model/registration-info.model';
import { AuthService } from '../../service/auth.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  registrationInfo: RegistrationInfo;
  userRoleNameList = ["ADMIN", "SALESMAN"];
  registrationMessage = '';
  showRegistrationMessage = false;

  constructor(private authService: AuthService,private formBuilder: FormBuilder) {
    this.registrationInfo = {
      firstName: '',
      lastName: '',
      email: '',
      password: '',
      roleSetName: this.userRoleNameList[1]
    }
  }

  ngOnInit(): void {
  }

  onSignUp() {
    console.log('registrationInfo');
    console.log(this.registrationInfo);

    this.authService.register(this.registrationInfo).subscribe(res=>{
      console.log(res);
      this.registrationMessage = 'Registered with success!';
      this.showRegistrationMessage = true;

      setTimeout(() => {
        this.showRegistrationMessage = false;
      }, 3000);

    },

    );
  }


  onSelectAccountType(event: Event) {
    if ((event.target as HTMLInputElement).checked) {
      this.registrationInfo.roleSetName = (event.target as HTMLInputElement).value;
    }
  }
}
