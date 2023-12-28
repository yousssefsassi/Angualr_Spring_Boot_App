import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadeinDeviceDetailsSummaryComponent } from './readein-device-details-summary.component';

describe('ReadeinDeviceDetailsSummaryComponent', () => {
  let component: ReadeinDeviceDetailsSummaryComponent;
  let fixture: ComponentFixture<ReadeinDeviceDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadeinDeviceDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReadeinDeviceDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
