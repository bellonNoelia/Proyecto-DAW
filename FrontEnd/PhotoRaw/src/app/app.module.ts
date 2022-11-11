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
import { DialogLoginComponent } from './dialog-login/dialog-login.component';
import { PhotosComponent } from './photos/photos.component';
import { DialogRegisterComponent } from './dialog-register/dialog-register.component';

//Angular material
import {MatToolbarModule } from '@angular/material/toolbar';
import {MatIconModule } from '@angular/material/icon';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatCardModule} from '@angular/material/card';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatDialogModule} from '@angular/material/dialog';
import {MatInputModule} from '@angular/material/input';
import {MatRadioModule} from '@angular/material/radio';





//Módulos
import { RoutingModule } from './routing/routing.module';






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
    DialogLoginComponent,
    PhotosComponent,
    DialogRegisterComponent
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
    FormsModule,
    ReactiveFormsModule,
    MatCardModule,
    MatGridListModule,
    MatDialogModule,
    MatInputModule,
    MatRadioModule


  ],
  providers: [],
  bootstrap: [AppComponent,]
})
export class AppModule { }
