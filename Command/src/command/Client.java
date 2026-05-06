package command;


import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        // Tạo thiết bị
        Light light = new Light();
        Curtain curtain = new Curtain();
        Projector projector = new Projector();

        // Tạo command
        Command lightCmd = new LightOnCommand(light);
        Command curtainCmd = new CurtainDownCommand(curtain);
        Command projectorCmd = new ProjectorWorkCommand(projector);

        // Macro (Bắt đầu họp)
        Command meetingMode = new MacroCommand(
                Arrays.asList(lightCmd, curtainCmd, projectorCmd)
        );

        // Controller
        SmartOfficeController controller = new SmartOfficeController();

        System.out.println("=== Start Meeting ===");
        controller.setCommand(meetingMode);
        controller.pressButton();

        System.out.println("=== Undo ===");
        controller.undo();
    }
}