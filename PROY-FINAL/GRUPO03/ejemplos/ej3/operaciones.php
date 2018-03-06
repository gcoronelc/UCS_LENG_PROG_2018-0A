<?php
Class Operaciones {
    var $inicializada=32;
    var $num1;
    var $num2;
    var $suma;
    var $diferencia;
    var $producto;
    var $cociente;
    var $contador=0;
      function Operaciones ($val1=15,$val2=25){
        $this->contador +=1;
        $c=$this->contador;
        $this->num1[$this->contador]=$val1;
        $this->num2[$c]=$val2;
        $this->suma[$c]=$val1+$val2;
        $this->diferencia[$c]=$val1-$val2;
        $this->producto[$c]=$val1*$val2;
        $this->cociente[$c]=$this->inicializada*$val1/$val2;
              }


     function imprime(){
         echo "<table align=center border=1>";
         echo "<td>Num 1</td><td>num2</td><td>Suma</td>";
         echo "<td>Diferencia</td><td>Producto</td><td>Cociente</td><tr>";
         foreach($this->num1 as $clave=>$valor){
             $n2=$this->num2[$clave];
             $s=$this->suma[$clave];
             $d=$this->diferencia[$clave];
             $p=$this->producto[$clave];
             $c=$this->cociente[$clave];
             echo "<td align=center>$valor</td>";
             echo "<td align=center>$n2</td>";
             echo "<td align=center>$s</td>";
             echo "<td align=center>$d</td>";
             echo "<td align=center>$p</td>";
             echo "<td align=center>$c</td><tr>";
     }
      echo "</table>";

     }
}
$objeto= new Operaciones;

for ($i=1;$i<5;$i++){
    for ($j=1;$j<5;$j++){
        $objeto -> Operaciones($i,$j);
           }
}

$objeto-> imprime();

?>