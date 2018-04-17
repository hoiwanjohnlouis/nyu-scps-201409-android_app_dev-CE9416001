package com.nyuf2014.s03.sets;

import java.io.*;
import java.net.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by computerlab on 9/20/14.
 */
public class SetClient {
    BufferedReader m_input;
    String m_clientName;
    URL m_url;
    URLConnection m_urlConnection;
    List<String> m_list;
    Set<String> m_set;

    public SetClient(String name, String url) throws MalformedURLException {
        m_clientName = name;
        try {
            m_url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void runClient() {
        System.out.println(m_clientName + ": Processing service");
        // connect to server; get streams; process connection
        try {
            connectToServer(); // create Socket to make connection
            getStreams(); // get input streams
            processConnection(); // process connection
        } catch (IOException ex1) {
            System.err.println(m_clientName + ": Trying to connect to server; Received exception.\n" + ex1 + "\n");
            ex1.printStackTrace(System.err);
        } finally {
            closeConnection();
        }
    }
    public void connectToServer() throws IOException {
        System.out.println(m_clientName+": Connecting to server");
        m_urlConnection = m_url.openConnection();
    }

    public void getStreams() throws IOException {
        System.out.println(m_clientName+": Getting streams");
        // set up input stream for objects
        m_input = new BufferedReader(new InputStreamReader(m_urlConnection.getInputStream()));
    }

    public void processConnection() throws IOException {
        System.out.println(m_clientName+": Processing connection");

        System.out.println("rawread");
        String pattern;
        String inputLine;
        m_list = new ArrayList<String>();
        m_set = new HashSet<String>();
        int i = 0;
        pattern = "\\w+";
        while ((inputLine = m_input.readLine()) != null) {
            i++;
            inputLine.replace("\u0000","");
            System.out.printf("%4d: [%s]\n", i, inputLine);
            if (i > 10) break;
            // use regexp to filter out non display characters
//            if (inputLine.matches(pattern)) {
                m_set.add(inputLine);
                m_list.add(inputLine);
//            }

        }
        m_input.close();

        int total = i;
        System.out.println("iterator");
        Iterator iter = m_set.iterator();
        i = 0;
        while (iter.hasNext()) {
            i++;
            System.out.printf("%4d: [%s]\n", i, iter.next());
        }

        System.out.println("\nTotals");
        int distinct = m_set.size();
        System.out.printf("# of elements: %4d\n", total);
        System.out.printf("# of distinct: %4d\n", distinct);

    }

    public void closeConnection() {
        System.out.println(m_clientName+": Terminating connection");
        try {
            m_input.close();
        }
        catch (StreamCorruptedException ex2) {
            System.err.println(m_clientName+": Trying to close server connection; Received exception.\n"+ex2+"\n");
            ex2.printStackTrace(System.err);
        }
        catch (IOException ex1) {
            System.err.println(m_clientName+": Trying to close server connection; Received exception.\n"+ex1+"\n");
            ex1.printStackTrace(System.err);
        }
    }

}
