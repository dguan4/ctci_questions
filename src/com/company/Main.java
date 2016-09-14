package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(uniqueCharString("blab"));
        System.out.println(uniqueCharStringNoDS("blah"));
        System.out.println(stringPermutation("blah", "hlab"));
    }

    /**
     * Returns a boolean based on whether chars in a string are unique, i.e. made up of different letters
     * Uses a hash map.
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

    public static boolean stringPermutation(String s, String t){
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


}
