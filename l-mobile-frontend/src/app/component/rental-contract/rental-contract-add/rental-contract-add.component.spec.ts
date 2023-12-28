import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalContractAddComponent } from './rental-contract-add.component';

describe('RentalContractAddComponent', () => {
  let component: RentalContractAddComponent;
  let fixture: ComponentFixture<RentalContractAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalContractAddComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalContractAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
