public class Player implements MediaPlayer{
    private MediaAdapter mediaAdapter;
    @Override
    public void play(String type, String fileName) {
        if(!type.equals(VideoPlayer.TYPE)&&!type.equals(AudioPlayer.TYPE)){
            System.out.println("不支持此类型媒体文件 ERROR:"+fileName+"|"+type);
        }else{
            mediaAdapter=new MediaAdapter(type);
            mediaAdapter.play(type,fileName);
        }
    }
}
