import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ConnectingNodeComponent } from './connecting-node/connecting-node.component';
import { SangaComponentComponent } from './sanga-component/sanga-component.component';

@NgModule({
  declarations: [
    AppComponent,
    ConnectingNodeComponent,
    SangaComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
