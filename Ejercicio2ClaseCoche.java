public class Ejercicio2ClaseCoche {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.sumaPuerta();
        System.out.println("El coche tiene un total de "+miCoche.puerta+" puertas");

    }
    static class coche{
        public int puerta = 4;
        public void sumaPuerta() {
            this.puerta++;
        }

    }
}
