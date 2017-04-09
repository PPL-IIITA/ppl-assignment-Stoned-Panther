package com.pushpendra.assignment.RandomGenerate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Created by panther on 20/3/17.
 */
public class Util {
    private String ioFilename;
    private static final String comma = ",";
    private static final String newLine = "\n";

    /**
     *
     * @param t
     */
    public void generateGifts(int t) {
        //  final String header = "type,name,price,value,rating/utilityclass,difficulty/utilityvalue";
        String[] type;
        type = new String[]{"Essential", "Luxury", "Utility"};
        char[] names = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String[] classofGift;
        classofGift = new String[]{"Standard", "Normal", "Awesome", "Rare", "Romantic"};

        int i;
        Random random = new Random();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("csvFiles/GIFTS.csv", true);
            for (i = 0; i < t; i++) {
                int k, r = random.nextInt(3);
                fileWriter.append(type[r]);
                fileWriter.append(comma);
                StringBuilder sb = new StringBuilder();
                for (k = 0; k < 5; k++) {
                    char c = names[random.nextInt(names.length)];
                    sb.append(c);
                }
                fileWriter.append(sb);
                if (r == 2) {
                    fileWriter.append(comma);
                    int s = random.nextInt(5);
                    fileWriter.append(classofGift[s]);
                }
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

    /**
     *
     * @param t
     */

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

    /**
     *
     * @param t
     */
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

