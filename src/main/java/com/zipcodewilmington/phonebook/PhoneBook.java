package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private LinkedHashMap<String, List<String>> mapp;

    public PhoneBook(Map<String, List<String>> map) {
        if (!map.isEmpty()) {
            mapp.putAll(map);
        } else {
            mapp = new LinkedHashMap<>();
        }
    }

    public PhoneBook() {
        this.mapp = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> phonesN = new ArrayList<>();
        phonesN.add(phoneNumber);
        this.mapp.put(name, phonesN);
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> toAdd = new ArrayList<>();
        if (phoneNumbers != null) {
            for (String s : phoneNumbers) {
                toAdd.add(s);
            }
        }
        this.mapp.put(name, toAdd);
    }

    public void remove(String name) {
        this.mapp.remove(name);
    }

    public Boolean hasEntry(String name) {
        if (this.mapp.containsKey(name)) {
            return true;
        } else {
            for (Map.Entry<String, List<String>> i : this.mapp.entrySet()) {
                if (i.getValue().contains(name)) {
                    return true;
                }
            }
            return false;
        }
    }

    public List<String> lookup(String name) {
       return this.mapp.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry<String, List<String>> entry : this.mapp.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> toAdd = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : this.mapp.entrySet()) {
           toAdd.add(entry.getKey());
        }
        return toAdd;
    }

    public Map<String, List<String>> getMap() {
        return this.mapp;
    }
}
