import { Component, NgModule } from '@angular/core';
import {Routes, RouterModule } from '@angular/router';
import { ArtistsComponent } from '../artists/artists.component';
import { InicioComponent } from '../inicio/inicio.component';
const routes: Routes=[
  {path:'home',component:InicioComponent },
  {path:'artists',component:ArtistsComponent},
  {path:' ',redirectTo:'/home',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes) ],
  exports:[RouterModule]
})
export class RoutingModule { }
