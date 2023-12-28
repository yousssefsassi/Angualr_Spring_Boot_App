import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalesmanSpaceComponent } from './salesman-space.component';

describe('SalesmanSpaceComponent', () => {
  let component: SalesmanSpaceComponent;
  let fixture: ComponentFixture<SalesmanSpaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalesmanSpaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SalesmanSpaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
