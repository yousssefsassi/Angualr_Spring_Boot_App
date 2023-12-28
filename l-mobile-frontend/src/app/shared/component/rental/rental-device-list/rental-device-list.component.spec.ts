import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalDeviceListComponent } from './rental-device-list.component';

describe('RentalDeviceListComponent', () => {
  let component: RentalDeviceListComponent;
  let fixture: ComponentFixture<RentalDeviceListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalDeviceListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalDeviceListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
