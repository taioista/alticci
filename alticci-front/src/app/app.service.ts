import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { throwError } from 'rxjs';
import { catchError, map, retry } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  baseUrl = "/alticci/";

  constructor(private http: HttpClient) { }

  getAlticciSequence(number: number) {
    return this.http.get(this.baseUrl+number).pipe(
      map((response) => response),
      catchError((e) => this.handleError(e))
    );
  }

  handleError(error:any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = `Error: ${error.error.message}`;
    } else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(() => {
        return errorMessage;
    });
  }
}
