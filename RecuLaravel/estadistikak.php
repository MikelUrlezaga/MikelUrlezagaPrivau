<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class estadistikak extends Controller
{
    //
    public function mostrarVista()
    {
        return view('saski_bista');
    }

    public function mostrarVistaN()
    {
        return view('saski_bista')->name('saski_bista');
    }

    public function heredarVista(){
        return view('saski_bista');
    }
}




