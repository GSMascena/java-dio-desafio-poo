package edu.gsmascena.iphone.reprodutor;

import java.util.HashSet;
import java.util.Set;

import edu.gsmascena.iphone.media.Video;

public class ReprodutorVideo extends Reprodutor {
    
    private Set<Video> videoSet;

    public ReprodutorVideo() {
        this.videoSet = new HashSet<>();
    }

    public void adicionarVideo(
                            String title, 
                            int duration, 
                            int timeStamp) {
        this.videoSet.add(new Video(title, duration, timeStamp));
    }

    public Video encontrarVideo (String title) {
        if (!this.videoSet.isEmpty())
            for (Video video : videoSet) 
                if (video.getTitle().equalsIgnoreCase(title)) 
                    return video;
        return null;
    }

    public void removerVideo (String title) {
        Video videoRemovido = this.encontrarVideo(title);
        if (videoRemovido != null)
            this.videoSet.remove(videoRemovido);
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
