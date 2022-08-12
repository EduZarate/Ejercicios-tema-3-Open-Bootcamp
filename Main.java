public class Main {

    // Llamar la función en el main y darle valores:

public static void main(String[] args) {
    suma(1, 2, 3);


    // Crear un objeto miCoche en el main y añadirle una puerta.

    Coche miCoche = new Coche();
    miCoche.SumarPuerta();
    System.out.println(miCoche.puertas); 
}

    // Crear una función con tres parámetros que sean números que se suman entre sí:

static void suma (int a, int b, int c) {
    System.out.println(a + b + c); 
}


}

// ************************* SEGUNDA PARTE *********************************

    // Crear una clase coche:
    // Dentro de la clase coche, una variable numérica  que almacene el número de puertas que tiene.
    // Una función que incremente el número de puertas que tiene el coche.

    class Coche {
        public int puertas = 4;
        public void SumarPuerta() {
            this.puertas++;
        }
    }


