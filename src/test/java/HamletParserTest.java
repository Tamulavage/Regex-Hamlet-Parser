import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        // Given

        // When
        hamletParser.replaceHamlet(hamletText);
        hamletText = hamletParser.getHamletData();
        Boolean actual = hamletText.contains("Leon");

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        // Given

        // When
        hamletParser.replaceHaratio(hamletText);
        hamletText = hamletParser.getHamletData();
        Boolean actual = hamletText.contains("Tariq");

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHoratio() {
        // Given

        // When
        hamletParser.replaceHaratio(hamletText);
        hamletText = hamletParser.getHamletData();
        Boolean actual = hamletText.toLowerCase().contains("horatio");

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void testFindHamlet() {
        // Given

        // When
        hamletParser.replaceHamlet(hamletText);
        hamletText = hamletParser.getHamletData();
        Boolean actual = hamletText.toLowerCase().contains("hamlet");

        // Then
        Assert.assertFalse(actual);
    }
}