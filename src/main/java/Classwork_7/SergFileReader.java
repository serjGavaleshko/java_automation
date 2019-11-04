package Classwork_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SergFileReader {
    public void sheatcode() throws IOException {

        try {

        BufferedReader reader = new BufferedReader(new FileReader("C:\\input.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    } catch (IOException e) {
            e.printStackTrace();}
        }
}
