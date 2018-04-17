package com.nyuf2014.s03thehackerati.streamio;

import java.io.*;

/**
 * ************************************************************************
 * Copyright 01/28/2016 HW Tech Services, LLC
 * <p>
 * Login   KimSoYeon
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * *************************************************************************
 */

public class StreamIO {

    public static void processFiles1() throws Exception {
        File myFile = new File("RobMa.txt");
        //System.out.println(myFile.getAbsoluteFile());
        DataOutputStream output =
                new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(myFile)));
        System.out.println("----- DataOutputStream Compressed (for numeric data) -----");
        System.out.println(myFile.getAbsoluteFile());
        output.writeBytes("Here's the value of pi: \n"); // NL req for next double field
        output.writeDouble(3.14159);
        output.writeBytes("We are done once!\n");
        output.close();

        DataInputStream input =
                new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(myFile)));
        System.out.println("----- DataInputStream -----");
        System.out.println(input.readLine());
        System.out.println(input.readDouble());
        System.out.println(input.readLine());
        input.close();

        PrintWriter pwriter = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
        System.out.println("----- PrintWriter Ascii Character (including numeric data) -----");
        System.out.println(myFile.getAbsoluteFile());
        pwriter.println("Here's the value of pi: "); // cannot have a blank line
        pwriter.println(3.14159);
        pwriter.println("We are done twice!\n\n");
        pwriter.close();

        BufferedReader preader = null;
        try {
            preader = new BufferedReader(new FileReader(myFile));
            System.out.println("----- BufferedReader -----");
            System.out.println(myFile.getAbsoluteFile());
            System.out.println(preader.readLine());
            double piValue = Double.parseDouble(preader.readLine());
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
