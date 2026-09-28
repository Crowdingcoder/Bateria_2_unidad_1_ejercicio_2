public class Fecha {
    private int dia;
    private String mes;
    private int año;

    public Fecha(int dia, String mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha() {
        this(1,"enero",2023);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(this.dia<0 || this.dia>30){
            throw new IllegalArgumentException("La fecha no puede ser menor de 1 o mayor que 30");
        }else {
            this.dia = dia;
        }
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if(this.año <1900){
            throw new IllegalArgumentException("El año no puede ser menor de 1900");
        }else {
            this.año = año;
        }
    }
}
