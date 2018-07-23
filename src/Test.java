

public class Test {

    public static void main(String[] args) {

        ShapeCalculator shapeCalc = new ShapeCalculator();

        Shape line = new Line2D(0, 0, 7, 0);

        Shape circle = new Circle(10);

        Shape rect = new Rectangle(2, 7);


        Shape ball = new Ball(10);

        Shape cube = new Cube(5);

        Shape[] shapes = {line, rect, circle, ball, cube};
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Line2D) {
                double length = shapeCalc.lineLength((Line2D) line);
                System.out.printf("długość odcinka o współrzędnych (%d,%d) i (%d,%d) to %.2f \n",
                        ((Line2D) line).getX1(),((Line2D) line).getY1(),((Line2D) line).getX2(),((Line2D) line).getY2(),length);
            }
            if (shapes[i] instanceof Rectangle) {
                System.out.printf("pole prostokąta o bokach %d i %d to %f", ((Rectangle)shapes[i]).getSideA(), ((Rectangle)shapes[i]).getSideB(), shapeCalc.shapeArea((Rectangle)shapes[i]));
            }

            if (shapes[i] instanceof Circle) {
                System.out.println("pole koła o promieniu " + ((Circle)shapes[i]).getRadius() + " to " + shapeCalc.shapeArea((Circle)shapes[i]));
            }

            if (shapes[i] instanceof Cube) {
                double cubeVol = shapeCalc.volume((Cube) shapes[i]);
                System.out.println("Objętość sześcianu o boku " + ((Cube) shapes[i]).getSide() + " to " + cubeVol);
            }

            if (shapes[i] instanceof Ball) {
                double ballVol = shapeCalc.volume((Ball) shapes[i]);
                System.out.println("Objętość kuli o promieniu " + ((Ball)shapes[i]).getRadius() + " to " + ballVol);

            }

        }


    }
}
