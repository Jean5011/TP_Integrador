<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>TP Integrador</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            background-color: #f4f4f4;
        }

        /* Barra de navegación superior */
        .navbar {
            background-color: #007bff; /* Azul para la barra */
            color: white;
            padding: 15px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .navbar h1 {
            margin: 0;
            font-size: 24px;
        }

        .navbar .user-info {
            font-size: 18px;
            font-weight: bold;
        }

        .container {
            padding: 20px;
            margin: 20px auto;
            max-width: 1200px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        /* Estilo de la tabla de DataTables */
        .dataTables_wrapper .dataTables_length,
        .dataTables_wrapper .dataTables_filter,
        .dataTables_wrapper .dataTables_info,
        .dataTables_wrapper .dataTables_paginate {
            color: #333;
        }

        table.dataTable thead th {
            background-color: #007bff; /* Azul para el encabezado de la tabla */
            color: white;
            padding: 10px;
            text-align: left;
            border-bottom: 2px solid #0056b3;
        }

        table.dataTable tbody td {
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }

        table.dataTable tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        table.dataTable tbody tr:hover {
            background-color: #e9e9e9;
        }

        /* Estilos de los botones de DataTables (Paginación) */
        .dataTables_wrapper .dataTables_paginate .paginate_button {
            background-color: #28a745; /* Verde */
            color: white !important;
            border: 1px solid #218838;
            border-radius: 4px;
            padding: 6px 12px;
            margin: 0 4px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .dataTables_wrapper .dataTables_paginate .paginate_button:hover {
            background-color: #218838; /* Verde más oscuro al pasar el ratón */
        }

        .dataTables_wrapper .dataTables_paginate .paginate_button.current {
            background-color: #1e7e34; /* Verde más oscuro para el botón activo */
            border-color: #1c7430;
        }

        .dataTables_wrapper .dataTables_paginate .paginate_button.disabled {
            background-color: #6c757d;
            border-color: #6c757d;
            cursor: not-allowed;
        }

        /* Estilo para los select y input de DataTables */
        .dataTables_wrapper select,
        .dataTables_wrapper input[type="search"] {
            border: 1px solid #ccc;
            border-radius: 4px;
            padding: 6px 10px;
        }
    </style>
</head>
<body>

    <div class="navbar">
        <h1>Clientes</h1>
    </div>

    <div class="container">
        <table id="clientesTable" class="display" style="width:100%">
            <thead>
                <tr>
                    <th>Dni</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Dirección</th>
                    <th>Codigo Postal</th>
                    <th>Provincia</th>
                    <th>Nacionalidad</th>
                    <th>Fecha de nacimiento</th>
                    <th>Email</th>
                    <th>Telefono</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>12345678</td>
                    <td>Carlos</td>
                    <td>Luna</td>
                    <td>Avenida 123</td>
                    <td>1646</td>
                    <td>Buenos Aires</td>
                    <td>Argentina</td>
                    <td>08/07/1989</td>
                    <td>carlos@gmail.com</td>
                    <td>1122233445</td>
                </tr>
                <tr>
                    <td>87654321</td>
                    <td>Ana</td>
                    <td>Gomez</td>
                    <td>Calle 456</td>
                    <td>2000</td>
                    <td>Córdoba</td>
                    <td>Argentina</td>
                    <td>15/03/1992</td>
                    <td>ana.gomez@example.com</td>
                    <td>1133344556</td>
                </tr>
                <tr>
                    <td>98765432</td>
                    <td>Pedro</td>
                    <td>Lopez</td>
                    <td>Ruta 789</td>
                    <td>5000</td>
                    <td>Mendoza</td>
                    <td>Chile</td>
                    <td>20/11/1985</td>
                    <td>pedro.lopez@example.com</td>
                    <td>1144455667</td>
                </tr>
            </tbody>
        </table>
    </div>

    <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#clientesTable').DataTable();
        });
    </script>
</body>
</html>