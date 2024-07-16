import alguma_biblioteca_de_midia_daora.ThirdPartyYouTubeClass;
import downloader.YouTubeDownloader;
import proxy.CachedYouTubeClass;

public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new CachedYouTubeClass(new ThirdPartyYouTubeClass()));

        long naive = testDownloader(naiveDownloader);
        long smart = testDownloader(smartDownloader);

        System.out.print("Tempo economizado pelo cache do proxy: " + (naive - smart) + "ms");
    }

    private static long testDownloader(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        //downloader.renderPopularVideos();
        downloader.renderVideoPage("THE BOX MEDLEY FUNK 2");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Tempo decorrido: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
