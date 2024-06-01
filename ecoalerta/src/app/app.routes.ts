import { Routes } from '@angular/router';
import { CarruselComponent } from './components/carrusel/carrusel.component';
import { PaginationComponent } from './components/pagination/pagination.component';
import { LoginComponent } from './pages/login/login.component'; 
import { RegisterComponent } from './pages/register/register.component';

export const routes: Routes = [
    {
        path:"",component:CarruselComponent
    },
    {path:"referenciasbibliograficas/:id",component:PaginationComponent},
    {path:"impactosambientales/:id",component:PaginationComponent},
    {path:"login",component:LoginComponent},
    {path:"register",component:RegisterComponent},


];
