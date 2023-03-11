import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{


        Map<String, Method> commands = new HashMap<>();
        commands.put("help",Main.class.getMethod("printHelp"));
        commands.put("quit",Main.class.getMethod("quitGame"));
        commands.put("forward",Main.class.getMethod("forward"));
        commands.put("backward",Main.class.getMethod("backward"));
        commands.put("right",Main.class.getMethod("right"));
        commands.put("left",Main.class.getMethod("left"));
        commands.put("state", Main.class.getMethod("printState"));


        commands.get("help").invoke(null);

    }

    public static void printHelp(){
        System.out.println("Test");
    }
}