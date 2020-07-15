import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {

  articles;
  users;
  constructor(private apiService: ApiService) { }
  ngOnInit() {

   
    this.apiService.getUsers().subscribe((dataUser)=>{
      console.log(dataUser);
      this.users = dataUser
    }
    );
  }

}
