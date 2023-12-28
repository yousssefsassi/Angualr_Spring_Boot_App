import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StockDeviceListComponent } from './stock-device-list.component';

describe('StockDeviceListComponent', () => {
  let component: StockDeviceListComponent;
  let fixture: ComponentFixture<StockDeviceListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StockDeviceListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StockDeviceListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
