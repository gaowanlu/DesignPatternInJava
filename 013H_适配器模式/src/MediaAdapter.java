public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer player;
    @Override
    public void play(String type, String fileName) {
        if(type.equals(VideoPlayer.TYPE)){
            player.playVideo(fileName);
        }else if(type.equals(AudioPlayer.TYPE)){
            player.playAudio(fileName);
        }
    }
    public MediaAdapter(String type){
        if(type.equals(VideoPlayer.TYPE)){
            player=new VideoPlayer();
        }else if(type.equals(AudioPlayer.TYPE)){
            player=new AudioPlayer();
        }
    }
}
