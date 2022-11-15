import { Injectable } from '@angular/core';
import { ARTISTAS } from './artists.json';
import { Artist } from './artist';
import { Observable, of } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ArtistService {

  constructor() {

   }
   getArtistas():Observable<Artist[]>{
    return of(ARTISTAS);
  }
}
