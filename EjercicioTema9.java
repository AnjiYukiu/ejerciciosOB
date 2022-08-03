public class EjercicioTema9 {
    public static void main(String[] args) {
        cliente pepito = new cliente();
        pepito.setEdad(34);
        pepito.setNombre("Pepito");
        pepito.setTelefono(123321159);
        pepito.setCredito(6000);
        System.out.println("El cliente tiene " + pepito.getEdad() + " anyos");
        System.out.println("El cliente se llama " + pepito.getNombre());
        System.out.println("El numero de telefono del cliente " + pepito.getNombre() + " es " + pepito.getTelefono());
        System.out.println("El credito asignado al cliente " + pepito.getNombre() + " es de " + pepito.getCredito() + " €");

        trabajador juanito = new trabajador();
        juanito.setEdad(43);
        juanito.setNombre("Juanito");
        juanito.setTelefono(789987456);
        juanito.setSalario(1500);
        System.out.println("El trabajador tiene " + juanito.getEdad() + " anyos");
        System.out.println("El trabajador se llama " + juanito.getNombre());
        System.out.println("El numero de telefono del trabajador " + juanito.getNombre() + " es " + juanito.getTelefono());
        System.out.println("El salario del trabajador " + juanito.getNombre() + " es de " + juanito.getSalario() + " €");
    }
}
class persona {
    private int edad;
    private String nombre;
    private int telefono;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}

final class cliente extends persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}

final class trabajador extends persona {
    private int salario;
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}

