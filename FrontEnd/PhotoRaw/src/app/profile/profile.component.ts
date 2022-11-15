import { Component, OnInit } from '@angular/core';
import { PHOTOS } from 'collection-photo';
import { ARTISTAS } from '../artists/artists.json';
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
  artist=ARTISTAS;
  photos = PHOTOS;
  constructor(public dialog: MatDialog) {}

  ngOnInit(): void {}
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
