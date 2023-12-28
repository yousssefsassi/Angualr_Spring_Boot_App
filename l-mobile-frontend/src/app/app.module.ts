import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { LoginComponent } from './security/component/login/login.component';
import { SignupComponent } from './security/component/signup/signup.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ProtectedComponent } from './zz-remove/component/protected/protected.component';
import { TestComponent } from './zz-remove/component/test/test.component';
import { HeaderComponent } from './component/layout/header/header.component';
import { VerticalMenuComponent } from './component/layout/vertical-menu/vertical-menu.component';
import { MainAreaComponent } from './component/layout/main-area/main-area.component';
import { RentalDeviceListComponent } from './component/rental-device/rental-device-list/rental-device-list.component';
import { RentalContractListComponent } from './component/rental-contract/rental-contract-list/rental-contract-list.component';
import { TradeinDeviceListComponent } from './component/tradein-device/tradein-device-list/tradein-device-list.component';
import { TradeinContractListComponent } from './component/tradein-contract/tradein-contract-list/tradein-contract-list.component';
import { DashboardComponent } from './component/dashboard/dashboard/dashboard.component';
import { ControlPanelComponent } from './component/control-panel/control-panel.component';
import { RentalContractDetailsSummaryComponent } from './component/rental-contract/rental-contract-details-summary/rental-contract-details-summary.component';
import { RentalDeviceDetailsSummaryComponent } from './component/rental-device/rental-device-details-summary/rental-device-details-summary.component';
import { ChartComponent } from './component/dashboard/chart/chart.component';
import { StockDeviceListComponent } from './component/stock/stock-device-list/stock-device-list.component';
import { StockDeviceDetailsSummaryComponent } from './component/stock/stock-device-details-summary/stock-device-details-summary.component';
import { SaleListComponent } from './component/sales/sale-list/sale-list.component';
import { SaleDetailsSummaryComponent } from './component/sales/sale-details-summary/sale-details-summary.component';
import { RentalDeviceSpaceComponent } from './component/rental-device/rental-device-space/rental-device-space.component';
import { RentalDeviceAddComponent } from './component/rental-device/rental-device-add/rental-device-add.component';
import { RentalDeviceEditComponent } from './component/rental-device/rental-device-edit/rental-device-edit.component';
import { RentalDeviceDetailsComponent } from './component/rental-device/rental-device-details/rental-device-details.component';
import { RentalDeviceDeleteConfirmationComponent } from './component/rental-device/rental-device-delete-confirmation/rental-device-delete-confirmation.component';
import { FooterComponent } from './component/layout/footer/footer.component';
import { TradeinDeviceAddComponent } from './component/tradein-device/tradein-device-add/tradein-device-add.component';
import { TradeinDeviceDetailsComponent } from './component/tradein-device/tradein-device-details/tradein-device-details.component';
import { TradeinDeviceEditComponent } from './component/tradein-device/tradein-device-edit/tradein-device-edit.component';
import { TradeinDeviceDeleteConfirmationComponent } from './component/tradein-device/tradein-device-delete-confirmation/tradein-device-delete-confirmation.component';
import { TradeinDeviceSpaceComponent } from './component/tradein-device/tradein-device-space/tradein-device-space.component';
import { TradeinDeviceDetailsSummaryComponent } from './component/tradein-device/tradein-device-details-summary/tradein-device-details-summary.component';
import { RentalContractAddComponent } from './component/rental-contract/rental-contract-add/rental-contract-add.component';
import { RentalContractEditComponent } from './component/rental-contract/rental-contract-edit/rental-contract-edit.component';
import { RentalContractDetailsComponent } from './component/rental-contract/rental-contract-details/rental-contract-details.component';
import { RentalContractDeleteConfirmationComponent } from './component/rental-contract/rental-contract-delete-confirmation/rental-contract-delete-confirmation.component';
import { RentalContractSpaceComponent } from './component/rental-contract/rental-contract-space/rental-contract-space.component';
import { TradeinContractSpaceComponent } from './component/tradein-contract/tradein-contract-space/tradein-contract-space.component';
import { TradeinContractDetailsComponent } from './component/tradein-contract/tradein-contract-details/tradein-contract-details.component';
import { TradeinContractAddComponent } from './component/tradein-contract/tradein-contract-add/tradein-contract-add.component';
import { TradeinContractEditComponent } from './component/tradein-contract/tradein-contract-edit/tradein-contract-edit.component';
import { TradeinContractDeleteConfirmationComponent } from './component/tradein-contract/tradein-contract-delete-confirmation/tradein-contract-delete-confirmation.component';
import { TradeinContractDetailsSummaryComponent } from './component/tradein-contract/tradein-contract-details-summary/tradein-contract-details-summary.component';
import { WelcomeComponent } from './component/company-info/welcome/welcome.component';
import { ContactComponent } from './component/company-info/contact/contact.component';
import { AboutComponent } from './component/company-info/about/about.component';
import { HomeComponent } from './component/company-info/home/home.component';
import { ProfileSpaceComponent } from './component/profile/profile-space/profile-space.component';
import { ProfileDetailsComponent } from './component/profile/profile-details/profile-details.component';
import { ProfileDetailsSummaryComponent } from './component/profile/profile-details-summary/profile-details-summary.component';
import { ProfileListComponent } from './component/profile/profile-list/profile-list.component';
import { ProfileEditComponent } from './component/profile/profile-edit/profile-edit.component';
import { ProfileDeleteConfirmationComponent } from './component/profile/profile-delete-confirmation/profile-delete-confirmation.component';
import { ProfileLoginEditComponent } from './component/profile/profile-login-edit/profile-login-edit.component';
import { ProfilePasswordEditComponent } from './component/profile/profile-password-edit/profile-password-edit.component';
import { ProfileStatusChangeConfirmationComponent } from './component/profile/profile-status-change-confirmation/profile-status-change-confirmation.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import {MatSelectModule} from '@angular/material/select';
import { ProfileComponent } from './shared/component/profile/profile.component';
import { CanvasJSAngularChartsModule } from '@canvasjs/angular-charts';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    ProtectedComponent,
    TestComponent,
    HeaderComponent,
    VerticalMenuComponent,
    MainAreaComponent,
    RentalDeviceListComponent,
    RentalContractListComponent,
    ProfileComponent,
    TradeinDeviceListComponent,
    TradeinContractListComponent,
    DashboardComponent,
    ControlPanelComponent,
    RentalContractDetailsSummaryComponent,
    RentalDeviceDetailsSummaryComponent,
    ChartComponent,
    StockDeviceListComponent,
    StockDeviceDetailsSummaryComponent,
    SaleListComponent,
    SaleDetailsSummaryComponent,
    RentalDeviceSpaceComponent,
    RentalDeviceAddComponent,
    RentalDeviceEditComponent,
    RentalDeviceDetailsComponent,
    RentalDeviceDeleteConfirmationComponent,
    FooterComponent,
    TradeinDeviceAddComponent,
    TradeinDeviceDetailsComponent,
    TradeinDeviceEditComponent,
    TradeinDeviceDeleteConfirmationComponent,
    TradeinDeviceSpaceComponent,
    TradeinDeviceDetailsSummaryComponent,
    RentalContractAddComponent,
    RentalContractEditComponent,
    RentalContractDetailsComponent,
    RentalContractDeleteConfirmationComponent,
    RentalContractSpaceComponent,
    TradeinContractSpaceComponent,
    TradeinContractDetailsComponent,
    TradeinContractAddComponent,
    TradeinContractEditComponent,
    TradeinContractDeleteConfirmationComponent,
    TradeinContractDetailsSummaryComponent,
    WelcomeComponent,
    ContactComponent,
    AboutComponent,
    HomeComponent,
    ProfileSpaceComponent,
    ProfileDetailsComponent,
    ProfileDetailsSummaryComponent,
    ProfileListComponent,
    ProfileEditComponent,
    ProfileDeleteConfirmationComponent,
    ProfileLoginEditComponent,
    ProfilePasswordEditComponent,
    ProfileStatusChangeConfirmationComponent,

  ],
  imports: [
    RouterModule,
    MatSnackBarModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatSelectModule,
    CanvasJSAngularChartsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
