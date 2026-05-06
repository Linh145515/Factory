package state;

public class PausedState implements State {

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resuming music...");
        player.setState(new PlayingState());
        player.setIcon("Play Icon");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused...");
    }
}