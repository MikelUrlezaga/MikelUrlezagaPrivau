<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
// use App\Models\ikasleak;

class ikasleak extends Controller
{
    //
    public function datuak(){
        $datos =  ['izena' => 'Ane', 'adina' => 20];
        return view('ikasleak_view',compact('datos'));
    }
}

