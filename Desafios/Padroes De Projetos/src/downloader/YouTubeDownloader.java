package downloader;

import alguma_biblioteca_de_midia_daora.ThirdPartyYouTubeLib;
import alguma_biblioteca_de_midia_daora.Video;

import java.util.List;

// YouTubeDownloader.java
public class YouTubeDownloader {
    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Página de vídeos (imagine um HTML sofisticado)");
        System.out.println("ID: " + video.title);
        System.out.println("Titulo: " + video.id);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        List<Video> list = api.listVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Vídeos mais populares no YouTube (imagine um HTML sofisticado)");
        for (Video video : list) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
