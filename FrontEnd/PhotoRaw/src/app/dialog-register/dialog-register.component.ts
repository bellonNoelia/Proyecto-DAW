import { Component, OnInit,Inject } from '@angular/core';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-dialog-register',
  templateUrl: './dialog-register.component.html',
  styleUrls: ['./dialog-register.component.css']
})
export class DialogRegisterComponent implements OnInit {
  firstname:string;
  lastname:string;
  age:number;
  email:string;
  pwd:string;
  pwdConfirm:string;

hide=true;
  constructor(public dialogRef: MatDialogRef<DialogRegisterComponent>,
  @Inject(MAT_DIALOG_DATA)
    public message:string) { }

  ngOnInit(): void {
  }
  register(){
    console.log(this.firstname);
    console.log(this.lastname);
    console.log(this.age);
    console.log(this.pwd);
    console.log(this.pwdConfirm);
  }
  close() {
    this.dialogRef.close();
  }
submit(){}

}
