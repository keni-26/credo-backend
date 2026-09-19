import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        // 1. Create File

        try {

            File file = new File("Kenisha.txt");

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } 
            else {
                System.out.println("File Already Exists");
            }

        } 
        catch (IOException e) {

            System.out.println("Error : " + e.getMessage());
        }


        // 2. Write Data into File

        try {

            FileWriter writer = new FileWriter("Kenisha.txt");

            writer.write("Welcome to Back End - Java Session");

            writer.close();

            System.out.println("Data Written Successfully");

        } 
        catch (IOException e) {

            System.out.println("Error : " + e.getMessage());
        }


        // 3. Read File Information

        File file = new File("Kenisha.txt");

        System.out.println("File Name : " + file.getName());

        System.out.println("Path : " + file.getAbsolutePath());

        System.out.println("Size : " + file.length());


        // 4. Check File Exists

        if (file.exists()) {

            System.out.println("File Exists");

        } 
        else {

            System.out.println("File Does Not Exist");
        }


        // 5. Read File Data

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String data = sc.nextLine();

                System.out.println("File Data : " + data);
            }

            sc.close();

        } 
        catch (IOException e) {

            System.out.println("Error : " + e.getMessage());
        }


        // 6. Delete File

        if (file.delete()) {

            System.out.println("File Deleted Successfully");

        } 
        else {

            System.out.println("File Not Found");
        }

    }
}