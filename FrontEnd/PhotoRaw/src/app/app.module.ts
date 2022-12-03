import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
//Componentes
import { HeaderComponent } from './header/header.component';
import { LoginControllerComponent } from './login-controller/login-controller.component';
import { FooterComponent } from './footer/footer.component';
import { ArtistsComponent } from './artists/artists.component';
import { InicioComponent } from './inicio/inicio.component';
import { ProfileComponent } from './profile/profile.component';
import { DialogReadComponent } from './dialog-read/dialog-read.component';
import { DialogLoginComponent } from './dialog-login/dialog-login.component';
import { PhotosComponent } from './photos/photos.component';
import { DialogRegisterComponent } from './dialog-register/dialog-register.component';
import { DialogDeleteComponent } from './dialog-delete/dialog-delete.component';
import { DialogUpdateComponent } from './dialog-update/dialog-update.component';

//Servicios
import { ArtistService } from './artists/artist.service';

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
import { DialogCreateComponent } from './dialog-create/dialog-create.component';







@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginControllerComponent,
    FooterComponent,
    ArtistsComponent,
    InicioComponent,
    ProfileComponent,
    DialogReadComponent,
    DialogLoginComponent,
    PhotosComponent,
    DialogRegisterComponent,
    DialogDeleteComponent,
    DialogUpdateComponent,
    DialogCreateComponent
  ],
  imports: [
    HttpClientModule,
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
  providers: [ArtistService],
  bootstrap: [AppComponent,]
})
export class AppModule { }
