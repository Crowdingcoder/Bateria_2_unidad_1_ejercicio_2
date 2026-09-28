import java.util.ArrayList;
public class Empresa extends Empleado {
    private ArrayList<Empleado>empleados;
    public Empresa(){
    this.empleados = new ArrayList<>();
        System.out.println("Lista creada");
    }

    public void agregarEmpleado(Empleado nuevo){
        this.empleados.add(nuevo);
        System.out.println("Empleado agregado!!!");
    }

    public void aumentarSueldo() {
        boolean bandera = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCargo() == "analista" && empleado.getFechaContrato().getAño() <= 2010 ){
                bandera = true;
                empleado.setSueldo(empleado.getSueldo()*1.1);
                System.out.println("Sueldo aumentado!!!");
            }
        }
        if (bandera == false){
            System.out.println("Los sueldos no fueron aumentados");
        }
    }

    public void empleadosContratadosEntre(int año,int año2){
        boolean encontrado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getFechaContrato().getAño() > año && empleado.getFechaContrato().getAño() < año2){
                encontrado = true;
                System.out.println("Nombre:"+ empleado.getPersona().getNombre());
                System.out.println("Edad:"+ empleado.getPersona().getEdad());
                System.out.println("Cargo:"+ empleado.getCargo());
                System.out.println("Sueldo $"+empleado.getSueldo());
                System.out.println("Año contrato: "+empleado.getFechaContrato().getAño());
            }
        }
        if(encontrado == false){
            System.out.println("No se encontraron empleados entre los años "+año+" y "+año2);
        }
    }
    public void calcularSueldos(){
        int sueldoAnalistas = 0;
        int sueldoRedes = 0;
        boolean banderaAnalista = false;
        boolean banderaRedes = false;
        boolean banderaCool= false;
        for (Empleado empleado : empleados) {
            if(empleado.getCargo() == "analista"){
                banderaAnalista = true;
                banderaCool = true;
                sueldoAnalistas = (int) (empleado.getSueldo() + sueldoAnalistas);
            }
            if (empleado.getCargo() == "redes"){
                banderaRedes = true;
                banderaCool = true;
                sueldoRedes = (int) (empleado.getSueldo() + sueldoRedes);
            }
        }
        if(banderaCool){
            System.out.println("Tipo cuenta monto saldos:");
            if (banderaAnalista){
                System.out.println("Monto total sueldos analistas $"+sueldoAnalistas);
            }
            if (banderaRedes){
                System.out.println("Monto total sueldos redes $"+sueldoRedes);
            }
        } else {
            System.out.println("No hay empleados analistas o de redes.");
        }
    }
}
