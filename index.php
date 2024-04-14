<?php

$numeros = [1, 2, 3, 4, 5];

$numPares = array_filter($numeros, function($numeros) { return $numeros % 2 == 0; });

print_r($numPares);


?>