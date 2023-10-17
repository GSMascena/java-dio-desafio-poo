package edu.gsmascena.iphone;

import edu.gsmascena.iphone.aparelho_telefonico.AparelhoTelefonico;
import edu.gsmascena.iphone.navegador.Navegador;
import edu.gsmascena.iphone.reprodutor.Reprodutor;
import edu.gsmascena.iphone.reprodutor.ReprodutorMusical;
import edu.gsmascena.iphone.reprodutor.ReprodutorVideo;

public class IPhone extends AparelhoTelefonico {
    private Reprodutor reprodutor;
    private Navegador navegador;

    public IPhone() {
        this.reprodutor = null;
        this.navegador = null;
    }

    public void acessarNavegador () {
        this.navegador = new Navegador();
        this.navegador.adicionarNovaAba();
    }

    public void acessarReprodutorVideo () {
        this.reprodutor = new ReprodutorVideo();
    }

    public void acessarReprodutorMusical () {
        this.reprodutor = new ReprodutorMusical();
    }
}
