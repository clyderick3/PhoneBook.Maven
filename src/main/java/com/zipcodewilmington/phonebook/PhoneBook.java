package com.zipcodewilmington.phonebook;

import java.util.List;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        Map<String, List<String>> phonebook = new LinkedHashMap<>();
        this.phonebook = phonebook;
    }

    public void add(String name, String phoneNumber) {
        List<String> addToPhonebook = new ArrayList<>();
        addToPhonebook.add(phoneNumber);
        phonebook.put(name, addToPhonebook);
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> addAllPhonebook = new ArrayList<>();
        for (int i = 0; i < phoneNumbers.length; i ++){
            addAllPhonebook.add(phoneNumbers[i]);
        }
        phonebook.put(name, addAllPhonebook);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
