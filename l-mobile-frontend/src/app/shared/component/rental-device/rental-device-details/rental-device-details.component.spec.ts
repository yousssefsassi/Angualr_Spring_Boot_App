import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalDeviceDetailsComponent } from './rental-device-details.component';

describe('RentalDeviceDetailsComponent', () => {
  let component: RentalDeviceDetailsComponent;
  let fixture: ComponentFixture<RentalDeviceDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalDeviceDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalDeviceDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
