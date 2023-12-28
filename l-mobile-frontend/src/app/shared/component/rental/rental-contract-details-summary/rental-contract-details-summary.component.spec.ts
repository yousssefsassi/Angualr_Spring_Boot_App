import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalContractDetailsSummaryComponent } from './rental-contract-details-summary.component';

describe('RentalContractDetailsSummaryComponent', () => {
  let component: RentalContractDetailsSummaryComponent;
  let fixture: ComponentFixture<RentalContractDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalContractDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalContractDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
