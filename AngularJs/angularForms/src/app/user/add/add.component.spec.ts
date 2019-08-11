import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddComponent } from './add.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { userService } from '../service.service';

describe('AddComponent', () => {
  let component: AddComponent;
  let fixture: ComponentFixture<AddComponent>;
  

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddComponent ] ,
      imports: [
        FormsModule,
        ReactiveFormsModule,
        
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddComponent);
    component = fixture.componentInstance;
    fixture.debugElement.injector.get(userService) // it'll return object of userService
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
