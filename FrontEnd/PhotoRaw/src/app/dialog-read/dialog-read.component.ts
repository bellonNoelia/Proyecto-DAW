import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { PHOTOS } from 'collection-photo';
import { Artist} from '../artists/artist';
import { ArtistService } from '../artists/artist.service';
@Component({
  selector: 'app-dialog-read',
  templateUrl: './dialog-read.component.html',
  styleUrls: ['./dialog-read.component.css']
})
export class DialogReadComponent implements OnInit {
  photos = PHOTOS;
  artists: Artist[];
  constructor(public dialogRef: MatDialogRef<DialogReadComponent>,
    @Inject(MAT_DIALOG_DATA)
    public message:string,private artistService: ArtistService) { }

  ngOnInit(): void {
    this.artistService
    .getArtistas()
    .subscribe((artists) => (this.artists = artists));
  }
  close() {
    this.dialogRef.close();
  }
  }
