<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de Estudiantes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="{{ asset('../resources/css/style.css') }}">
</head>
<body>

<h2 style="margin-left:20px;">Tabla de Estudiantes</h2>
<hr>
<table class="table" style="margin-left: 20px;">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Izena</th>
      <th scope="col">Abizena</th>
      <th scope="col">FP</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">{{$number}}</th>
      <td>Mark</td>
      <td>Evans</td>
      <td>DAW</td>
    </tr>
    <tr>
      <th scope="row">{{$number+1}}</th>
      <td>Jon</td>
      <td>Pingu_Caballero</td>
      <td>DAW</td>
    </tr>
  </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
