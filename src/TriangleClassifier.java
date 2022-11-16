public class TriangleClassifier {
    public static String displayTriangleType(int side1, int side2, int side3) {
        return getTriangleType(side1, side2, side3);
    }
    private static String getTriangleType(int side1, int side2, int side3) {
        if (Math.abs(side2 - side3) < side1 && side1 < side2 + side3) {
            if (side1 == side2 && side2 == side3) {
                return "Đây là tam giác đều";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                return "Đây là tam giác cân";
            } else if (Math.pow(side1,2) + Math.pow(side2,2) == Math.pow(side3,2) || Math.pow(side1,2) + Math.pow(side3,2) == Math.pow(side2,2) || Math.pow(side2,2) + Math.pow(3,2) == Math.pow(1,2)) {
                return "Đây là tam giác vuông";
            } else {
                return "Đây là tam giác thường";
            }
        } else {
            return "Đây không phải là tam giác";
        }
    }
}
