import { HttpClient, HttpEventType } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})

export class AppComponent    {
    constructor(private httpClient: HttpClient) {}


    public number: number = 0;

    public apiNumber: string = "";

    public onNumberChange(event: any) {
        this.number = event.target.value;
    }

    public onApiNumberChange(event: any) {
        this.apiNumber = event.target.value;
    }

    public getFromApi(nbr : number) {
        this.httpClient.get('http://localhost:8080/api/v1/alticci/' + nbr)
        .subscribe((response) => {
            this.apiNumber = response.toString();
        }
        );
    }
}