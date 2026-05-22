# BST Fincas Ganaderas - Casanare

## Descripción
Sistema de registro de fincas ganaderas del departamento de Casanare
implementado con un Árbol Binario de Búsqueda (BST) en Java.
Desarrollado para FEDEGÁN - Uniremington Yopal.

## Autor
Jeison - Uniremington - Algoritmos II - 3er Semestre

## Estructura del proyecto
Taller_BST_Estructura_De_Datos/
├── NodoBST.java     → clase que representa cada finca (nodo del árbol)
├── ArbolBST.java    → árbol BST con inserción, recorridos y búsqueda
└── Main.java        → menú interactivo en consola

## Requisitos
- Java 8 o superior
- No requiere librerías externas

## Cómo compilar y ejecutar

Compilar:
javac *.java

Ejecutar:
java Main

## Recorridos implementados
| Recorrido  | Orden                        | Uso                          |
|------------|------------------------------|------------------------------|
| Preorden   | Raíz → Izquierda → Derecha   | Copiar o serializar el árbol |
| Inorden    | Izquierda → Raíz → Derecha   | Listar fincas en orden       |
| Postorden  | Izquierda → Derecha → Raíz   | Eliminar el árbol            |

## ¿Cómo funciona el BST?
- Cada finca tiene un código único asignado por el ICA (clave de ordenamiento)
- Si el código es MENOR que el nodo actual → va a la IZQUIERDA
- Si el código es MAYOR que el nodo actual → va a la DERECHA
- El recorrido inorden lista todas las fincas en orden ascendente de código

## Caso de uso
FEDEGÁN necesita gestionar más de 8.000 registros de fincas en Casanare.
El BST permite búsquedas en O(log n) en lugar de O(n) de un arreglo,
haciendo el sistema mucho más eficiente.
