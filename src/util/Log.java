package util;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by panther on 26/2/17.
 */
public class Log {
    /**
     *
     * @param message
     */
    public static void info(String message){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("csvFiles/Logging.log", true);
            fileWriter.append("INFO : ").append(message);
            fileWriter.append("\n");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("exception");
            }
        }
    }

}
