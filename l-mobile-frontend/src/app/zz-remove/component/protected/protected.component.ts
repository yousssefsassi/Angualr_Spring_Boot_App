import { Component } from '@angular/core';
import { AuthService } from '../../../security/service/auth.service';
import { RoleList } from '../../../shared/constant/role-list';

@Component({
  selector: 'app-protected',
  templateUrl: './protected.component.html',
  styleUrls: ['./protected.component.css']
})
export class ProtectedComponent {

  readonly roleList = RoleList;

  constructor(private authService: AuthService) {
    console.log('authService.getLoggedInUser()');
    console.log(authService.getLoggedInUser());
  }
}
