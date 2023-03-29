import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlticciComponent } from './alticci.component';

describe('AlticciComponent', () => {
  let component: AlticciComponent;
  let fixture: ComponentFixture<AlticciComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AlticciComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlticciComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
