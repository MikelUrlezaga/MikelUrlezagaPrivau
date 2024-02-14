<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "api" middleware group. Make something great!
|
*/

Route::middleware('auth:sanctum')->get('/user', function (Request $request) {
    return $request->user();
});

Route::get('futxebol','App\Http\Controllers\estatistikakKontroladorea@erakutsi');

Route::get('lortuDatuak','App\Http\Controllers\estatistikakKontroladorea@lortu');

Route::post('txertatuDatuak','App\Http\Controllers\estatistikakKontroladorea@txertatu');

Route::delete('ezabatu','App\Http\Controllers\estatistikakKontroladorea@ezabatu');

Route::get('bilatuTaldea','App\Http\Controllers\estatistikakKontroladorea@bilatu');

Route::put('aldatu','App\Http\Controllers\estatistikakKontroladorea@eguneratu');