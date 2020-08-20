# Expresiones Lambda
- Se introducen a partir de Java 8, permite utilizarlas cuando sólo hay un método en el interface o clase abstracta
- Se caracterizan por la siguiente sintaxis:
    ```java
    parameter -> expression body
    ```
- Principales características:
    - Indicar el tipo de la variable es opcional: no es necesario declarar el tipo de un parámetro. El compilador puede deducir lo mismo del valor del parámetro.
    - Los paréntisis son opcionales alrededor de los parámetros: no es necesario declarar un solo parámetro entre paréntesis. Para múltiples parámetros, se requieren paréntesis.
    - Llaves opcionales: no es necesario usar llaves en el cuerpo de la expresión si el cuerpo contiene una sola declaración.
    - Palabra return opcional: el compilador devuelve automáticamente el valor si el cuerpo tiene una sola expresión para devolver el valor. 
    - Se requieren llaves para indicar que la expresión devuelve un valor.

