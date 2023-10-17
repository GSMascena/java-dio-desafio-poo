package edu.gsmascena.iphone.navegador;

public class Aba {
    private String url;

    public Aba(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void acessar () {
        System.out.println("Acessando " + this.url);
    }

    public void atualizar () {
        System.out.println("Aba Atualizada!");
    }
}
