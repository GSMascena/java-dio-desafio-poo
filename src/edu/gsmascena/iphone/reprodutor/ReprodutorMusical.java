package edu.gsmascena.iphone.reprodutor;

import java.util.HashSet;
import java.util.Set;

import edu.gsmascena.iphone.media.Musica;

public class ReprodutorMusical extends Reprodutor{

    private Set<Musica> musicaSet;

    public ReprodutorMusical() {
        this.musicaSet = new HashSet<>();
    }

    public void adicionarMusica (
                            String title, 
                            int duration, 
                            int timeStamp, 
                            String artista, 
                            String album) {
        this.musicaSet.add(new Musica(title, duration, timeStamp, artista, album));
    }

    public Musica encontrarMusica (String title) {
        if (!this.musicaSet.isEmpty())
            for (Musica musica : musicaSet) 
                if (musica.getTitle().equalsIgnoreCase(title)) 
                    return musica;
        return null;
    }

    public void removerMusica (String title) {
        Musica musicaRemovida = this.encontrarMusica(title);
        if (musicaRemovida != null)
            this.musicaSet.remove(musicaRemovida);
    }

    @Override
    public void tocar() {
        throw new UnsupportedOperationException("Unimplemented method 'tocar'");
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }
}
