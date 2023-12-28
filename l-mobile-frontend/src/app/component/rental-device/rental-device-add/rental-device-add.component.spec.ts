import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalDeviceAddComponent } from './rental-device-add.component';

describe('RentalDeviceAddComponent', () => {
  let component: RentalDeviceAddComponent;
  let fixture: ComponentFixture<RentalDeviceAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalDeviceAddComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalDeviceAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
