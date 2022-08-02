public class EjercicioTema8 {
    public static void main(String[] args) {
        class Persona {
            private String nombre;
            private int edad;
            private int telefono;
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public String getNombre() {
                return this.nombre;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }
            public int getEdad() {
                return this.edad;
            }

            public void setTelefono(int telefono) {
                this.telefono = telefono;
            }
            public int getTelefono() {
                return this.telefono;
            }
        }

        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(34);
        persona1.setTelefono(789456123);
        System.out.println("Esta persona se llama "+persona1.getNombre());
        System.out.println(persona1.getNombre()+" tiene "+persona1.getEdad()+" años");
        System.out.println("El teléfono de contacto de "+persona1.getNombre()+" es el "+persona1.getTelefono());
    }
}
