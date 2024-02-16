<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/saskiestatistikak',function(){
    return view('saski_bista');
})->name('saski_rutak');

Route::get('/saskiestatistikakControl','App\Http\Controllers\estadistikak@mostrarVista');

Route::get('/saskiestatistikakheredar','App\Http\Controllers\estadistikak@heredarVista');