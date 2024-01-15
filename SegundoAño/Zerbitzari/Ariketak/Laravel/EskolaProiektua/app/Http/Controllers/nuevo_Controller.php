<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\nuevo;

class nuevo_Controller extends Controller
{
    //funtzioa bat datu basetik informazioa lortzeko
    public function erakutsi(){
    $emaitza=nuevo::all();
    return view('froga_bista',com act('emaitza'));
    }
}
