import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginWithTelegramWidgetComponent } from "./common-components/login-with-telegram-widget/login-with-telegram-widget.component";

@NgModule({
  declarations: [
    AppComponent,
    LoginWithTelegramWidgetComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
