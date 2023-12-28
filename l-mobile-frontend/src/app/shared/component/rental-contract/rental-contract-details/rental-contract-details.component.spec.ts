import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalContractDetailsComponent } from './rental-contract-details.component';

describe('RentalContractDetailsComponent', () => {
  let component: RentalContractDetailsComponent;
  let fixture: ComponentFixture<RentalContractDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalContractDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalContractDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
