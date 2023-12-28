import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalDeviceEditComponent } from './rental-device-edit.component';

describe('RentalDeviceEditComponent', () => {
  let component: RentalDeviceEditComponent;
  let fixture: ComponentFixture<RentalDeviceEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalDeviceEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalDeviceEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
