import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinContractDetailsSummaryComponent } from './tradein-contract-details-summary.component';

describe('TradeinContractDetailsSummaryComponent', () => {
  let component: TradeinContractDetailsSummaryComponent;
  let fixture: ComponentFixture<TradeinContractDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinContractDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinContractDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
