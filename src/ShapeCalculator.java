public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{

    @Override
    public double lineLength(Line2D line) {
        return super.lineLength(line);
    }

    @Override
    public double circleArea(Circle circle) {
        return Shape.PI*circle.getRadius()*circle.getRadius();
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideA()*rectangle.getSideB();
    }

    @Override
    public double ballVoleme(Ball ball) {
        double v = 4*Shape.PI*ball.getRadius()*ball.getRadius()*ball.getRadius()/3;
        return v;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.getSide()*cube.getSide()*cube.getSide();
    }
}
