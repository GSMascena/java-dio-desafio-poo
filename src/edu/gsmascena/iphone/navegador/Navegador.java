package edu.gsmascena.iphone.navegador;

import java.util.HashMap;
import java.util.Map;

public class Navegador implements NavegaInternet {

    private Integer abaQuantidade;
    private Map<Integer, Aba> abaMap;
    private Integer indiceAtual;
    private Aba abaAtual;

    public Navegador() {
        this.abaMap = new HashMap<>();
        this.abaQuantidade = 0;
        this.adicionarNovaAba();
    }

    @Override
    public Aba exibirPagina(Integer indice) {
        this.abaAtual = this.abaMap.get(indice);
        this.indiceAtual = indice;
        this.abaAtual.acessar();
        return this.abaAtual;
    }

    @Override
    public Aba adicionarNovaAba() {
        Aba novaAba = new Aba("Nova Aba");
        this.abaMap.put(++abaQuantidade, novaAba);
        return this.exibirPagina(abaQuantidade);
    }

    private void resetIndice() {
        Map<Integer, Aba> novoAbaMap = new HashMap<>();
        int count = 0;
        for (Aba aba : this.abaMap.values()) {
            count++;
            novoAbaMap.put(count, aba);
        }
    }

    @Override
    public Aba fecharAba(Integer indice) {
        if (!this.abaMap.isEmpty()) {
            this.abaMap.remove(indice);
            this.resetIndice();
        }
            
        return this.exibirPagina(indice - 1);
    }

    @Override
    public Aba atualizarAba() {
        this.abaAtual.atualizar();
        this.abaAtual.acessar();
        return this.abaAtual;
    }

    @Override
    public Aba navegar(String url) {
        this.abaAtual.setUrl(url);
        return this.exibirPagina(indiceAtual);
    }
    
}
