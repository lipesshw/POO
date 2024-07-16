package alguma_biblioteca_de_midia_daora;

import java.util.List;

// ThirdPartyYouTubeLib.java
public interface ThirdPartyYouTubeLib {
    Video getVideo(String videoId);
    List<Video> listVideos();
    void downloadVideo(String videoId);
}
