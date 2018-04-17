package com.nyuf2014.s04contactproject;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by hoiwanlouis on 11/30/14.
 */
public class Person implements IContact {
    protected String m_firstName;
    protected String m_middleName;
    protected String m_lastName;
    protected UUID m_uuid;
    protected ArrayList<IContactImplement> contactImplements;

    private StringBuilder m_sb_name;
    private StringBuilder m_sb_object;

    // ctor
    public Person() {
        m_sb_name = new StringBuilder();
        m_sb_object = new StringBuilder();
        setUUID();
    }

    public Person(String lname, String fname) {
        this();
        setName(lname, fname);
    }

    public Person(String lname, String fname, String mname) {
        setName(lname, fname, mname);
    }

    public String getFullName() {
        return m_sb_name.toString();
    }

    protected void setName(String lname, String fname) {
        m_sb_name.delete(0, m_sb_name.length());
        m_lastName = lname;
        m_firstName = fname;
        m_sb_name.append(m_firstName);
        m_sb_name.append(" ");
        m_sb_name.append(m_lastName);
    }

    protected void setName(String lname, String fname, String mname) {
        m_sb_name.delete(0, m_sb_name.length());
        m_lastName = lname;
        m_firstName = fname;
        m_middleName = mname;
        m_sb_name.append(m_firstName);
        m_sb_name.append(" ");
        m_sb_name.append(m_middleName);
        m_sb_name.append(" ");
        m_sb_name.append(m_lastName);
    }

    protected void setUUID() {
        m_uuid = UUID.randomUUID();
    }

    public UUID getUUID() {
        return m_uuid;
    }

    public String toString() {
        m_sb_object.append(getClass().getName());
        m_sb_object.append("\n\tFull Name = ");
        m_sb_object.append(getFullName());
        m_sb_object.append("\n\tUUID = ");
        m_sb_object.append(getUUID());
        return m_sb_object.toString();
    }
}