import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Photo } from '../model/photo';
import { User } from '../model/user';
import { Service } from '../service/service.service';
@Component({
  selector: 'app-dialog-read',
  templateUrl: './dialog-read.component.html',
  styleUrls: ['./dialog-read.component.css'],
})
export class DialogReadComponent implements OnInit {
  photo: Photo;
  artist: User;
   constructor(
    public dialogRef: MatDialogRef<DialogReadComponent>,
    @Inject(MAT_DIALOG_DATA)
    public data: Photo,
    public service: Service
  ) {
    this.photo = data;
  }

  ngOnInit(): void {
    this.getArtists();
  }
  private getArtists() {
    this.service.getArtists(this.photo.idArtist).subscribe((data) => {
      this.artist = data;
    });
  }

  close() {
    this.dialogRef.close();
  }
}
