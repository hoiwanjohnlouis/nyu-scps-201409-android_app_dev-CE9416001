package com.nyuf2014.s03.dirlist;

import java.io.File;

/**
 * Created by computerlab on 9/20/14.
 */
public class DirFilter implements FilenameFilter {
    String afn;
    DirFilter(String afn) { this.afn = afn; }

    public boolean accept(File dir, String name) {
        // Strip path information:
        String f = new File(name).getName();
        return f.indexOf(afn) != -1;
    }
}