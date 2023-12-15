<h1>Kaixooo</h1>
<table>
    <tr>
        <th>Izena</th>
    </tr>
@foreach($emaitza as $items)
    <tr>
        <td>{{$items->izena}}</td>
        <td>{{$items->abizena}}</td>
    </tr>
@endforeach
</table>