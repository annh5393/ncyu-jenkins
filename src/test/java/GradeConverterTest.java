import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void convert1() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }


    @Test
    public void convert3() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }

    @Test
    public void convert4() {
        String expected = "B";
        String actual = converter.convert(80);
        assertEquals(expected, actual);
    }

    @Test
    public void convert5() {
        String expected = "C";
        String actual = converter.convert(70);
        assertEquals(expected, actual);
    }

    @Test
    public void convert6() {
        String expected = "D";
        String actual = converter.convert(60);
        assertEquals(expected, actual);
    }

    @Test
    public void convert7() {
        String expected = "E";
        String actual = converter.convert(59);
        assertEquals(expected, actual);
    }

    @Test
    public void convert8() {
        String expected = "Invalid";
        String actual = converter.convert(0);
        assertEquals(expected, actual);
    }

    @Test
    public void convert9() {
        String expected = "Invalid";
        String actual = converter.convert(-1);
        assertEquals(expected, actual);
    }

}
