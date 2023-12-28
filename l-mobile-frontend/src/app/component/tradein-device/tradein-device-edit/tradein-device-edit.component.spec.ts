import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinDeviceEditComponent } from './tradein-device-edit.component';

describe('TradeinDeviceEditComponent', () => {
  let component: TradeinDeviceEditComponent;
  let fixture: ComponentFixture<TradeinDeviceEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinDeviceEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinDeviceEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
