# Ejercicios (Fecha limite: 23 agosto)
# Ejercicio 1
Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa. Sabiendo que cuando las horas de trabajo exceden de 40, el resto se considera como horas extra y estas se pagan al doble de una hora normal cuando no exceden las 8 horas; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo que se paga por una hora normal y el resto al triple. El trabajador cobra por hora $40.
# Ejercicio 2
Se le pide implementar un sistema de ingreso digital para una fiesta de quince años. Para ello, se han determinado una serie de reglas. Todas las personas con edades mayores o iguales a 15 años solo pueden entrar si traen regalos. Los jóvenes menores de 15 años entran gratis a la fiesta. Implemente una aplicación que permita ingresar la edad de la persona y determine si puede pasar o no.

### Ejemplo de entrada
```bash
Ingrese la edad del usuario:
23
Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0:
1
```
En este caso, dado que la persona tiene una edad superior a los 15 años, es necesario llevar a cabo una validación adicional.
### Ejemplo de salida
```bash
El invitado sí puede ingresar a la fiesta.
```
### Ejemplo de entrada
```bash
Ingrese la edad del usuario:
13
```
### Ejemplo de salida
```bash
El invitado si puede ingresar a la fiesta
```
## Ejercicio 3
Implemente una aplicación que permita calcular el pago que debe realizar una familia por el consumo de agua potable. Se sabe que existe un pago fijo de $10.00 y que los primeros 50 litros de agua no tienen costo. Entre 51 y 200 litros se cobra $0.5 por litro, y más de 200 litros a $1.5 por litro.

## Ejercicio 4
Escriba un programa que reciba un número `n` e imprima los números impares menores a `n`.

### Ejemplo de entrada
```bash
6
```
### Ejemplo de salida
```bash
1
3
5
```
## Ejercicio 5
Escriba un programa que reciba un número `n`, que será el tamaño de un array que se creará y llenará con números aleatorios. Puede usar la clase Random para generar los números aleatorios. Luego, imprima los elementos del array.

### Ejemplo de entrada
```bash
5
```
### Ejemplo de salida
```bash
El elemento 0 es: 3
El elemento 1 es: 8
El elemento 2 es: 15
El elemento 3 es: 90
El elemento 4 es: 189
```
Puede seguir este tutorial: [Generar números aleatorios en Java](https://www.geeksforgeeks.org/generating-random-numbers-in-java/)

## Ejercicio 6
Dado un valor `n`, genere la siguiente secuencia:
### Ejemplo de entrada
```bash
5
```
### Ejemplo de salida

```
*
* *
* * *
* * * *
* * * * *
```
## Ejercicio 7
La operación factorial se define de la siguiente manera: $5!=5\times4\times3\times2\times1$. Cree una clase Factorial que tenga un método llamado `resolverFactorial` que reciba un valor `n`, donde `n` es el valor del factorial a calcular.

### Ejemplo de entrada
```
5
```
Donde 5 es el valor a calcular: $5!=5\times4\times3\times2\times1=120$

### Ejemplo de salida
```
120
```

## Ejercicio 8
Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Luego, encuentre cuál es el valor más grande.

## Ejercicio 9
Escriba un programa que reciba un valor `n`, que será el tamaño de un array que se inicializará y llenará. Posteriormente, invierta el array (sin usar clases como ArrayList o similares).

### Ejemplo de entrada
```
5
```
Un posible array podria ser $[3,1,4,0,33]$.
### Ejemplo de salida

```
33 0 4 1 3
```
La salida debe ser tal como se muestra en el ejemplo, no de esta forma:
```
33
0
4
1
3
```
## Ejercicio 10
Escriba un programa en el que el usuario debe adivinar un número aleatorio entre 1 y 100. El programa proporcionará pistas si el número es demasiado alto o demasiado bajo. El juego continuará hasta que el jugador adivine correctamente el número. Al final, imprima el número y la cantidad de intentos realizados.
