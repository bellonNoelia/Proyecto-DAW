import { Component, OnInit,Inject } from '@angular/core';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material/dialog';
import { UserService } from '../service/user.service';
import { User } from './user';

@Component({
  selector: 'app-dialog-login',
  templateUrl: './dialog-login.component.html',
  styleUrls: ['./dialog-login.component.css']
})
export class DialogLoginComponent implements OnInit {

 email:string;
 pwd:string;
  hide = true;
  constructor(public userService: UserService,public dialogRef: MatDialogRef<DialogLoginComponent>,
    @Inject(MAT_DIALOG_DATA)
    public message:string) { }

  ngOnInit(): void {
  }


  login(){
    let user=new User{email: email, pwd: pwd};
    this.userService.login(user).subscribe( data => {
      console.log(data);});
  }
  //Cerrar diálogo login
  close() {
    this.dialogRef.close();
  }
}
