import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-dialog-profile',
  templateUrl: './dialog-profile.component.html',
  styleUrls: ['./dialog-profile.component.css']
})
export class DialogProfileComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<DialogProfileComponent>,
  @Inject(MAT_DIALOG_DATA)
  public message:string) { }

ngOnInit(): void {
}
close() {
  this.dialogRef.close();
}
}
