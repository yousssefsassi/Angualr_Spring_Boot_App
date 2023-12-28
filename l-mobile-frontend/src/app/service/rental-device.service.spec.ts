import { TestBed } from '@angular/core/testing';

import { RentalDeviceService } from './rental-device.service';

describe('RentalDeviceService', () => {
  let service: RentalDeviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RentalDeviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
