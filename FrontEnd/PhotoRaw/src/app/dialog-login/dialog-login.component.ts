import { Component, OnInit,Inject } from '@angular/core';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material/dialog';
import { UserService } from '../service/user.service';
import { User } from '../model/user';
import { MatDialog } from '@angular/material/dialog';
import { DialogRegisterComponent } from '../dialog-register/dialog-register.component';

@Component({
  selector: 'app-dialog-login',
  templateUrl: './dialog-login.component.html',
  styleUrls: ['./dialog-login.component.css']
})
export class DialogLoginComponent implements OnInit {

  hide = true;
  constructor(public dialog: MatDialog, public userService: UserService,public dialogRef: MatDialogRef<DialogLoginComponent>,
    @Inject(MAT_DIALOG_DATA)
    public data: User) { }

  ngOnInit(): void {
  }


  login(user:User){

    this.userService.login(user).subscribe( data => {
      console.log(data);});

  }


  //Cerrar diálogo login
  close() {
    this.dialogRef.close();
  }
  openDialogRegister(){
    const dialogRef = this.dialog.open(DialogRegisterComponent, { data: new Object})
  }
}
