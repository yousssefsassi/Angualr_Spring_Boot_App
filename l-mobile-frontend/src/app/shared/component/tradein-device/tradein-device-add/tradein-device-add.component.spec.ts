import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinDeviceAddComponent } from './tradein-device-add.component';

describe('TradeinDeviceAddComponent', () => {
  let component: TradeinDeviceAddComponent;
  let fixture: ComponentFixture<TradeinDeviceAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinDeviceAddComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinDeviceAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
