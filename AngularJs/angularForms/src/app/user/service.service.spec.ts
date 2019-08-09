import { TestBed } from '@angular/core/testing';

import { userService } from './service.service';

describe('ServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: userService = TestBed.get(userService); //Testbed.grt() gives mock object
    expect(service).toBeTruthy();
  });
});
