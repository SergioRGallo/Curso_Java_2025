package c00_helloworld;
public class HolaMundo {
    public static void main(String[] args) {


        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        // 7. Utiliza varios println para imprimir una frase.

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

        // 1.
        System.out.println("Ejercicio 1): ");
        System.out.println("Hola Rodrigo" );

        // 2.
        System.out.println("Ejercicio 2): ");
        System.out.println("Hola \n" + "Rodrigo" );

        // 3.
        System.out.println("Ejercicio 3): ");
        System.out.println("Probando comentarion por linea" ); // System.out.println imprime en pantalla lo que esta en los paretesis

        // 4.
        System.out.println("Ejercicio 4): ");
        System.out.println("Comentario en varias lineas" );
        /*
            Este cuadro
            es para comentarios
            en varias lineas
         */

        // 5.
        System.out.println("Ejercicio 5): ");
        int edad = 36;
        String colorFavorito = "Azul";
        String ciudad = "Pando";

        System.out.println(" - edad: " + edad + " - color: " + colorFavorito + " - ciudad: " + ciudad);

        // 6.
        System.out.println("Ejercicio 6): ");

        System.out.println(ciudad);
        System.err.println("Este es un error del sistema ");
        
        // 7.
        System.out.println("Ejercicio 7): ");
        System.out.println("Esta es un frase de prueba ");
        System.out.println("Continuando con la frase ");
    }

}