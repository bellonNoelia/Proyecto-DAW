import { Component, OnInit,Inject } from '@angular/core';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-dialog-register',
  templateUrl: './dialog-register.component.html',
  styleUrls: ['./dialog-register.component.css']
})
export class DialogRegisterComponent implements OnInit {
hide=true;
  constructor(public dialogRef: MatDialogRef<DialogRegisterComponent>,
  @Inject(MAT_DIALOG_DATA)
    public message:string) { }

  ngOnInit(): void {
  }
  close() {
    this.dialogRef.close();
  }
submit(){}

}
