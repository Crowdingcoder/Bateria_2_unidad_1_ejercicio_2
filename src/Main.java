void main() {
    Empresa valve = new Empresa();
    Empleado e1= new Empleado(new Persona("Seba",28,true),"analista",600_000,new Fecha(25,"octubre",2009));
    Empleado e2= new Empleado(new Persona("Pedro",30,false),"redes",600_000,new Fecha(15,"octubre",2011));
    Empleado e3= new Empleado(new Persona("Juan",67,false),"redes",900_000,new Fecha(15,"octubre",1980));

    System.out.println("\n----Aumento sueldo vacio----");
    valve.aumentarSueldo();

    System.out.println("\n----Busqueda años lista vacia----");
    valve.empleadosContratadosEntre(1940,1950);

    System.out.println("\n----Sueldos vacio----");
    valve.calcularSueldos();

    System.out.println("\n----Agregar empleados----");
    valve.agregarEmpleado(e1);
    valve.agregarEmpleado(e2);
    valve.agregarEmpleado(e3);

    System.out.println("\n----Busqueda año----");
    valve.empleadosContratadosEntre(2013,2015);

    System.out.println("\n----Aumento sueldo----");
    valve.aumentarSueldo();

    System.out.println("\n----Busqueda año----");
    valve.empleadosContratadosEntre(2008,2012);

    System.out.println("\n----Sueldos----");
    valve.calcularSueldos();
}
