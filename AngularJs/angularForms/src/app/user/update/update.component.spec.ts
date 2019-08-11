import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateComponent } from './update.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { userService } from '../service.service';
import { MockActivatedRoute } from 'src/app/Mocks';

describe('UpdateComponent', () => {
  let component: UpdateComponent;
  let fixture: ComponentFixture<UpdateComponent>;
  beforeEach(async(() => {
    let router:Router = jasmine.createSpyObj('Router',['navigate']);

    TestBed.configureTestingModule({
      declarations: [ UpdateComponent ] ,
      imports: [
        FormsModule,
        ReactiveFormsModule,
      ],
      providers:[
        {
          provide: ActivatedRoute,
          useClass: MockActivatedRoute
        },
        {
          provide : Router,
          useClass: router
        }
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateComponent);
    fixture.debugElement.injector.get(userService)
    fixture.debugElement.injector.get(ActivatedRoute)
    fixture.debugElement.injector.get(Router)
    
    component = fixture.componentInstance;
    
    fixture.detectChanges();
  });

  it('should create', () => {
    console.log("******************** "+component);
    expect(component).toBeTruthy();
  });
});

