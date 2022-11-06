import { Component, NgModule } from '@angular/core';
import {Routes, RouterModule } from '@angular/router';
import { ArtistsComponent } from '../artists/artists.component';
import { InicioComponent } from '../inicio/inicio.component';
import { ProfileComponent } from '../profile/profile.component';
const routes: Routes=[
  {path:'home',component:InicioComponent },
  {path:'artists',component:ArtistsComponent},
  {path:'profile',component:ProfileComponent},
  {path:' ',redirectTo:'/home',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes) ],
  exports:[RouterModule]
})
export class RoutingModule { }
