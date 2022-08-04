import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ServiceService} from "./services/service.service";
import {HttpClientModule} from "@angular/common/http";
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {ViewRegistrationComponent} from "./components/view-registration/view-registration.component";

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    HomeComponent,
    ViewRegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
