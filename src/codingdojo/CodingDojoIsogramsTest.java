package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingDojoIsogramsTest {

    @Test
    public void tests() {
        assertEquals(true, CodingDojoIsograms.isIsogram("Dermatoglyphics"));
        assertEquals(true, CodingDojoIsograms.isIsogram("isogram"));
        assertEquals(false, CodingDojoIsograms.isIsogram("moose"));
        assertEquals(false, CodingDojoIsograms.isIsogram("isIsogram"));
        assertEquals(false, CodingDojoIsograms.isIsogram("aba"));
        assertEquals(false, CodingDojoIsograms.isIsogram("moOse"));
        assertEquals(true, CodingDojoIsograms.isIsogram("thumbscrewjapingly"));
        assertEquals(true, CodingDojoIsograms.isIsogram(""));
    }

}