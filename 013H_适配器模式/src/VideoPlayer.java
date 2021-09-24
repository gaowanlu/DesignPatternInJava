public class VideoPlayer implements AdvancedMediaPlayer{
    public static final String TYPE="VIDEO";
    @Override
    public void playAudio(String fileName) {

    }

    @Override
    public void playVideo(String fileName) {
        System.out.println("播放视频:"+fileName);
    }
}
