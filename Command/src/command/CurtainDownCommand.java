package command;

public class CurtainDownCommand implements Command {
    private Curtain curtain;

    public CurtainDownCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.down();
    }

    @Override
    public void undo() {
        curtain.up();
    }
}