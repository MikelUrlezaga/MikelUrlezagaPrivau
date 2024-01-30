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

Route::get('araceli','App\Http\Controllers\tablaCreada_Controller@datuakerakutsi');

Route::get('araceli/heredar','App\Http\Controllers\tablaCreada_Controller@datuakerakutsiH');

// Route::get('araceli/numero/{number}',
// function ($number) {
//     return view('vistaConNumero', ['number'=>$number]);
// })->where('number', '[0-9]+');

Route::get('araceli/numero/{number}', function ($number) {
    $data = [
        'number' => $number,
        'info' => ['key' => 'value', 'foo' => 'bar'],
        // Puedes agregar más datos según sea necesario
    ];

    return view('vistaConNumero')->with('data', $data);
})->where('number', '[0-9]+');