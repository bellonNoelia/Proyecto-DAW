import { Component, OnInit,Inject } from '@angular/core';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material/dialog';
import { UserService } from '../service/user.service';
import { User } from '../model/user';

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
  constructor(public userService: UserService,public dialogRef: MatDialogRef<DialogRegisterComponent>,
  @Inject(MAT_DIALOG_DATA)
    public data: User) { }

  ngOnInit(): void {
  }
  register(user:User){
    this.userService.register(user).subscribe(data => {
      console.log(data);
    });
  }
  close() {
    this.dialogRef.close();
  }


}
