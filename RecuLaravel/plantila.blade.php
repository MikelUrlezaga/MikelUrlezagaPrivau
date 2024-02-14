<!DOCTYPE html>
<html lang="eu">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E2 Azterketa</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            text-align: center;
            border: 2px solid #ddd;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            background-color: white;
        }

        h1 {
            color: #444;
        }

        p {
            color: #666;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>ERRONKA 2 AZTERKETA</h1>
        <p>Paragrafo honen azpian txertatu taula</p>
    <!-- hemen agertu beharko da taula -->
        @section('content')

        @show
    </div>
</body>
</html>