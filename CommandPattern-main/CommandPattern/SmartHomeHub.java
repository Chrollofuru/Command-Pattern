import java.util.HashMap;
import java.util.Map;

public class SmartHomeHub {
    private final Map<String, Command> commandMap = new HashMap<>();

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void executeCommand(String commandName) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            System.out.println("[Hub] Unknown command: " + commandName);
            return;
        }
        command.execute();
    }
}