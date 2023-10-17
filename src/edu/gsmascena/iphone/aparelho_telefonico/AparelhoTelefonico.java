package edu.gsmascena.iphone.aparelho_telefonico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.gsmascena.iphone.contato.Contato;
import edu.gsmascena.iphone.media.CorreioVoz;

public abstract class AparelhoTelefonico {
    protected Set<Contato> contatoSet;
    protected List<CorreioVoz> correioVozList;

    public AparelhoTelefonico() {
        this.contatoSet = new HashSet<>();
        this.correioVozList = new ArrayList<>();
    }

    public void ligar(Contato contato) { 
        System.out.println("Ligando para " + contato.getNome());
    }

    public void atender() {
        System.out.println("Chamada Atendida!");
    }

    public List<CorreioVoz> iniciarCorreioVoz() {
        return this.correioVozList;
    }
}
