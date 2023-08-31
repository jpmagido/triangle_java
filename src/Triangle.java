public class Triangle
 {
    private int l1, l2, l3;

    public Triangle(int a, int b, int c) {
        l1 = a;
        l2 = b;
        l3 = c;
    }
        
    public TriangleType getType() {
        if (l1 == 0 || l2 == 0 || l3 == 0) {
            return TriangleType.Invalid;
        }

        if (l1 == l2 && l2 == l3) {
            return TriangleType.Equilateral;
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            return TriangleType.Isocele;
        } else {
            return TriangleType.Scalene;
        }
    }

    public Integer perimeter() {
        if (l1 == 0 || l2 == 0 || l3 == 0) {
            return 0;
        }
        
        return l1 + l2 + l3;
    }
}
