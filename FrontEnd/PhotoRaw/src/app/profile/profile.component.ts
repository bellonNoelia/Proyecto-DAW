import { Component, OnInit,Input } from '@angular/core';
import { User} from '../model/user';
import { Photo} from '../model/photo';

import { Service } from '../service/service.service';
import { MatDialog } from '@angular/material/dialog';
import { DialogCreateComponent } from '../dialog-create/dialog-create.component';
import { DialogReadComponent } from '../dialog-read/dialog-read.component';
import { DialogUpdateComponent } from '../dialog-update/dialog-update.component';


import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css'],
})
export class ProfileComponent implements OnInit {

  artists: User;
  idUsuario: number;
  usuarioLog:any;
  photos : Photo[];
  columnas: number;

  constructor(
    public dialog: MatDialog,
    public service:Service,
    private _Activatedroute: ActivatedRoute ) {}

  ngOnInit(): void {
    this.getArtists();
    this.userLog();
    this.findPhotosByUser();
    this.columnas = (window.innerWidth <= 600) ? 1 : 6;
  }
  handleSize(event) {
  this.columnas = (event.target.innerWidth <= 600) ? 1 : 6;
  }

    private getArtists(){
      this.service.getArtists(this.getParameter()).subscribe(data => {
        this.artists = data;
      });

    }
    private userLog(){
      this.service.userLog().subscribe(data=>{
        this.usuarioLog=data;
      });
    }
    private findPhotosByUser(){
      this.service.findPhotosByUser(this.getParameter()).subscribe(data=>{
        this.photos=data;
      })
    }

  openDialogCreate() {
    const dialogRef = this.dialog.open(DialogCreateComponent, { data: new Object});

  }
  openDialogRead(photo:Photo) {
   this.dialog.open(DialogReadComponent, { data: photo});
  }

  openDialogUpdate(photo:Photo) {
     this.dialog.open(DialogUpdateComponent, {data:photo});
  }

 deletePhoto(photo) {
 this.service.deletePhoto(photo.id).subscribe(response => {
  console.log(response);
  this.findPhotosByUser();
})
 }

  private getParameter(){
    return this._Activatedroute.snapshot.params["id"]
  }

}
