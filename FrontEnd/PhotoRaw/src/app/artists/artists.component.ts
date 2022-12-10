import { Component, OnInit } from '@angular/core';
//Objetos
import { User} from '../model/user';
import { Service } from '../service/service.service';
@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.css'],
})
export class ArtistsComponent implements OnInit {
  artists: User[];

  constructor(public service:Service) {}

  ngOnInit(): void {
    this.getArtists()
  }
  private getArtists(){


    this.service.getArtists().subscribe(data => {
      this.artists = data;

    });

    this.service.getArtists().subscribe({
      next:(data => {
        this.artists = data;
      }),
      error:(error) =>{
        this.matchError(error.status)

      }
    });
  }

  // TODO mover a otra clase
private matchError(statusCode){
  switch(statusCode) {
    case 401: {
      localStorage.removeItem("token")
      location.reload();
       break;
    }
    case 403: {
      localStorage.removeItem("token")
      location.reload();
       break;
    }
    default: {
       //statements;
       break;
    }
  }
}

}
