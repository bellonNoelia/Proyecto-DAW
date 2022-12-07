import { Component, OnInit } from '@angular/core';
import { PHOTOS } from 'collection-photo';
import { User} from '../model/user';
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
  photos = PHOTOS;
  constructor(public dialog: MatDialog,public service:Service) {}

  ngOnInit(): void {
    this.getArtists();
    }
    private getArtists(){
      this.service.getArtists().subscribe(data => {
        this.artists = data;
      });
    }
  openDialogCreate() {
    const dialogRef = this.dialog.open(DialogCreateComponent, {

    });
  }
  openDialogRead() {
    const dialogRef = this.dialog.open(DialogReadComponent, {

    });
  }
  openDialogUpdate() {
    const dialogRef = this.dialog.open(DialogUpdateComponent, {});
  }

  openDialogDelete() {
    const dialogRef = this.dialog.open(DialogDeleteComponent, {});
  }
}
