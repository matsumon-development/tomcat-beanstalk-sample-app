import { TestBed } from '@angular/core/testing';

import { ArthmeticService } from './arthmetic.service';

describe('ArthmeticService', () => {
  let service: ArthmeticService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ArthmeticService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
