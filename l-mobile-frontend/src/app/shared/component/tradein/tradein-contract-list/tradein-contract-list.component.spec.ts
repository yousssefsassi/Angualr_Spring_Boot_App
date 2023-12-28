import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeinContractListComponent } from './tradein-contract-list.component';

describe('TradeinContractListComponent', () => {
  let component: TradeinContractListComponent;
  let fixture: ComponentFixture<TradeinContractListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TradeinContractListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeinContractListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
