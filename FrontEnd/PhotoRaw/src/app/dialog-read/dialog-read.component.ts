import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { PHOTOS } from 'collection-photo';
import { ARTISTAS } from 'collection-artist';
@Component({
  selector: 'app-dialog-read',
  templateUrl: './dialog-read.component.html',
  styleUrls: ['./dialog-read.component.css']
})
export class DialogReadComponent implements OnInit {
  photos = PHOTOS;
  artist=ARTISTAS;
  constructor(public dialogRef: MatDialogRef<DialogReadComponent>,
    @Inject(MAT_DIALOG_DATA)
    public message:string) { }

  ngOnInit(): void {
  }
  close() {
    this.dialogRef.close();
  }
  }
