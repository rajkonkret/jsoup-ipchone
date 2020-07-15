import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private httpClient: HttpClient) { }
  public getNews(){
    return this.httpClient.get(`https://api.nbp.pl/api/exchangerates/rates/c/usd/2020-07-09/?format=json`);

  }

  public getUsers(){
    return this.httpClient.get(`http://localhost:8080/users`);
  }
}
