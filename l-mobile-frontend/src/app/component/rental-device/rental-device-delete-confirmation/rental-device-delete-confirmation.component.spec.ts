import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalDeviceDeleteConfirmationComponent } from './rental-device-delete-confirmation.component';

describe('RentalDeviceDeleteConfirmationComponent', () => {
  let component: RentalDeviceDeleteConfirmationComponent;
  let fixture: ComponentFixture<RentalDeviceDeleteConfirmationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalDeviceDeleteConfirmationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalDeviceDeleteConfirmationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
