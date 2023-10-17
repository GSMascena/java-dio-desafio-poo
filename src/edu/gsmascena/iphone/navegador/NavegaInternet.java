package edu.gsmascena.iphone.navegador;

public interface NavegaInternet {
    
    public Aba exibirPagina(Integer indice);

    public Aba adicionarNovaAba();

    public Aba fecharAba(Integer indice);

    public Aba navegar(String url);

    public Aba atualizarAba();
}
