<h1>Dentro</h1>
<table>
    <tr>
        <th>Izena</th>
    </tr>
@foreach($datuak as $items)
    <tr>
        <td>{{$items->izena}}</td>
    </tr>
@endforeach
</table>