import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SangaComponentComponent } from './sanga-component.component';

describe('SangaComponentComponent', () => {
  let component: SangaComponentComponent;
  let fixture: ComponentFixture<SangaComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SangaComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SangaComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
