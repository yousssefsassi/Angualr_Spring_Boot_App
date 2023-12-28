import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalContractListComponent } from './rental-contract-list.component';

describe('RentalContractListComponent', () => {
  let component: RentalContractListComponent;
  let fixture: ComponentFixture<RentalContractListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalContractListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalContractListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
