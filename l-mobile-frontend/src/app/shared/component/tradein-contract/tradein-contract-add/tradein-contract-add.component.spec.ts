import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinContractAddComponent } from './tradein-contract-add.component';

describe('TradeinContractAddComponent', () => {
  let component: TradeinContractAddComponent;
  let fixture: ComponentFixture<TradeinContractAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinContractAddComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinContractAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
