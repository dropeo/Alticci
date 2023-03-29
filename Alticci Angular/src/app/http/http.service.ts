import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  baseUrl = 'http://localhost:8080/api/v1/alticci/'; 

  constructor(private http: HttpClient) { }

  getAlticciValue(n: number) {
    return this.http.get(`${this.baseUrl}/alticci/${n}`);
  }
}
