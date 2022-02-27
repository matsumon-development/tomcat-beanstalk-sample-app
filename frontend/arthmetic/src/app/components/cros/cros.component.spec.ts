import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrosComponent } from './cros.component';

describe('CrosComponent', () => {
  let component: CrosComponent;
  let fixture: ComponentFixture<CrosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CrosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
