package edu.gsmascena.iphone.data;

public class Data {
    private int ano;
    private int mes;
    private int dia;

    public Data(int ano, int mes, int dia) {
        this.ano = this.anoValido(ano) ? ano : 2000;
        this.mes = this.mesValido(mes) ? mes : 1;
        this.dia = this.diaValido(dia) ? dia : 1;
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
    
    private boolean anoValido(int ano) {
        return ano > 1999 && ano < 2024 ? true : false;
    }

    private boolean mesValido(int mes) {
        return mes > 0 && mes < 13 ? true : false;
    }

    private boolean diaValido(int dia) {
        return dia > 0 && dia < 32 ? true : false;
    }
}
