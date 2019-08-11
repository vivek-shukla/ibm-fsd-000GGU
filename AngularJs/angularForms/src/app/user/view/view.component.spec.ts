import { async, ComponentFixture, TestBed, } from '@angular/core/testing';
import { ViewComponent } from './view.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { userService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';

describe('ViewComponent', () => {
  let component: ViewComponent;
  let fixture: ComponentFixture<ViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewComponent ] ,
      imports: [
        FormsModule,
        ReactiveFormsModule,
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewComponent);
    fixture.debugElement.injector.get(userService)
    fixture.debugElement.injector.get(ActivatedRoute)
    fixture.debugElement.injector.get(Router)
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
