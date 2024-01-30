<h1>AraceliDatos</h1>
<table>
    <tr>
        <th>NombreEnClave</th>
    </tr>
    <div class="container">
        @section('content')

        @show
    </div>
    @foreach($emaitza as $items)
    <tr>
        <td>{{ $items->izena }}</td>
    </tr>
    @endforeach
</table>