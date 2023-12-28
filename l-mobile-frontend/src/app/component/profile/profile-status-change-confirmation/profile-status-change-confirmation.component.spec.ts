import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileStatusChangeConfirmationComponent } from './profile-status-change-confirmation.component';

describe('ProfileStatusChangeConfirmationComponent', () => {
  let component: ProfileStatusChangeConfirmationComponent;
  let fixture: ComponentFixture<ProfileStatusChangeConfirmationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileStatusChangeConfirmationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfileStatusChangeConfirmationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
