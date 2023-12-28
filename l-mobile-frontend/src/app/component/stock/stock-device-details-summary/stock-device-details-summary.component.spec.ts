import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StockDeviceDetailsSummaryComponent } from './stock-device-details-summary.component';

describe('StockDeviceDetailsSummaryComponent', () => {
  let component: StockDeviceDetailsSummaryComponent;
  let fixture: ComponentFixture<StockDeviceDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StockDeviceDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StockDeviceDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
