import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

    @Before
    public void setup() {

    }

    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(5, 5, 5);
        assertEquals(TriangleType.Equilateral, triangle.getType());
    }
    
    @Test
    public void testInvalidTriangle() {
        Triangle triangle = new Triangle(0, 5, 5);
        assertEquals(TriangleType.Invalid, triangle.getType());
    }

    @Test
    public void testIsoceleTriangle() {
        Triangle triangle = new Triangle(0, 5, 5);
        assertEquals(TriangleType.Invalid, triangle.getType());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(1, 2, 5);
        assertEquals(TriangleType.Scalene, triangle.getType());
    }

    @Test
    public void testperimeter8() {
        Triangle triangle = new Triangle(1, 2, 5);
        assertTrue(triangle.perimeter() == 8);
    }

    @Test
    public void testperimeternot8() {
        Triangle triangle = new Triangle(1, 2, 5);
        assertTrue(triangle.perimeter() != 1);
    }

    @Test
    public void testsameperimeter() {
        Triangle triangle1 = new Triangle(1, 2, 5);
        Triangle triangle2 = new Triangle(5, 2, 1);
        assertSame(triangle1.perimeter(), triangle2.perimeter());
    }

    @Test
    public void testsameperimeterzero() {
        Triangle triangle1 = new Triangle(1, 2, 0);
        assertSame(triangle1.perimeter(), 0);
    }

    @After
    public void end() {

    }
}
