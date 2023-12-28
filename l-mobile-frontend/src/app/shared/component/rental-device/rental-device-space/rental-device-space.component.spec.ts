import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalDeviceSpaceComponent } from './rental-device-space.component';

describe('RentalDeviceSpaceComponent', () => {
  let component: RentalDeviceSpaceComponent;
  let fixture: ComponentFixture<RentalDeviceSpaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalDeviceSpaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalDeviceSpaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
