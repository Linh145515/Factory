package state;

public class Client {
	public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer();

        player.play();   // từ pause → play
        System.out.println(player.getIcon());

        player.play();   // đang play → bấm play
        player.pause();  // play → pause
        System.out.println(player.getIcon());

        player.pause();  // đang pause → bấm pause
    }

}
