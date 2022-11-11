import { Component, OnInit } from '@angular/core';
//Objetos
import { ARTISTAS } from 'collection-artist';
@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.css']
})
export class ArtistsComponent implements OnInit {
artist=ARTISTAS;


  constructor() { }

  ngOnInit(): void {

  }

}
