package com.nyuf2014.s03thehackerati.shapes;

import java.util.ArrayList;
import java.util.List;

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

public class ProcessShapes {

    public static void processShapes() throws Exception {
        List<IShape> shapes = new ArrayList<IShape>();
        IShape aCircle = new Circle(2.0);
        shapes.add(aCircle);
        IShape aSquare = new Square(2.0);
        shapes.add(aSquare);
        IShape aRTriangle = new RTriangle(2.0, 2.0);
        shapes.add(aRTriangle);

        for (IShape ss : shapes) {
            System.out.println(ss);
            try {
                // force exception divide by 0 error!
                // ss.foobarDivideByZero();
            } catch (Exception ex) {
                //System.out.println(ex);
                throw ex;
            } finally {
                System.out.println("Hello!");
            }
        }
    }

}
