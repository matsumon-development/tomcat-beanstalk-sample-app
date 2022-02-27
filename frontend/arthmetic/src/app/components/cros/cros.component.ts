import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ArthmeticService} from './../../services/arthmetic.service'

@Component({
  selector: 'app-cros',
  templateUrl: './cros.component.html',
  styleUrls: ['./cros.component.scss']
})
export class CrosComponent implements OnInit {

  v1: string = "5";
  v2: string = "5";

  constructor(private snackBar: MatSnackBar, private arthmeticService: ArthmeticService) { }

  ngOnInit(): void {
  }


  onClickPlus(evt: any){
    this.arthmeticService.cros(this.v1,this.v2).subscribe(
      (res) => {
        this.snackBar.open(res, 'OK',{duration: 10000,});
      },
      (err: HttpErrorResponse) =>{
        let headerErrorMessage = err.headers.get("error-message");
        if(headerErrorMessage == null){
          headerErrorMessage = 'unknown errer';
        }
        this.snackBar.open(headerErrorMessage, 'BAD', {duration: 10000,});
      }
    )
  }

  onClickMinus(evt: any){
    this.arthmeticService.cros(this.v1,this.v2).subscribe(
      (res) => {
        this.snackBar.open(res, 'OK',{duration: 10000,});
      },
      (err: HttpErrorResponse) =>{
        let headerErrorMessage = err.headers.get("error-message");
        if(headerErrorMessage == null){
          headerErrorMessage = 'unknown errer';
        }
        this.snackBar.open(headerErrorMessage, 'BAD', {duration: 10000,});
      }
    )
  }

  onClickCross(evt: any){
    this.arthmeticService.cros(this.v1,this.v2).subscribe(
      (res) => {
        this.snackBar.open(res, 'OK',{duration: 10000,});
      },
      (err: HttpErrorResponse) =>{
        let headerErrorMessage = err.headers.get("error-message");
        if(headerErrorMessage == null){
          headerErrorMessage = 'unknown errer';
        }
        this.snackBar.open(headerErrorMessage, 'BAD', {duration: 10000,});
      }
    )
  }

  onClickDivid(evt: any){
    this.arthmeticService.cros(this.v1,this.v2).subscribe(
      (res) => {
        this.snackBar.open(res, 'OK',{duration: 10000,});
      },
      (err: HttpErrorResponse) =>{
        let headerErrorMessage = err.headers.get("error-message");
        if(headerErrorMessage == null){
          headerErrorMessage = 'unknown errer';
        }
        this.snackBar.open(headerErrorMessage, 'BAD', {duration: 10000,});
      }
    )
  }
}
