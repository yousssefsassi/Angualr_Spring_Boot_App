import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './security/component/login/login.component';
import { SignupComponent } from './security/component/signup/signup.component';
import { ControlPanelComponent } from './component/control-panel/control-panel.component';
import { DashboardComponent } from './component/dashboard/dashboard/dashboard.component';
import { RentalContractListComponent } from './component/rental-contract/rental-contract-list/rental-contract-list.component';
import { RentalDeviceListComponent } from './component/rental-device/rental-device-list/rental-device-list.component';
import { SaleListComponent } from './component/sales/sale-list/sale-list.component';
import { StockDeviceListComponent } from './component/stock/stock-device-list/stock-device-list.component';
import { TradeinContractListComponent } from './component/tradein-contract/tradein-contract-list/tradein-contract-list.component';
import { TradeinDeviceListComponent } from './component/tradein-device/tradein-device-list/tradein-device-list.component';
import { ProtectedComponent } from './zz-remove/component/protected/protected.component';
import { TestComponent } from './zz-remove/component/test/test.component';
import { RentalDeviceSpaceComponent } from './component/rental-device/rental-device-space/rental-device-space.component';
import { RentalDeviceDetailsComponent } from './component/rental-device/rental-device-details/rental-device-details.component';
import { RentalDeviceAddComponent } from './component/rental-device/rental-device-add/rental-device-add.component';
import { RentalDeviceEditComponent } from './component/rental-device/rental-device-edit/rental-device-edit.component';
import { TradeinDeviceAddComponent } from './component/tradein-device/tradein-device-add/tradein-device-add.component';
import { TradeinDeviceDetailsComponent } from './component/tradein-device/tradein-device-details/tradein-device-details.component';
import { TradeinDeviceEditComponent } from './component/tradein-device/tradein-device-edit/tradein-device-edit.component';
import { TradeinDeviceSpaceComponent } from './component/tradein-device/tradein-device-space/tradein-device-space.component';
import { RentalContractSpaceComponent } from './component/rental-contract/rental-contract-space/rental-contract-space.component';
import { RentalContractAddComponent } from './component/rental-contract/rental-contract-add/rental-contract-add.component';
import { RentalContractDetailsComponent } from './component/rental-contract/rental-contract-details/rental-contract-details.component';
import { RentalContractEditComponent } from './component/rental-contract/rental-contract-edit/rental-contract-edit.component';
import { TradeinContractSpaceComponent } from './component/tradein-contract/tradein-contract-space/tradein-contract-space.component';
import { TradeinContractAddComponent } from './component/tradein-contract/tradein-contract-add/tradein-contract-add.component';
import { TradeinContractDetailsComponent } from './component/tradein-contract/tradein-contract-details/tradein-contract-details.component';
import { TradeinContractEditComponent } from './component/tradein-contract/tradein-contract-edit/tradein-contract-edit.component';
import { HomeComponent } from './component/company-info/home/home.component';
import { WelcomeComponent } from './component/company-info/welcome/welcome.component';
import { ContactComponent } from './component/company-info/contact/contact.component';
import { AboutComponent } from './component/company-info/about/about.component';
import { ProfileSpaceComponent } from './component/profile/profile-space/profile-space.component';
import { ProfilePasswordEditComponent } from './component/profile/profile-password-edit/profile-password-edit.component';
import { ProfileListComponent } from './component/profile/profile-list/profile-list.component';
import { ProfileDetailsComponent } from './component/profile/profile-details/profile-details.component';
import { ProfileEditComponent } from './component/profile/profile-edit/profile-edit.component';
import { ProfileLoginEditComponent } from './component/profile/profile-login-edit/profile-login-edit.component';
import { ProfileComponent } from './shared/component/profile/profile.component';

const routes: Routes = [
  { path: 'signup', component: SignupComponent },
  { path: '', component: LoginComponent },

  { path: 'home', component: WelcomeComponent , children:[

  ]},
  { path: 'about', component: AboutComponent },

  { path: 'contact', component: ContactComponent },

  { path: 'home11', component: HomeComponent },

  { path: 'test', component: TestComponent },

  { path: 'control-panel', redirectTo: '/control-panel/dashboard', pathMatch: 'full' },
  { path: 'control-panel/rental-device', redirectTo: 'control-panel/rental-device/list', pathMatch: 'full' },
  { path: 'control-panel/rental-contract', redirectTo: 'control-panel/rental-contract/list', pathMatch: 'full' },
  { path: 'control-panel/tradein-device', redirectTo: 'control-panel/tradein-device/list', pathMatch: 'full' },
  { path: 'control-panel/tradein-contract', redirectTo: 'control-panel/tradein-contract/list', pathMatch: 'full' },

  {
    path: 'control-panel', component: ControlPanelComponent, children: [
      {path:'updateProfile', component:ProfileComponent},
      {

        path: 'profile', component: ProfileSpaceComponent, children: [
          { path: 'list', component: ProfileListComponent },
          { path: 'details', component: ProfileDetailsComponent },
          { path: 'edit', component: ProfileEditComponent },
          { path: 'login/edit', component: ProfileLoginEditComponent },
          { path: 'password/edit', component: ProfilePasswordEditComponent }
        ]
      },
      { path: 'dashboard', component: DashboardComponent },
      {
        path: 'rental-device', component: RentalDeviceSpaceComponent, children: [
          { path: 'add', component: RentalDeviceAddComponent },
          { path: 'list', component: RentalDeviceListComponent },
          { path: 'details', component: RentalDeviceDetailsComponent },
          { path: 'edit', component: RentalDeviceEditComponent }
        ]
      },
      {
        path: 'rental-contract', component: RentalContractSpaceComponent, children: [
          { path: 'add', component: RentalContractAddComponent },
          { path: 'list', component: RentalContractListComponent },
          { path: 'details', component: RentalContractDetailsComponent },
          { path: 'edit', component: RentalContractEditComponent }
        ]
      },
      {
        path: 'tradein-device', component: TradeinDeviceSpaceComponent, children: [
          { path: 'add', component: TradeinDeviceAddComponent },
          { path: 'list', component: TradeinDeviceListComponent },
          { path: 'details', component: TradeinDeviceDetailsComponent },
          { path: 'edit', component: TradeinDeviceEditComponent }
        ]
      },
      {
        path: 'tradein-contract', component: TradeinContractSpaceComponent, children: [
          { path: 'add', component: TradeinContractAddComponent },
          { path: 'list', component: TradeinContractListComponent },
          { path: 'details', component: TradeinContractDetailsComponent },
          { path: 'edit', component: TradeinContractEditComponent }
        ]
      },
      { path: 'stock', component: StockDeviceListComponent },
      { path: 'sales', component: SaleListComponent }
    ]
  },

  { path: 'protected', component: ProtectedComponent },
  { path: 'test', component: TestComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
