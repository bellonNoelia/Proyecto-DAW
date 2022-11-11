import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
@Component({
  selector: 'app-dialog-delete',
  templateUrl: './dialog-delete.component.html',
  styleUrls: ['./dialog-delete.component.css']
})
export class DialogDeleteComponent implements OnInit {

  message: string = "¿Está seguro de que deseas eliminar el producto?"
  acceptBtnTxt = "Si"
  cancelBtnTxt = "No"
  constructor(
    @Inject(MAT_DIALOG_DATA) private data: any,
    private dialogRef: MatDialogRef<DialogDeleteComponent>) {
      if(data){
    this.message = data.message || this.message;
    if (data.buttonText) {
      this.acceptBtnTxt = data.buttonText.ok || this.acceptBtnTxt;
      this.cancelBtnTxt = data.buttonText.cancel || this.cancelBtnTxt;
    }
      }
  }
  ngOnInit(): void {
  }
  accept(): void {
    this.dialogRef.close(true);
  }
}
