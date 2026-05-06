package command;


public class ProjectorWorkCommand implements Command {
    private Projector projector;

    public ProjectorWorkCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute() {
        projector.workMode();
    }

    @Override
    public void undo() {
        projector.off();
    }
}
