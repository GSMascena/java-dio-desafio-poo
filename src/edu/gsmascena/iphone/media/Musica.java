package edu.gsmascena.iphone.media;

public class Musica extends Audio {

    private String artista;
    private String album;

    public Musica(
                    String title, 
                    int duration, 
                    int timeStamp, 
                    String artista, 
                    String album) {
        super(title, duration, timeStamp);
        this.artista = artista;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
}
