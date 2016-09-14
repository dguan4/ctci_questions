package com.company;

import org.junit.Assert.*;
import static org.junit.Assert.*;

/**
 * Created by divide00 on 9/13/2016.
 */
public class CTCI_StringsTest {

    @org.junit.Test
    public void testUniqueCharString() throws Exception {
        assertTrue(CTCI_Strings.uniqueCharString("sample"));
        assertFalse(CTCI_Strings.uniqueCharString("test"));
        assertTrue(CTCI_Strings.uniqueCharString("palindrome"));
    }

    @org.junit.Test
    public void testUniqueCharStringNoDS() throws Exception {

    }

    @org.junit.Test
    public void testStringPermutation() throws Exception {

    }
}