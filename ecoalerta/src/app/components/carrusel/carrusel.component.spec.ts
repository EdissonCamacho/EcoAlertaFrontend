import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarruselComponent } from './carrusel.component';

describe('CarruselComponent', () => {
  let component: CarruselComponent;
  let fixture: ComponentFixture<CarruselComponent>;

  beforeEach(
    () => {
     TestBed.configureTestingModule({
      imports: [CarruselComponent]
      
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CarruselComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    console.log("hola");
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
