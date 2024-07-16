package proxy;

import alguma_biblioteca_de_midia_daora.ThirdPartyYouTubeLib;
import alguma_biblioteca_de_midia_daora.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private Map<String, Video> cachePopular = new HashMap<>();
    private Map<String, Video> cacheAll = new HashMap<>();

    public CachedYouTubeClass(ThirdPartyYouTubeLib youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        }
        return video;
    }

    @Override
    public List<Video> listVideos() {
        if (cachePopular.isEmpty()) {
            List<Video> videos = youtubeService.listVideos();
            for (Video video : videos) {
                cachePopular.put(video.id, video);
                cacheAll.put(video.id, video);
            }
        }
        return new ArrayList<>(cachePopular.values());
    }

    @Override
    public void downloadVideo(String videoId) {
        if (!cacheAll.containsKey(videoId)) {
            youtubeService.downloadVideo(videoId);
        }
        System.out.println("Downloading video " + videoId + " from cache...");
    }
}
