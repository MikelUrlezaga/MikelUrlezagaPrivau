<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\benetakoa;

class benetan extends Controller
{
    //
    public function erakutsi(){
        $emaitza = benetakoa::all();
        // return view('erakutsi_view',compact('emaitza'));

    }

    public function index(){
        $emaitza = benetakoa::all();
        return response()->json($emaitza);
    }
}
