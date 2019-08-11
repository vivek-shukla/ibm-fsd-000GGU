import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteComponent } from './delete.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { userService } from '../service.service';
import { MockActivatedRoute } from 'src/app/Mocks';

describe('DeleteComponent', () => {
  let component: DeleteComponent;
  let fixture: ComponentFixture<DeleteComponent>;
  beforeEach(async(() => { 
    let router:Router = jasmine.createSpyObj('Router',['navigate']);
    TestBed.configureTestingModule({
      declarations: [ DeleteComponent ],
      imports: [
        FormsModule,
        ReactiveFormsModule
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
    let router:Router = jasmine.createSpyObj('Router',['navigate']);
    fixture = TestBed.createComponent(DeleteComponent);
    component = fixture.componentInstance;
    fixture.debugElement.injector.get(userService)
    fixture.debugElement.injector.get(ActivatedRoute)
    fixture.debugElement.injector.get(Router)
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
