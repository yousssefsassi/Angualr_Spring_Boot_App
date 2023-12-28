import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileDeleteConfirmationComponent } from './profile-delete-confirmation.component';

describe('ProfileDeleteConfirmationComponent', () => {
  let component: ProfileDeleteConfirmationComponent;
  let fixture: ComponentFixture<ProfileDeleteConfirmationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileDeleteConfirmationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfileDeleteConfirmationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
