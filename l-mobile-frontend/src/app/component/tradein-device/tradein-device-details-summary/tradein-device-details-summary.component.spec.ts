import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinDeviceDetailsSummaryComponent } from './tradein-device-details-summary.component';

describe('TradeinDeviceDetailsSummaryComponent', () => {
  let component: TradeinDeviceDetailsSummaryComponent;
  let fixture: ComponentFixture<TradeinDeviceDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinDeviceDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinDeviceDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
