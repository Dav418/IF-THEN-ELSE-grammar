import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class main {
    private final static String DIR = "input/";
    static boolean fileLoaded = false;
    static boolean breakLoop = false;

    public static void main(String[] args ){

        System.out.println("Welcome to 1604361 (Dawid Gorski) assignment!");
        System.out.println("There is a test file called list01.txt in the 'input' directory");

        Scanner in = new Scanner(System.in);
        gramParser parser = null;
        printOptions();

        while (true){
            String s = in.nextLine();

            switch (s){
                case "1":
                    System.out.println("name of file: ");
                    String name = in.nextLine();
                    parser = (loadFile(name));
                    break;
                case "2":
                    if(fileLoaded){
                        String str =  new PrettyVisitor().visit(parser.parse());
                        System.out.println("Pretty Print "+str);
                    }else{
                        System.out.println("File not loaded. Please run option 1.");
                    }
                    break;
                case "3":
                    if(fileLoaded){
                        ApexVal sum = new gramEval().visit(parser.parse());
                        System.out.println("evals performed: " + sum);
                    }else{
                        System.out.println("File not loaded. Please run option 1.");
                    }
                    break;
                case "4":
                    System.out.println("Bye!");
                    breakLoop = true;
                    break;
                default:
                    System.out.println("Input not recognised");
                    break;
            }
            if(breakLoop){break;}
            printOptions();
        }
    }

    public static void printOptions(){
        System.out.println("Press 1 to load a file");
        System.out.println("Press 2 for pretty print of the file");
        System.out.println("Press 3 to eval the file");
        System.out.println("Press 4 to quit");
        System.out.println("Input: ");
    }

    public static gramParser loadFile(String name){
        try{
            CharStream cs = fromFileName(DIR + name);  //read the input file
            gramLexer lexer = new gramLexer(cs);  //create a lexer object
            CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
            gramParser parser = new gramParser(tokens);
            System.out.println("File loaded successfully");
            fileLoaded = true;
            return parser;
        }catch (IOException e){
            System.out.println("File not found");
        }
        return null;
    }
}
