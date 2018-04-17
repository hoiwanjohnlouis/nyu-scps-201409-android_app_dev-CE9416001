package com.nyuf2014.s03thehackerati.properties;

import java.io.File;

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

public class Properties {

    public static void processFiles2() throws Exception {
        String homeDir = System.getProperty("user.home");
        File myFile = new File(homeDir + File.separator + "MyApp.log");
        System.out.println(myFile);
    }

}
