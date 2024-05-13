import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class noter {

    private static Scanner myScanner;
    private static FileWriter myWriter;
    private static String bullet;
    private static String targetFileName;
    //INSERT YOUR DESIRED FILE HERE
    //private static String targetFileName = "targetfile.type"

    public static void main(String[] args) throws IOException {
        if (args.length == 1) {
            targetFileName = args[0];
        }

        else { if(targetFileName == null) {
                  targetFileName = "notes.org";}}
        setBullet();

        try {
        myScanner = new Scanner(System.in);
        myWriter = new FileWriter(targetFileName, true);
        }

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        prompt();
    }

    public static void setBullet(){
        int i = targetFileName.lastIndexOf('.');
        String fileType = targetFileName.substring(i + 1);

        switch(fileType) {
            case "txt":
                bullet = "- ";
                return;
            case "org":
                bullet = "* TODO ";
                return;
            case "md":
                bullet = "- [  ] ";
                return;
            case "java":
                bullet = "// TODO ";
                return;
            case "py":
                bullet = "# TODO ";
                return;
            case "js":
                bullet = "// TODO ";
        }

        if (i == -1 ){
        System.out.println(
        "WARNING: submitted argument does not have file type." +
        "Defaulting to txt.");
        targetFileName = targetFileName.concat(".txt");
        }

    }

    public static void prompt() throws IOException{
        System.out.print("New note: ");
        String note = myScanner.nextLine();
        while(note.length() > 100){
            System.out.println("Too long a note!");
            note = myScanner.nextLine();
        }
        myWriter.write(bullet + note + "\n");
        myWriter.close();
    }
    }
// TODO Add comment prefixes for programming languages
// TODO Add timestamp option?
// TODO Add option to set working directory
// TODO Add option to set/reset default target file
// TODO experiment with having multiple directories
// TODO Experiment with specifying where to place new notes
