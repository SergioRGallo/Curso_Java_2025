package c02_operators;

public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 20;
        int b = 4;

        System.out.println("Valores de referencia: a=" + a + ", b=" + b);

        int suma = a + b;
        int resta = a - b;
        int multiplication = a * b;
        int division;
        int modulo = a % b;

        /* imprimo los resultados */
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplication);
        if(b!= 0) {
            division = a / b;
            System.out.println("El resultado de la división es: " + division);
        } else {
            System.out.println("El valor del denominador debe ser distinto de 0");
        }

        System.out.println("El resultado del modulo es: " + modulo);

        // 2. Crea una variable para cada tipo de operación de asignación.

        int c = b;
        System.out.println("El valor de c es: " + c);

        System.out.println(c);
        c += 1;
        System.out.println("El nuevo valor 1 de c es: " + c);

        System.out.println(c);
        c -= 1;
        System.out.println("El nuevo valor 2 de c es: " + c);

        c *=2;
        System.out.println("El nuevo valor 3 de c es: " + c);

        c /= 2;
        System.out.println("El nuevo valor 4 de c es: " + c);

        c %= 2;
        System.out.println("El nuevo valor 5 de c es: " + c);


        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(c == 0);
        System.out.println(c != b);
        System.out.println(c < b);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(c == b);
        System.out.println(c > b);
        System.out.println(c != 0);

        // 5. Utiliza el operador lógico and.
        System.out.println("Operadores logicos para AND (&&)");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("Ejemplos para el anterior resultado");
        System.out.println(3 == 3 && 3 > 2);
        System.out.println(3 == 0 && 2 >= 0);
        System.out.println(3 < 5 && 12 > 24);
        System.out.println(3 == 0 && 1 > 5);

        // 6. Utiliza el operador lógico or.

        System.out.println("Operadores logicos para OR (||)");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("Ejemplos para el anterior resultado");
        System.out.println(3 == 3 || 3 > 2);
        System.out.println(3 == 0 || 2 >= 0);
        System.out.println(3 < 5 || 12 > 24);
        System.out.println(3 == 0 || 1 > 5);

        // 7. Combina ambos operadores lógicos.



        // 8. Añade alguna negación.

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        ++a;
        System.out.println(a);
        --a;
        System.out.println(a);


        // 10. Combina operadores aritméticos, de comparación y lógicos.


    }
}
