import { Component, OnInit } from '@angular/core';
import { PHOTOS } from 'collection-photo';
import { User} from '../model/user';
import { Img} from '../model/img';
import { Service } from '../service/service.service';
import { MatDialog } from '@angular/material/dialog';
import { DialogCreateComponent } from '../dialog-create/dialog-create.component';
import { DialogReadComponent } from '../dialog-read/dialog-read.component';
import { DialogUpdateComponent } from '../dialog-update/dialog-update.component';
import { DialogDeleteComponent } from '../dialog-delete/dialog-delete.component';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css'],
})
export class ProfileComponent implements OnInit {
  artists: User[];
img:Img;
imgData : any;
  photos = PHOTOS;
  constructor(public dialog: MatDialog,public service:Service) {}

  ngOnInit(): void {
    this.getArtists();
    this.getImg();
    }

    private getArtists(){
      this.service.getArtists().subscribe(data => {
        this.artists = data;
      });
    }
    private getImg(){
      this.service.getImg(1).subscribe(data => {
        this.img = data[0];
        // this.imgData = btoa(String.fromCharCode.apply(null, new Uint8Array(this.img.img)));
        console.log(this.img)
        this.imgData = btoa(this.img.img);
      });

    }
  openDialogCreate() {
    const dialogRef = this.dialog.open(DialogCreateComponent, { data: new Object});
  }
  openDialogRead() {
    const dialogRef = this.dialog.open(DialogReadComponent, { });
  }
  openDialogUpdate() {
    const dialogRef = this.dialog.open(DialogUpdateComponent, {});
  }

  openDialogDelete() {
    const dialogRef = this.dialog.open(DialogDeleteComponent, {});
  }
}
