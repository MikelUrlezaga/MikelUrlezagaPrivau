<!DOCTYPE html>
<html>
    <head>
        <title>Ariketa 9</title>
    </head>
    <body>
        <?php
        /*Array-ak eta Objektuak: Sortu Liburu klasea eta LiburuKatalogoa klaseak. 
        Liburu klaseak izena eta egilea propietateak izango ditu eta metodo sortzailea. 
        LiburuKatalogoak izango da liburuen array bat eta liburuak gehitu metodoa izango du, 
        katalogoari liburu bat gehitzen diona. Azkenik, katalogoaBistaratu metodoa izango du, 
        pantailatik, taula batean, katalogoa osorik erakusten duena.*/

            class Liburu {
                public $izena;
                public $egilea;

                public function __construct($izena, $egilea) {
                    $this->izena = $izena;
                    $this->egilea = $egilea;
                }
            }
            
            class LiburuKatalogoa {
                private $liburuak = [];

                public function gehituLiburua(Liburu $liburua) {
                    $this->liburuak[] = $liburua;
                }

                public function katalogoaBistaratu() {
                    echo "<table border='1'>";
                    echo "<tr><th>Izena</th><th>Egilea</th></tr>";

                    foreach ($this->liburuak as $liburu) {
                        echo "<tr><td>" . $liburu->izena . "</td><td>" . $liburu->egilea . "</td></tr>";
                    }
                    echo "</table>";
                }
            }

            // Liburuak sortu
            $liburu1 = new Liburu("Harry Potter y la Piedra Filosofal", "J.K. Rowling");
            $liburu2 = new Liburu("Marina", "Carlos Ruiz Zafón");
            $liburu3 = new Liburu("La Sombra de la Sirena", "Camilla Lackberg");

            // LiburuKatalogoa sortu eta liburuak gehitu
            $katalogoa = new LiburuKatalogoa();
            $katalogoa->gehituLiburua($liburu1);
            $katalogoa->gehituLiburua($liburu2);
            $katalogoa->gehituLiburua($liburu3);

            // Katalogoa bistaratu
            $katalogoa->katalogoaBistaratu();
        ?>
        
    </body>
</html>





            
