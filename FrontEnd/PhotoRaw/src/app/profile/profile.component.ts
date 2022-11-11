import { Component, OnInit } from '@angular/core';
import { PHOTOS } from 'collection-photo';
import { MatDialog } from '@angular/material/dialog';
import { DialogReadComponent } from '../dialog-read/dialog-read.component';
import { DialogUpdateComponent } from '../dialog-update/dialog-update.component';
import { DialogDeleteComponent } from '../dialog-delete/dialog-delete.component';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css'],
})
export class ProfileComponent implements OnInit {
  photos = PHOTOS;
  constructor(public dialog: MatDialog) {}

  ngOnInit(): void {}
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
