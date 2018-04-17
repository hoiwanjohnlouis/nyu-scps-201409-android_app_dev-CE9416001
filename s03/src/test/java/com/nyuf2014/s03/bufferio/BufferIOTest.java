package com.nyuf2014.s03.bufferio;

import java.io.*;

/**
 * Created by computerlab on 9/20/14.
 */


public class BufferIOTest {


    public static void main(String[] args) throws Exception {
        // write your code here
        File myFile = new File("hoiBufferIO.txt");

        PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
        System.out.println(myFile.getAbsoluteFile());
        pwriter.println("Here's the value of pi:");  // no need for "\n", bufferedWrite auto includes
        pwriter.println(3.14159);
        pwriter.println("We are done!");
        pwriter.close();

        BufferedReader preader = null;
            try {
                preader = new BufferedReader(new FileReader(myFile));
                System.out.println(myFile.getAbsoluteFile());
                System.out.println(preader.readLine());
                String piString = preader.readLine();
                double piValue = Double.parseDouble(piString);
                System.out.println(piValue);
                System.out.println(preader.readLine());
            } catch (NumberFormatException ex1) {
                System.out.println(ex1);
            } catch (NullPointerException ex2) {
                System.out.println(ex2);
            } catch (FileNotFoundException ex3) {
                System.out.println(ex3);
            } finally {
                if (preader != null) {
                    preader.close();
                }
            }
    }


}
