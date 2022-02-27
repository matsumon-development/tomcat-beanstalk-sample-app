import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ArthmeticService {

  private baseurl: String;


  constructor(private http: HttpClient) {
    this.baseurl = environment.apiUrl;
  }

  public cros(val1: string, val2: string): Observable<any>{
    const data = new FormData();
    data.append('val1',val1);
    data.append('val2',val2);
    return this.http.post(this.baseurl + '/cros', data)
  }
}
