package edu.gsmascena.iphone.reprodutor;

public abstract class Reprodutor {

    protected int volume;
    
    public Reprodutor() {
        this.volume = 25;
    }

    public void tocar() {}

    public void pause() {}

    public void ajustarVolume(int volume) {
        this.volume = volume >= 0 && volume <= 100 ? volume : this.volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
