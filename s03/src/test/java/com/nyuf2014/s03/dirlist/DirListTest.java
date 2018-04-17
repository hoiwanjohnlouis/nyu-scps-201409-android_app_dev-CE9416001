package com.nyuf2014.s03.dirlist;

/**
 * Created by computerlab on 9/20/14.
 */
import java.io.*;

public class DirListTest {
    public static void main(String[] args) {
        try {
            File path = new File(".");
            String[] list = null;
            if (args.length == 0) {
                list = path.list();
            }
            else {
                list = path.list((java.io.FilenameFilter) new DirFilter(args[0]));
            }
            for (int i = 0; i < list.length; i++)
                System.out.println(list[i]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



