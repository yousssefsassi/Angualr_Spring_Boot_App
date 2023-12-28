import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinContractSpaceComponent } from './tradein-contract-space.component';

describe('TradeinContractSpaceComponent', () => {
  let component: TradeinContractSpaceComponent;
  let fixture: ComponentFixture<TradeinContractSpaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinContractSpaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinContractSpaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
