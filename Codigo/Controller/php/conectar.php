<?php
  session_start();
  $user = $_POST['usuario'];
  $clave = $_POST['password'];
   
  $nombreServidor = "localhost";
  $nombreUsuario = "root";
  $passwordBaseDeDatos = "";
  $nombreBaseDeDatos = "controlbodega";
  
  $conn = new mysqli($nombreServidor, $nombreUsuario, $passwordBaseDeDatos, $nombreBaseDeDatos);
  
  if ($conn ->connect_error) {
    die("Connection failed: " . $conn ->connect_error);
  }
 
  $query = "SELECT * FROM cp_usuarios WHERE usu_user='$user' AND usu_pass='$clave'";
  $resultado = mysqli_query($conn,$query);
  if($resultado){
	$row = mysqli_fetch_array($resultado); 
	if($row>0){
    	$_SESSION['user'] = $user;
       	header("Location: ../../View/html/home.html");
	   }
   else
	   {
        echo '<img src="../img/fondo_error.PNG" alt="Error" width="1478" height="707" usemap="#Map"/>
    <map name="Map">
      <area shape="rect" coords="693,302,895,348" href="../index.html">
    </map>';}
  }
?>