package com.company.Test;

import com.company.CTCI_Strings;
import org.junit.Assert.*;
import static org.junit.Assert.*;

public class CTCI_StringsTest {

    @org.junit.Test
    public void testUniqueCharString() throws Exception {
        assertTrue(CTCI_Strings.uniqueCharString("sample"));
        assertFalse(CTCI_Strings.uniqueCharString("test"));
        assertTrue(CTCI_Strings.uniqueCharString("palindrome"));
    }

    @org.junit.Test
    public void testUniqueCharStringNoDS() throws Exception {
        assertTrue(CTCI_Strings.uniqueCharStringNoDS("sample"));
        assertFalse(CTCI_Strings.uniqueCharStringNoDS("test"));
        assertTrue(CTCI_Strings.uniqueCharStringNoDS("palindrome"));
    }

    @org.junit.Test
    public void testStringPermutation() throws Exception {
        assertTrue(CTCI_Strings.stringPermutation("test", "estt"));
        assertFalse(CTCI_Strings.stringPermutation("test", "best"));
    }

    @org.junit.Test
    public void testStringCompression() throws Exception {
        assertEquals(CTCI_Strings.stringCompression("aaabbbccc"), "a3b3c3");
        assertEquals(CTCI_Strings.stringCompression("aaabbbcccaaa"), "a3b3c3a3");
    }
}