<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\futbolEstatistikak;


class estatistikakKontroladorea extends Controller
{
    //
    public function erakutsi() {
        $emaitza = futbolEstatistikak::select(
            'taldea'
        )
        ->get();

        if($emaitza->isEmpty()){
            return response()->json(['message' => 'Ez dago daturik.'], 404);
        }else{
            return response()->json($emaitza, 200);
        }
    }

    public function lortu(){
        $emaitza = futbolEstatistikak::select(
            'taldea',
            'jokatutako_partidak',
            'irabazitako_partidak',
            'berdindutako_partidak',
            'galdu_partidak',
            'aldeko_golak',
            'kontrako_golak'
        )
        ->get();

        if($emaitza->isEmpty()){
            return response()->json(['message' => 'Ez dago daturik.'], 404);
        }else{
            return response()->json($emaitza, 200);
        }
    }

    public function txertatu(Request $request){
            $datos = $request->json()->all();

            $dato = futbolEstatistikak::insert([
                'taldea' =>  $datos["taldea"],
                'jokatutako_partidak' =>  $datos["jokatutako_partidak"],
                'irabazitako_partidak' =>  $datos["irabazitako_partidak"],
                'berdindutako_partidak' =>  $datos["berdindutako_partidak"],
                'galdu_partidak' =>  $datos["galdu_partidak"],
                'aldeko_golak' =>  $datos["aldeko_golak"],
                'kontrako_golak' =>  $datos["kontrako_golak"]
            ]);

            if ($dato) {
                // Si la inserción fue exitosa, devolver código de estado HTTP 200
                return response()->json(['message' => 'Taldea ongi txertatu da.'], 200);
            } else {
                // Si la inserción falló, devolver código de estado HTTP 500 (Internal Server Error)
                return response()->json(['message' => 'Errorea taldea txertatzean.'], 500);
            }
    }

    public function ezabatu(Request $request){
        $datos = $request->json()->all();
        $deleted = FutbolEstatistikak::where('taldea', $datos['taldea'])->delete();

        if ($deleted) {
            return response()->json(['message' => 'Registro eliminado correctamente.'], 200);
        } else {
            return response()->json(['message' => 'No se encontró el registro o ocurrió un error al intentar eliminarlo.'], 404);
        }
    }

    public function bilatu(Request $request){
        $datos = $request->json()->all();
        $registro = FutbolEstatistikak::where('taldea', $datos['taldea'])->first();

        if ($registro) {
            return response()->json($registro, 200);
        } else {
            return response()->json(['message' => 'No se encontró ningún registro para el talde proporcionado.'], 404);
        }
    }

    public function eguneratu(Request $request){
        $datos = $request->json()->all();

        $emaitza = FutbolEstatistikak::where('taldea', $datos["taldea"])->update(['jokatutako_partidak' => $datos['jokatutako_partidak'], 'irabazitako_partidak' => $datos['irabazitako_partidak'], 'berdindutako_partidak' => $datos['berdindutako_partidak'],'galdu_partidak' => $datos['galdu_partidak'], 'aldeko_golak' => $datos['aldeko_golak'], 'kontrako_golak' => $datos['kontrako_golak']]);
        
        if ($emaitza) {
           return response()->json(['message' => 'Datuak aldatu dira.'], 200);
       } else {
           return response()->json(['message' => 'Ezin izan dira datuak aldatu.'], 400);
       }
    }
}
