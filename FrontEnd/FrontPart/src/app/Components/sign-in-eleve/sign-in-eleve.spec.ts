import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignInEleve } from './sign-in-eleve';

describe('SignInEleve', () => {
  let component: SignInEleve;
  let fixture: ComponentFixture<SignInEleve>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SignInEleve]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SignInEleve);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
