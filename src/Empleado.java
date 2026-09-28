public class Empleado {
    private Persona persona;
    private String cargo;
    private double sueldo;
    private Fecha fechaContrato;

    public Empleado(Persona persona, String cargo, double sueldo, Fecha fechaContrato) {
        this.persona = persona;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fechaContrato = fechaContrato;
    }

    public Empleado() {
        this.persona = new Persona();
        this.cargo = "No cargo";
        this.sueldo = 500_000;
        this.fechaContrato = new Fecha();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (this.cargo.isBlank() || this.cargo == null){
            throw new IllegalArgumentException("El cargo no puede estar vacio");
        }else {
            this.cargo = cargo;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (this.sueldo <214_000){
            throw new IllegalArgumentException("El sueldo no puede ser menor a 214000.");
        } else {
            this.sueldo = sueldo;
        }
    }

    public Fecha getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Fecha fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
}
