package Homework_8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReadWriteToFile {
    public void writeToFile() {
        try {
        File file = new File("C:\\Users\\logs.txt");

        String input = "";

        while (!input.equals("exit")) {
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            System.out.println("Logged: " + input);

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
            String formattedDate = currentTime.format(formatter);

            writer.write(formattedDate + "  " + input + "\r\n");

            writer.flush();
        }

        } catch (IOException e) {

            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}

