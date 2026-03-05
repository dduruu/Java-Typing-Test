/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package typingtest;
import java.util.Scanner;
import java.util.Random;
/**  
 *
 * @author duru
 */
public class TypingTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        String allWords[] = {
            "java", "programming", "computer", "keyboard", "typing", "developer", "algorithm", "data", "structure", "function",
            "variable", "object", "class", "method", "inheritance", "encapsulation", "polymorphism", "interface", "package", "exception",
            "thread", "process", "memory", "storage", "database", "network", "server", "client", "protocol", "request",
            "response", "compile", "execute", "debug", "syntax", "library", "framework", "module", "version", "control",
            "repository", "commit", "branch", "merge", "deploy", "build", "test", "automation", "integration", "software",
            "hardware", "system", "binary", "array", "string", "integer", "boolean", "loop", "condition", "switch",
            "case", "break", "continue", "return", "input", "output", "file", "stream", "buffer", "cache",
            "queue", "stack", "graph", "tree", "node", "edge", "search", "sort", "filter", "map",
            "set", "hash", "index", "query", "model", "view", "controller", "design", "pattern", "security",
            "encryption", "authentication", "authorization", "token", "session", "cookie", "cloud", "virtual", "container", "docker",
            "lambda", "stream", "collection", "generic", "annotation", "reflection", "serializable", "transient", "volatile", "synchronized",
            "deadlock", "mutex", "semaphore", "socket", "packet", "router", "gateway", "firewall", "proxy", "balancing",
            "frontend", "backend", "fullstack", "middleware", "api", "endpoint", "json", "xml", "yaml", "markdown",
            "agile", "scrum", "kanban", "sprint", "backlog", "devops", "kubernetes", "jenkins", "git", "github",
            "gitlab", "bitbucket", "linux", "unix", "terminal", "shell", "script", "bash", "command", "argument",
            "parameter", "primitive", "wrapper", "casting", "abstraction", "constructor", "destructor", "garbage", "collector", "heap",
            "stack", "recursive", "iteration", "constant", "literal", "expression", "statement", "operator", "operand", "assignment",
            "callback", "promise", "async", "await", "threadpool", "parallel", "concurrent", "asynchronous", "blocking", "event",
            "listener", "trigger", "transaction", "rollback", "commit", "schema", "table", "column", "row", "key",
            "primary", "foreign", "join", "union", "select", "insert", "update", "delete", "drop", "truncate"
        };
        
        String [] testWords =  new String[15];
        for (int i=0; i<15; i++){
            testWords[i] = allWords[rand.nextInt(allWords.length)];
        }
        
        System.out.println("Starting the Typing Test...");
        
        System.out.println("Type out the words below, using a space between them:");
        for(int i = 0; i < testWords.length; i++) {
            System.out.print(testWords[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Press ENTER when you are ready to start...");
        input.nextLine(); 
        
        System.out.println("GO!");
        long startTime = System.currentTimeMillis();
        String userInput = input.nextLine().trim();
        
        long endTime = System.currentTimeMillis();
        
        double timeInSecs = (endTime - startTime) / 1000.0 ;
 
        String[] userWords = userInput.split("\\s+");
        int correct = 0;

        if (userInput.isEmpty()) {
            userWords = new String[0];
        }

        for(int i = 0; i < Math.min(userWords.length, testWords.length); i++){
            if (userWords[i].equalsIgnoreCase(testWords[i])){ 
                correct++;
            }
        }
        
        double timeInMins = timeInSecs / 60.0 ; 
        double wpm = (timeInMins > 0) ? (correct / timeInMins) : 0;

        double accuracy = 0;
        if (userWords.length > 0){
            accuracy = ((double) correct / userWords.length) * 100;
        }

        System.out.println("Correct words: " + correct + "/" + testWords.length);
        System.out.printf("Time: %.2f secs\n", timeInSecs);
        System.out.printf("Accuracy: %.2f%%\n", accuracy);
        System.out.printf("Typing Speed (WPM): %.2f\n", wpm);
        
    }
}
