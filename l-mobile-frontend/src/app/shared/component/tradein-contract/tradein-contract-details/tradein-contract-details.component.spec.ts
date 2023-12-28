import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinContractDetailsComponent } from './tradein-contract-details.component';

describe('TradeinContractDetailsComponent', () => {
  let component: TradeinContractDetailsComponent;
  let fixture: ComponentFixture<TradeinContractDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinContractDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinContractDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
