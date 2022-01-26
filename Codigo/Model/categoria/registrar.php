<?php
include 'conexion.php';
$name = $_GET['name'];
if ($name != null) {
    $sql = $mysqli->query("INSERT INTO categoria (idCategoria, nombreCategoria) VALUES ('','" . $name . "')");
    if ($name = 1) {
        header("location:../view/registrar.html");
    }
} 
?>