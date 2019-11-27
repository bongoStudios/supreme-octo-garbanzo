package proyecto.ej2;

public class Fecha {

    private int dia;
    private int mes;
    private int ano;


    public Fecha() {

        this.dia = 1;
        this.mes = 1;
        this.ano = 2001;
    }

    public Fecha(int newDia, int newMes, int newAno) {

        this.dia = newDia;
        this.mes = newMes;
        this.ano = newAno;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }



}
