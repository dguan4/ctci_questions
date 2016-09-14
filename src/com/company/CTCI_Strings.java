package com.company;

import java.util.HashMap;

public class CTCI_Strings {
    /**
     * Returns a boolean based on whether chars in a string are unique, i.e. made up of different letters
     * Uses a hash map implementation which uses extra space
     * From CTCI: can instead use a boolean array of 256 (if ASCII) and simply set the value at a location true,
     * i.e. arr[s.charAt(i)] and if it's true then return false
     * Problem 1.1
     * @param s
     * @return
     */
    public static boolean uniqueCharString(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            if (map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 1);
            }
            else {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a boolean based on whether chars in a string are unique, i.e. made up of different letters
     * Does not use extra space, however running time is roughly O(n^2). Can't think off top of my head how to
     * improve running time.
     * Problem 1.1
     * @param s
     * @return
     */
    public static boolean uniqueCharStringNoDS(String s){
        for (int i = 0; i < s.length(); i++){
            for (int j = i+1; j < s.length(); j++){
                char temp = s.charAt(i);
                if (temp == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Returns a boolean based on whether one string is a permuation of another, i.e. abc and cba and bca and etc
     * Uses two hashmaps and simply returns whether they're equal
     * Can't find an easier way at the moment
     * From CTCI: can simply change to char array (s.toCharArray) and sort then compare the two char arrays
     * Problem 1.3
     * @param s
     * @param t
     * @return
     */
    public static boolean stringPermutation(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            if (map1.get(s.charAt(i)) == null){
                map1.put(s.charAt(i), 1);
            }
            else {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++){
            if (map2.get(t.charAt(i)) == null){
                map2.put(t.charAt(i), 1);
            }
            else {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }
        }
        return map1.equals(map2);
    }

    /**
     * Uses counts of characters in a string to return, depending on length.
     * For example, aaabbbcc returns a3b3c2
     * If the new string is longer than original string, return original
     * Problem 1.5
     * @param s
     * @return
     */
    public static String stringCompression(String s){
        String returnString = "";
        int count = 1;
        char prevChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != prevChar){
                returnString = returnString + prevChar + count;
                count = 0;
            }
            prevChar = s.charAt(i);
            count++;
        }
        returnString = returnString + prevChar + count;
        if (s.length() < returnString.length()){
            return s;
        }
        return returnString;
    }
}
