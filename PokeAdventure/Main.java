import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Player player;

    public static void main(String[] args) throws Exception {
        String playerName;
        int mapWidth;
        int mapHeight;
        Scanner scanner = new Scanner(System.in);

        Map<String, Method> commands = new HashMap<>();
        commands.put("help", Main.class.getMethod("printHelp"));
        /*
         * commands.put("quit", Main.class.getMethod("quitGame"));
         * commands.put("forward", Main.class.getMethod("forward"));
         * commands.put("backward", Main.class.getMethod("backward"));
         * commands.put("right", Main.class.getMethod("right"));
         * commands.put("left", Main.class.getMethod("left"));
         * commands.put("state", Main.class.getMethod("printState"));
         */

        System.out.println("Welcome to your new game!");
        System.out.println("Please enter your name:");
        playerName = scanner.nextLine();
        System.out.println("Welcome " + playerName + "!");
        System.out.println("Please enter the height of the map:");
        mapHeight = scanner.nextInt();
        System.out.println("Please enter the width of the map:");
        mapWidth = scanner.nextInt();
        
        if (!"".equals(playerName) && mapHeight > 0 && mapWidth > 0) {
            player = new Player(playerName);
        } else {
            System.out.println("Invalid input. Exiting game.");
            System.exit(1);
        }

        while (true) {
            System.out.println("Please enter a command:");
            String command = scanner.nextLine();
            if (commands.containsKey(command)) {
                commands.get(command).invoke(null);
            } else if (command.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid command. Please try again.");
            }
        }

    }

    public static void printHelp() {
        System.out.println("Test");
    }

    public static Player getPlayer() {
        return player;
    }
}