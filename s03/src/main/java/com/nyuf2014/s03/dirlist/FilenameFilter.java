package com.nyuf2014.s03.dirlist;

import java.io.File;

/**
 * Created by computerlab on 9/20/14.
 */
public interface FilenameFilter {
    boolean accept(File dir, String name);
}

