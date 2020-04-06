import { AfterViewInit, Component, ElementRef, ViewChild } from '@angular/core';
import { environment } from '../../../environments/environment';

export const TELEGRAM_BOT_NAME = environment.telegramBotName;

@Component({
  selector: 'app-login-with-telegram-widget',
  templateUrl: './login-with-telegram-widget.component.html',
  styleUrls: ['./login-with-telegram-widget.component.scss']
})
export class LoginWithTelegramWidgetComponent implements AfterViewInit {

  @ViewChild('script', { static: true })
  script: ElementRef;

  constructor() {
  }

  ngAfterViewInit(): void {
    this.convertToScript();
  }

  private convertToScript(): void {
    const element = this.script.nativeElement;
    const script = document.createElement('script');
    script.src = 'https://telegram.org/js/telegram-widget.js?7';

    script.setAttribute('data-telegram-login', TELEGRAM_BOT_NAME);
    script.setAttribute('data-size', 'large');
    script.setAttribute('data-onauth', 'login(user)');
    script.setAttribute('data-request-access', 'write');

    element.parentElement.replaceChild(script, element);
  }
}
