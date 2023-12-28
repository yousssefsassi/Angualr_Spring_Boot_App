import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalDeviceDetailsSummaryComponent } from './rental-device-details-summary.component';

describe('RentalDeviceDetailsSummaryComponent', () => {
  let component: RentalDeviceDetailsSummaryComponent;
  let fixture: ComponentFixture<RentalDeviceDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalDeviceDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalDeviceDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
