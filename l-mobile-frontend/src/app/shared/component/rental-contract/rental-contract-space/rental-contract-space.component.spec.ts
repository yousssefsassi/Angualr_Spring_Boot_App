import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RentalContractSpaceComponent } from './rental-contract-space.component';

describe('RentalContractSpaceComponent', () => {
  let component: RentalContractSpaceComponent;
  let fixture: ComponentFixture<RentalContractSpaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RentalContractSpaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RentalContractSpaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
