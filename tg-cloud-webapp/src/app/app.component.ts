import {AfterViewInit, Component, ElementRef, NgZone, ViewChild} from '@angular/core';
import { environment } from '../environments/environment';

export const TELEGRAM_BOT_NAME = environment.telegramBotName;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements AfterViewInit {

  @ViewChild('script', { static: true })
  script: ElementRef;

  constructor(private ngZone: NgZone) { }

  ngAfterViewInit(): void {
    this.convertToScript();
  }

  public login(data) {
    console.log(data);
  }

  private convertToScript(): void {
    const element = this.script.nativeElement;
    const script = document.createElement('script');
    script.src = 'https://telegram.org/js/telegram-widget.js?7';

    script.setAttribute('data-telegram-login', TELEGRAM_BOT_NAME);
    script.setAttribute('data-size', 'large');
    script.setAttribute('data-auth-url', 'http://127.0.0.1:8080/api/v1/auth');
    script.setAttribute('data-request-access', 'write');

    element.parentElement.replaceChild(script, element);

    console.log('test');
  }

  init() {
    window['login'] = loginData => {
      this.ngZone.run(() => this.login(loginData));
    }
  }
}
