import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileDetailsSummaryComponent } from './profile-details-summary.component';

describe('ProfileDetailsSummaryComponent', () => {
  let component: ProfileDetailsSummaryComponent;
  let fixture: ComponentFixture<ProfileDetailsSummaryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileDetailsSummaryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfileDetailsSummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
