import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaleDetailsSummaryComponent } from './sale-details-summary.component';

describe('SaleDetailsSummaryComponent', () => {
  let component: SaleDetailsSummaryComponent;
  let fixture: ComponentFixture<SaleDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SaleDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SaleDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
