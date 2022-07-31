public class EjerciciosTema4 {
    public static void main(String[] args) {

        //===================CONDICIONAL IF============================

        int numero = 53;
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        //====================BUCLE WHILE==============================

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("El número es " + numeroWhile);
            numeroWhile++;
        }

        //====================BUCLE DO-WHILE===========================

        do {
            System.out.println("El número es " + numeroWhile);
            numeroWhile = +3;
        } while (numeroWhile < 3)

        //====================BUCLE FOR================================

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de la variable numeroFor es" + numeroFor);
        }
        //====================SWITCH===================================

        var estacion = "Primavera";
        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Es entretiempo");
        }
    }
}
