import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class noter {

    private static Scanner myScanner;
    private static FileWriter myWriter;

    public static void main(String[] args) throws IOException {

        try {
        myScanner = new Scanner(System.in);
                if (args.length == 0) {
                    myWriter = new FileWriter("notes.org", true);

                } else{
                    myWriter = new FileWriter(args[0], true);
                }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        prompt();
    }

    public static void prompt() throws IOException{

        System.out.print("New note: ");
        String note = myScanner.nextLine();
        while(note.length() > 100){
            System.out.println("t");
            note = myScanner.nextLine();

        }
        myWriter.write("* TODO " + note + "\n");
        System.out.println("Note added!");
        myWriter.close();

        }
}
