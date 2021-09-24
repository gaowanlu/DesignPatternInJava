public class AudioPlayer implements AdvancedMediaPlayer{
    public static final String TYPE="AUDIO";
    @Override
    public void playAudio(String fileName) {
        System.out.println("播放音频:"+fileName);
    }

    @Override
    public void playVideo(String fileName) {

    }
}
