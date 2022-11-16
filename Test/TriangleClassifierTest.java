import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void displayEquilateralTriangle() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;

        String expected = "Đây là tam giác đều";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }

    @Test
    void displayIsoscelesTriangle() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;

        String expected = "Đây là tam giác cân";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }

    @Test
    void displayNormalTriangle0() {
        int side1 = 5;
        int side2 = 10;
        int side3 = 12;

        String expected = "Đây là tam giác thường";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }

    @Test
    void displayNormalTriangle1() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;

        String expected = "Đây không phải là tam giác";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }

    @Test
    void displayNormalTriangle2() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;

        String expected = "Đây không phải là tam giác";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }

    @Test
    void displayNormalTriangle3() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;

        String expected = "Đây không phải là tam giác";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }

    @Test
    void displayRightTriangle() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String expected = "Đây là tam giác vuông";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }

    @Test
    void displayNormalTriangle4() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 10;

        String expected = "Đây không phải là tam giác";

        String actual = TriangleClassifier.displayTriangleType(side1,side2,side3);
        assertEquals(expected,actual);
    }
}