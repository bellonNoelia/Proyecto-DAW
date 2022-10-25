import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginControllerComponent } from './login-controller.component';

describe('LoginControllerComponent', () => {
  let component: LoginControllerComponent;
  let fixture: ComponentFixture<LoginControllerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginControllerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoginControllerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
