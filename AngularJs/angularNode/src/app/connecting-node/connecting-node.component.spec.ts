import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConnectingNodeComponent } from './connecting-node.component';

describe('ConnectingNodeComponent', () => {
  let component: ConnectingNodeComponent;
  let fixture: ComponentFixture<ConnectingNodeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConnectingNodeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConnectingNodeComponent); // testbed is base layer of Angular, it sets up angular based requirement 
    component = fixture.componentInstance;  // all field in ts file 
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  }); 
  it(("should test my method"),()=>{ 
    const msg = component.myMethod()
    expect(msg).toBe('myMsg')
  })
  it(("it should test html"),()=>{
    const htmlRef = fixture.debugElement.nativeElement
    expect( htmlRef.querySelector('b').textContent).toBe('msg')
  }) 

});
