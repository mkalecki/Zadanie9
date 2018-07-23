

public class Test {

    public static void main(String[] args) {

        ShapeCalculator shapeCalc = new ShapeCalculator();

        Shape line = new Line2D (0,0,7,0);

        double lineLength = shapeCalc.lineLength((Line2D)line);
        System.out.println("długość odcinka: " + lineLength);

        Shape circle = new Circle(10);
        ShapeCalculator calc = new ShapeCalculator();
        System.out.println("pole koła o promieniu " + ((Circle)circle).getRadius() +" to " + calc.circleArea((Circle)circle));

        Shape rect = new Rectangle(2, 7);
        System.out.println("pole prostokąta to " + shapeCalc.rectangleArea((Rectangle)rect));

        Shape ball = new Ball(10);
        double ballVol = shapeCalc.ballVoleme((Ball)ball);
        System.out.println("Objętość kuli o promieniu " + ((Ball) ball).getRadius() +" to " + ballVol);

        Shape cube = new Cube(5);
        double cubeVol = shapeCalc.cubeVolume((Cube)cube);
        System.out.println("Objętość sześcianu o boku " + ((Cube) cube).getSide() + " to " + cubeVol);







    }
}
