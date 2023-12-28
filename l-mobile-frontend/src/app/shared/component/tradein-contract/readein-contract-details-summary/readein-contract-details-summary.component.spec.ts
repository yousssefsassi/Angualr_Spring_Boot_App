import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadeinContractDetailsSummaryComponent } from './readein-contract-details-summary.component';

describe('ReadeinContractDetailsSummaryComponent', () => {
  let component: ReadeinContractDetailsSummaryComponent;
  let fixture: ComponentFixture<ReadeinContractDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadeinContractDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReadeinContractDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
