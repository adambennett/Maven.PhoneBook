package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> mapp;

    public PhoneBook(Map<String, List<String>> map) {
        mapp.putAll(map);
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        List<String> phonesN = new ArrayList<>();
        phonesN.add(phoneNumber);
        mapp.put(name, phonesN);
    }

    public void addAll(String name, String... phoneNumbers) {

    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
