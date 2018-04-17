package com.nyuf2014.s03.myTimeServerAndClient;

import java.io.IOException;

public class TimeServerTest {

    public static void main(String[] args) {
	// write your code here
        int port = 1971; // pick a port above 1024 (<1024 need root access)
        int backlog = 100; // socket queue length
        TimeServer tServer = null;

        try {
            tServer = new TimeServer("myTimeServer",port, backlog);
            while (true) {
                tServer.processServerQueue();
            }
        }
        catch (IOException ex1) {
            System.err.println(ex1);
        }
        catch (Exception exx) {

        }
        finally {
            if (tServer != null) {
                tServer.close();
            }
        }
    }
}
