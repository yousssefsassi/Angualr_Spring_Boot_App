import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileSpaceComponent } from './profile-space.component';

describe('ProfileSpaceComponent', () => {
  let component: ProfileSpaceComponent;
  let fixture: ComponentFixture<ProfileSpaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileSpaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfileSpaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
