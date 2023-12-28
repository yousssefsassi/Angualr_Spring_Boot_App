import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinDeviceDeleteConfirmationComponent } from './tradein-device-delete-confirmation.component';

describe('TradeinDeviceDeleteConfirmationComponent', () => {
  let component: TradeinDeviceDeleteConfirmationComponent;
  let fixture: ComponentFixture<TradeinDeviceDeleteConfirmationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinDeviceDeleteConfirmationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinDeviceDeleteConfirmationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
