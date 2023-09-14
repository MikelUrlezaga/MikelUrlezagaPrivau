<!DOCTYPE html>
<html>
    <body>
        <h1>Notak</h1>
        <?php
            // Daukagun notaren aldagaia sortuko dugu
            $nota = 5;
            
            // Switch bat egingo dugu konparatzeko balore hau tarte bakoitzean eta echo batekin honen balorearen tartea erakutsi

            switch ($nota) {
                case $nota <= 4.9:
                    echo "Gutxi";
                    break;
                case $nota <= 5.9;
                    echo "Nahiko";
                    break;
                case $nota <= 6.9;
                    echo "ondo";
                    break;
                case $nota <= 8.9;
                    echo "Oso ondo";
                    break;
                case $nota <= 10;
                    echo "Bikain";
                    break;
                default:
                    echo "Ez da nota bat";
                    break;
            }
        ?>
    </body>
</html>