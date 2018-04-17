package com.nyuf2014.s03.streamio;

import java.io.*;

/**
 * Created by callas on 10/27/2014.
 */
public class StreamIOTest {
    public static void main(String[] args) throws Exception {
        // write your code here
        File myFile = new File("hoiStreamIO.txt");

        DataOutputStream outFile =
                new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(myFile)));
        System.out.println(myFile.getAbsoluteFile());
        outFile.writeBytes("Here's the value of pi: \n");
        outFile.writeDouble(3.1415926);
        outFile.writeBytes("We are done!\n");
        outFile.close();


        DataInputStream inFile =
                new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(myFile)));
        System.out.println(inFile.readLine());
        System.out.println(inFile.readDouble());
        System.out.println(inFile.readLine());
        inFile.close();

    }
}
