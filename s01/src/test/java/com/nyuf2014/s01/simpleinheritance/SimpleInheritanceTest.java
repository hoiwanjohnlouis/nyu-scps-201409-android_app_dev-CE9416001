package com.nyuf2014.s01.simpleinheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by callas on 9/16/2014.
 */
public class SimpleInheritanceTest {

    static List<Animal> m_animals = new ArrayList<Animal>();

    public static void main(String[] args) {
        // write your code here
        System.out.println("Starting Session01 Main");

        Animal collie = new Collie();
        m_animals.add(collie);

        Animal siamese = new Siamese();
        m_animals.add(siamese);

        Animal stuffedPoodle = new StuffedPoodle();
        m_animals.add(stuffedPoodle);

        for (Animal animal : m_animals) {
            System.out.println("iterating... a(n) " + animal.getClass().getSimpleName() + " says " + animal.talk());
        }

        System.out.println("Ending Session01 Main");
    }
}
