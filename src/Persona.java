public class Persona {
    private String nombre;
    private int edad;
    private boolean casado;

    public Persona(String nombre, int edad, boolean casado) {
        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
    }

    public Persona() {
        this("No name",18,false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (this.nombre.isBlank() || this.nombre== null){
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (this.edad <18){
            throw new IllegalArgumentException("Debe ser mayor de edad");
        }else {
            this.edad = edad;
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
}
