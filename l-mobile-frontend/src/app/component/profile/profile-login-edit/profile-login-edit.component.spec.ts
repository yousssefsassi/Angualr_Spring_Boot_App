import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileLoginEditComponent } from './profile-login-edit.component';

describe('ProfileLoginEditComponent', () => {
  let component: ProfileLoginEditComponent;
  let fixture: ComponentFixture<ProfileLoginEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileLoginEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfileLoginEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
