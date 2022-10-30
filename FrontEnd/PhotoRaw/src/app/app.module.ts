import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
//Componentes
import { HeaderComponent } from './header/header.component';
import { LoginControllerComponent } from './login-controller/login-controller.component';
import { FooterComponent } from './footer/footer.component';
import { ArtistsComponent } from './artists/artists.component';

//Angular material
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatCardModule} from '@angular/material/card';

//Módulos
import { RoutingModule } from './routing/routing.module';
import { InicioComponent } from './inicio/inicio.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginControllerComponent,
    FooterComponent,
    ArtistsComponent,
    InicioComponent
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
    MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
