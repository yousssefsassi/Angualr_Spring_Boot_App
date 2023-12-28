import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalContractDeleteConfirmationComponent } from './rental-contract-delete-confirmation.component';

describe('RentalContractDeleteConfirmationComponent', () => {
  let component: RentalContractDeleteConfirmationComponent;
  let fixture: ComponentFixture<RentalContractDeleteConfirmationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalContractDeleteConfirmationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalContractDeleteConfirmationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
