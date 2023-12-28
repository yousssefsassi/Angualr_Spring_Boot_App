import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinDeviceDetailsComponent } from './tradein-device-details.component';

describe('TradeinDeviceDetailsComponent', () => {
  let component: TradeinDeviceDetailsComponent;
  let fixture: ComponentFixture<TradeinDeviceDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinDeviceDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinDeviceDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
