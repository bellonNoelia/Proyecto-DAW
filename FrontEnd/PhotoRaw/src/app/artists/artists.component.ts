import { Component, OnInit } from '@angular/core';
//Objetos
import { Artist } from './artist';
import { ArtistService } from './artist.service';
@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.css'],
})
export class ArtistsComponent implements OnInit {
  artists: Artist[];

  constructor(private artistService: ArtistService) {}

  ngOnInit(): void {
    this.artistService
      .getArtistas()
      .subscribe((artists) => (this.artists = artists));
  }
}
