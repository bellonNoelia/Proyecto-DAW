import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { PHOTOS } from 'collection-photo';
import { User} from '../model/user';
import { Service } from '../service/service.service';
@Component({
  selector: 'app-dialog-read',
  templateUrl: './dialog-read.component.html',
  styleUrls: ['./dialog-read.component.css']
})
export class DialogReadComponent implements OnInit {
  photos = PHOTOS;
  artists: User[];
  constructor(public dialogRef: MatDialogRef<DialogReadComponent>,
    @Inject(MAT_DIALOG_DATA)
    public message:string,public service:Service) { }

    ngOnInit(): void {
      this.getArtists();
      }
      private getArtists(){
        this.service.getArtists().subscribe(data => {
          this.artists = data;
        });
      }
  close() {
    this.dialogRef.close();
  }
  }
