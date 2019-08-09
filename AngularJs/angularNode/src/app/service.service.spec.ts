import { TestBed } from '@angular/core/testing';

import { ServiceService } from './service.service';

describe('ServiceService', () => {
  let service: ServiceService;
  // let service2:ServiceService
  beforeEach(() => { 
    // let fixture = TestBed.createComponent(ServiceService)
    // service2 = fixture.componentInstance
    TestBed.configureTestingModule({});
    service = TestBed.get(ServiceService);
    
});

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
  it('should check service function',()=>{  
     let user = service.getUser()
     expect(user.length).toBeGreaterThan(0)
  })
  it(("it should check check add method"),()=>{
      expect(service.addUser({
        id:2,
        name: 'vikram'
      }))
      .toBeGreaterThan(0)
  })
});
