<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\tablaPruebaCrear;

class tablaCreada_Controller extends Controller
{
    //
    public function datuakerakutsi(){
        $emaitza=tablaPruebaCrear::all();
        return view('primera_vista',compact('emaitza'));
    }

    public function datuakerakutsiH(){
        $emaitza=tablaPruebaCrear::all();
        return view('vistaParaHeredar',compact('emaitza'));
    }

    public function datuakerakutsiSelect(){
        $emaitza = tablaPruebaCrear::select(
            'etiketa',
            'izena',
            'id'
        )
        ->whereNull('ezabatze_data')
        ->orderBy('izena', 'asc')
        ->get();
    
        return view('primera_vista', compact('emaitza'));
    }

}
