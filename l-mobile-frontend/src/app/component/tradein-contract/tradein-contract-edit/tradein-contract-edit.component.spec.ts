import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinContractEditComponent } from './tradein-contract-edit.component';

describe('TradeinContractEditComponent', () => {
  let component: TradeinContractEditComponent;
  let fixture: ComponentFixture<TradeinContractEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinContractEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinContractEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
