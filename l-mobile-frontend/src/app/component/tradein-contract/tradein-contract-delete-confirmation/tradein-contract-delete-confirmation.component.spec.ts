import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinContractDeleteConfirmationComponent } from './tradein-contract-delete-confirmation.component';

describe('TradeinContractDeleteConfirmationComponent', () => {
  let component: TradeinContractDeleteConfirmationComponent;
  let fixture: ComponentFixture<TradeinContractDeleteConfirmationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinContractDeleteConfirmationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinContractDeleteConfirmationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
