public class App {
    public static void main(String[] args) throws Exception {
        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("Type du triangle 1 : " + triangle1.getType());

        Triangle triangle2 = new Triangle(0, 0, 0);
        System.out.println("Type du triangle 2 : " + triangle2.getType());

        Triangle triangle3 = new Triangle(2, 3, 7);
        System.out.println("Type du triangle 3 : " + triangle3.getType());
    }
}
