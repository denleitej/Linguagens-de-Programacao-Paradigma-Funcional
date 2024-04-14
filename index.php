<?php
$numeros = [1, 2, 3, 4, 5]; // Criando um array de números

// Usando a função array_filter para filtrar os números pares do array
$numPares = array_filter($numeros, function($numeros) { return $numeros % 2 == 0; });

print_r($numPares); // Imprimindo os números pares
?>
