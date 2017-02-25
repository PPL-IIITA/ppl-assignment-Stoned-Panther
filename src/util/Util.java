

package util;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by panther on 23/2/17.
 */
public class Util {
    private String ioFilename;
    private static final String comma = ",";
    private static final String newLine = "\n";


    public void generateGifts(int t){
        //  final String header = "type,name,price,value,rating/utilityclass,difficulty/utilityvalue";
        char[] type;
        type = new char[]{'E','L','U'};
        char[] names = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String[] classofGift;
        classofGift = new String[]{"Standard","Normal"};

        int i;
        Random random  = new Random();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("/home/panther/IdeaProjects/Valentine1/src/GIFTS.txt",true);
            // fileWriter.append(header);
            //     fileWriter.append(newLine);
            for(i = 0; i < t; i++){
                int k,r = random.nextInt(3);
                fileWriter.append(type[r]);
                fileWriter.append(comma);
                StringBuilder sb = new StringBuilder();
                for(k = 0; k < 5; k++){
                    char c = names[random.nextInt(names.length)];
                    sb.append(c);
                }
                fileWriter.append(sb);
                fileWriter.append(comma);
                double price,value;
                price = random.nextInt(500);
                value = random.nextInt(500);
                fileWriter.append((char) price);
                fileWriter.append(comma);
                fileWriter.append((char) value);
                fileWriter.append(comma);
                if(r==1){
                    double rating,difficulty;
                    rating = random.nextInt(10);
                    difficulty = random.nextInt(10);
                    fileWriter.append((char) rating);
                    fileWriter.append(comma);
                    fileWriter.append((char) difficulty);
                }
                else {
                    if (r==2){
                        int s = random.nextInt(2);
                        fileWriter.append(classofGift[s]);
                        fileWriter.append(comma);
                        double uval = random.nextInt(500);
                        fileWriter.append((char) uval);
                    }
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
        }
        finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e){
                System.out.println("exception");
            }
        }

    }

    public void generategirls(int t) {
        String[] type;
        type = new String[]{"choosy", "normal", "desperate"};
        char[] names = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i;
        Random random = new Random();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("csvFiles/GIRLS.csv", true);
            // fileWriter.append(header);
            //     fileWriter.append(newLine);
            for (i = 0; i < t; i++) {
                fileWriter.append("Single");
                fileWriter.append(comma);
                int k, r = random.nextInt(3);
                fileWriter.append(type[r]);
                fileWriter.append(comma);
                StringBuilder sb = new StringBuilder();
                for (k = 0; k < 5; k++) {
                    char c = names[random.nextInt(names.length)];
                    sb.append(c);
                }
                fileWriter.append(sb);
                fileWriter.append(newLine);
            }

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

    public void generateboys(int t) {
        String[] type;
        type = new String[]{"miser", "generous", "geeks"};
        char[] names = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i;
        Random random = new Random();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("csvFiles/BOYS.csv", true);
            // fileWriter.append(header);
            //     fileWriter.append(newLine);
            for (i = 0; i < t; i++) {
                fileWriter.append("Single");
                fileWriter.append(comma);
                int k, r = random.nextInt(3);
                fileWriter.append(type[r]);
                fileWriter.append(comma);
                StringBuilder sb = new StringBuilder();
                for (k = 0; k < 5; k++) {
                    char c = names[random.nextInt(names.length)];
                    sb.append(c);
                }
                fileWriter.append(sb);

                fileWriter.append(newLine);
            }

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
