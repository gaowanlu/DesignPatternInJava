public class Main {
    public static void main(String[] args) {
        Player player=new Player();
        player.play("AUDIO","hello.mp3");
        player.play("VIDEO","hello.mp4");
        player.play("txt","hello.txt");
    }
}
