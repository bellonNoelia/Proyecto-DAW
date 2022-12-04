import { Component, OnInit } from '@angular/core';
import { PHOTOS } from 'collection-photo';
import { Artist} from '../model/artist';
import { ArtistService } from '../artists/artist.service';
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
  artists: Artist[];
  photos = PHOTOS;
  constructor(public dialog: MatDialog,private artistService: ArtistService) {}

  ngOnInit(): void {this.artistService
    .getArtistas()
    .subscribe((artists) => (this.artists = artists));}
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
