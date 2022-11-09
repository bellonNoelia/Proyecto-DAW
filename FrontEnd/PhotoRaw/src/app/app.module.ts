import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
//Componentes
import { HeaderComponent } from './header/header.component';
import { LoginControllerComponent } from './login-controller/login-controller.component';
import { FooterComponent } from './footer/footer.component';
import { ArtistsComponent } from './artists/artists.component';
import { InicioComponent } from './inicio/inicio.component';
import { ProfileComponent } from './profile/profile.component';
import { DialogProfileComponent } from './dialog-profile/dialog-profile.component';

//Angular material
import {MatToolbarModule } from '@angular/material/toolbar';
import {MatIconModule } from '@angular/material/icon';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatCardModule} from '@angular/material/card';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatDialogModule} from '@angular/material/dialog';




//Módulos
import { RoutingModule } from './routing/routing.module';
import { DialogLoginComponent } from './dialog-login/dialog-login.component';





@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginControllerComponent,
    FooterComponent,
    ArtistsComponent,
    InicioComponent,
    ProfileComponent,
    DialogProfileComponent,
    DialogLoginComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RoutingModule,
    MatToolbarModule,
    MatIconModule,
    MatMenuModule,
    MatButtonModule,
    MatFormFieldModule,
    MatCardModule,
    MatGridListModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
