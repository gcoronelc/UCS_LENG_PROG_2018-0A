<?PHP

require_once("class_estudiante.php");
$miestudiante = new Student; //Declaramos el Objeto del tipo Student
 
$miestudiante->notas[0]=18;
$miestudiante->notas[1]=19;
$miestudiante->notas[2]=19;
$miestudiante->notas[3]=20; //la variable notas en la clase es publica, as que podemos manipularla directamente
$miestudiante->imprimir_notas(); //llamamos a la funcion que imprime las notas
echo "El promedio del estudiante <strong>" .$miestudiante->nombre. "</strong> es: "; //imprimimos un mensaje con el nombre del estudiante
echo $miestudiante->promedio(); //llamamos a la funcion que imprime las notas una por una
?>