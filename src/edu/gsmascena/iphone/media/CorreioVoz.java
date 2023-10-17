package edu.gsmascena.iphone.media;

import edu.gsmascena.iphone.contato.Contato;
import edu.gsmascena.iphone.data.Data;

public class CorreioVoz extends Audio {

    private Contato emissor;
    private Data data;

    public CorreioVoz(
                        String title, 
                        int duration, 
                        int timeStamp, 
                        Data data, 
                        Contato contato) {
        super(title, duration, timeStamp);
    }

    public Contato getEmissor() {
        return emissor;
    }

    public void setEmissor(Contato emissor) {
        this.emissor = emissor;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
}
