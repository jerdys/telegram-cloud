import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginWithTelegramWidgetComponent } from './login-with-telegram-widget.component';

describe('LoginWithTelegramWidgetComponent', () => {
  let component: LoginWithTelegramWidgetComponent;
  let fixture: ComponentFixture<LoginWithTelegramWidgetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginWithTelegramWidgetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginWithTelegramWidgetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
