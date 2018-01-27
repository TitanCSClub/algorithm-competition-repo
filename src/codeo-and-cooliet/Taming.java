import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;

/**
 * Okay, so this code requires story time:
 * So, I've used ScriptEngineManager before (and used to use RhinoScript before
 * JDK 1.6 existed), but never thought about using it in a competition context.
 * This was solved after the competition and I was completely shook about it
 * working. Afterall, all I did with ScriptEngine was, well, use it for its
 * intended usage of JavaScript interpretation. I used to to make a game have
 * a reloadable plugin system back in 2013, but forgot about the fact that you
 * can write JavaScript code in a Java file through using engine.eval()
 * and in "" putting the JavaScript code. Since JavaScript doesn't have as much
 * boilerplate as Java, simply typing "1 + 4" is legal. And you can see how this
 * benefits this problem immensely.
 * <p>
 * Once again, SHOOK
 */
public class Taming {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cases; i++) {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            String infix = scanner.nextLine();
            System.out.println(engine.eval(infix));
        }
    }
}
    