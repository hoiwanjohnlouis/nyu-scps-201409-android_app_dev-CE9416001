package com.nyuf2014.s03.sets;

import java.io.*;

/**
 * Created by computerlab on 9/20/14.
 */
public class SetClientTest {

    public static void main(String[] args) {
        // write your code here
        SetClient sClient = null;

        String serverHost = "http://mjacar.github.io/";

        try {
            sClient = new SetClient("mySetClient",serverHost);
            sClient.runClient();
        }
        catch (Exception ex2) {
            System.err.println(ex2);
        }
        finally {
            if (null != sClient) {
                sClient.closeConnection();
            }
        }
    }

}
