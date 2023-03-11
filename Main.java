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



        commands.get("help").invoke(null);

    }

    public static void printHelp(){
        System.out.println("Test");
    }
}