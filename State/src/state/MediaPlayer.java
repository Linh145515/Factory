package state;

public class MediaPlayer {
	private State state;
    private String icon;

    public MediaPlayer() {
        state = new PausedState(); // mặc định pause
        icon = "Pause Icon";
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

}
