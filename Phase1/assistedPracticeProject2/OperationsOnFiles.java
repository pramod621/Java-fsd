package assistedPracticeProject2;

import java.io.*;
public class OperationsOnFiles {                 //create, read, update, and delete operations on the files

    public static void main(String[] args) {
        String fileName = "sample.txt";
        createFile(fileName);
        readFile(fileName);
        updateFile(fileName, "This is the updated content.");
        readFile(fileName);
        deleteFile(fileName);
    }
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
    public static void readFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    public static void updateFile(String fileName, String newContent) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(newContent);
            writer.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while updating the file: " + e.getMessage());
        }
    }
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.err.println("Failed to delete the file.");
        }
    }
}