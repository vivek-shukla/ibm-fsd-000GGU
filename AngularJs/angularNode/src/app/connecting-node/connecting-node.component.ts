import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-connecting-node',
  templateUrl: './connecting-node.component.html',
  styleUrls: ['./connecting-node.component.css']
})
export class ConnectingNodeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  myMethod()
  {
    return "myMsg"
  }
}
