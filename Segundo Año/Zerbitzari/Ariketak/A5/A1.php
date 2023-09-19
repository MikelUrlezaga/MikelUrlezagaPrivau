<!DOCTYPE html>
<html>
    <body>
        <h1>1Ariketa</h1>
            <table bgcolor="red">
                <?php
                    // arraya sortuko dugu eta baloreak sartu, beste array batzuk sortzen barruan
                    $array = array(array("izena" => "Harry Potter", "autorea" => "J.K. Rowling") ,array("izena" => "Game of Thrones", "autorea" => "George R.R. Martin"), array("izena" => "The Hobbit", "autorea" => "J.R.R. Tolkien"));
                    // foreach bat egingo dugu lehenengo balorea kontuan izateko eta beste bat barruan bigarren arrayko baloreak hartzeko
                    foreach ($array as $value) {?>
                        <tr bgcolor="white">
                        <?php
                        foreach ($value as $key) {
                            echo "<td>$key</td>";
                        }
                        ?>
                        </tr>
                    <?php
                    }
                ?>
            </table>
    </body>
</html>