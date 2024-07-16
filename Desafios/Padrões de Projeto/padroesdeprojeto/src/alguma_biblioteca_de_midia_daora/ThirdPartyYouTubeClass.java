package alguma_biblioteca_de_midia_daora;

import java.util.Arrays;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public Video getVideo(String videoId) {
        // Simula o acesso à API do YouTube
        System.out.println("Buscando vídeo " + videoId + " no YouTube...");
        return new Video(videoId, "1");
    }

    @Override
    public List<Video> listVideos() {
        // Simula o acesso à API do YouTube
        System.out.println("Buscando lista de vídeos do YouTube...");
        return Arrays.asList(
                new Video("1", "Video 1"),
                new Video("2", "Video 2"),
                new Video("3", "Video 3")
        );
    }

    @Override
    public void downloadVideo(String videoId) {
        // Simula o acesso à API do YouTube
        System.out.println("Baixando vídeo " + videoId + " do YouTube...");
    }
}
