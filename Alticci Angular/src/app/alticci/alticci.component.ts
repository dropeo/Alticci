import { Component } from '@angular/core';
import { HttpService } from '../http/http.service';

@Component({
  selector: 'app-alticci',
  templateUrl: './alticci.component.html',
  styleUrls: ['./alticci.component.css']
})
export class AlticciComponent {
  n!: number;
  value!: number;

  constructor(private httpService: HttpService) { }

  calculate() {
    this.httpService.getAlticciValue(this.n).subscribe((result: any) => {
      this.value = result.value;
    });
  }
}
