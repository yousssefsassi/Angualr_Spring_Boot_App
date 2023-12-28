import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalContractEditComponent } from './rental-contract-edit.component';

describe('RentalContractEditComponent', () => {
  let component: RentalContractEditComponent;
  let fixture: ComponentFixture<RentalContractEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalContractEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalContractEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
