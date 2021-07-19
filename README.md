# CyberclickTwo

Ejecutando el método main, que se encuentra en src/CyberclickTwo, se muestra en la primera línea la solución de la parte 1 y en la segunda la de la parte 2.

Parte 1:

Ejemplo:

1-3 a: abcde
1-3 b: cdefg
2-9 c: ccccccccc

Cada línea representa la política y la contraseña que debe cumplirla. La política de contraseñas indica el número mínimo y el número máximo de veces que se debe repetir la letra que hay a continuación. Así pues, “1-3 a” significa que la contraseña debe de contener la letra “a” un mínimo de 1 y un máximo de 3 veces. Siguiendo esta norma, en el ejemplo anterior hay un total de 2 contraseñas válidas.

¿Cuántas contraseñas válidas hay en tu input?

Parte 2:

En realidad, la política describe lo siguiente: dos posiciones en la contraseña donde el número indica la posición del carácter (siendo 1 el primero, 2 el segundo… es decir, no hay índice 0). Entonces, exactamente 1 de las dos posiciones que aparecen deben de contener el carácter marcado, otras ocurrencias del carácter son irrelevantes.
