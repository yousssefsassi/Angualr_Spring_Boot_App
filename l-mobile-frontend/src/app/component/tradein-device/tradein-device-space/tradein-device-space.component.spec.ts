import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinDeviceSpaceComponent } from './tradein-device-space.component';

describe('TradeinDeviceSpaceComponent', () => {
  let component: TradeinDeviceSpaceComponent;
  let fixture: ComponentFixture<TradeinDeviceSpaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinDeviceSpaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinDeviceSpaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
