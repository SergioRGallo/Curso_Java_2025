package c01_begginer;

import java.lang.reflect.Type;

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        System.out.println("Ejercicio 1: ");

        String nombre = "Rodrigo";
        System.out.println(nombre);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        System.out.println("Ejercicio 2: ");

        int edad = 36;
        System.out.println(edad);

        // 3. Crea una variable double con tu altura en metros.
        System.out.println("Ejercicio 3: ");

        double altura = 1.7;
        System.out.println(altura +  " metros");

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        System.out.println("Ejercicio 4: ");

        boolean programar = true;
        System.out.println("me gusta programar: " + programar);

        // 5. Declara una constante con tu email.
        System.out.println("Ejercicio 5: ");

        final String email = "Rodrigo@gmail.com";
        System.out.println("Direccion de correo : " + email);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        System.out.println("Ejercicio 6: ");

        char inicial = 'R';
        System.out.println("La inicial de mi nombre es: " + inicial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        System.out.println("Ejercicio 7: ");

        String localidad = "Canelones";

        localidad = "Pando";
        System.out.println("Mi localidad es: " + localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        System.out.println("Ejercicio 8: ");

        int a = 8;
        int b = 24;
        System.out.println("La suma de a + b es: " + (a + b));

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println("Ejercicio 9: ");

        System.out.println("El typo de variable para Localidad es: " + localidad.getClass().getSimpleName());

        // para variables primitivas
        Object obj = a;
        System.out.println("variable de typo primitiva 'a' es igual a: " + obj.getClass().getSimpleName() );

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        System.out.println("Ejercicio 10: ");

        String apellido;

        apellido = "Gallo";
        System.out.println("Mi apellido es:  " + apellido);
    }
}
