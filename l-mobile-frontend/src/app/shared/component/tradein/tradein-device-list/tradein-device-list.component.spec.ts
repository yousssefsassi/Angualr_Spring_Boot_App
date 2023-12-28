import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinDeviceListComponent } from './tradein-device-list.component';

describe('TradeinDeviceListComponent', () => {
  let component: TradeinDeviceListComponent;
  let fixture: ComponentFixture<TradeinDeviceListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinDeviceListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinDeviceListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
