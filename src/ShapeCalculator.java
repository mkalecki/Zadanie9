public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{

    @Override
    public double lineLength(Line2D line) {
        return super.lineLength(line);
    }

//    @Override
//    public double circleArea(Circle circle) {
//        return Shape.PI*circle.getRadius()*circle.getRadius();
//    }
//
//    @Override
//    public double rectangleArea(Rectangle rectangle) {
//        return rectangle.getSideA()*rectangle.getSideB();
//    }
//
//    @Override
//    public double ballVoleme(Ball ball) {
//        double v = 4*Shape.PI*ball.getRadius()*ball.getRadius()*ball.getRadius()/3;
//        return v;
//    }
//
//    @Override
//    public double cubeVolume(Cube cube) {
//        return cube.getSide()*cube.getSide()*cube.getSide();
//    }


    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape instanceof Rectangle) {
            double rectArea = ((Rectangle) shape).getSideA()*((Rectangle) shape).getSideB();
        return rectArea;
        }
        double circleArea = Shape.PI*((Circle)shape).getRadius()*((Circle)shape).getRadius();
        return circleArea;
    }

    @Override
    public double volume(Shape3D shape) {
        if (shape instanceof Cube) {
            double cubeVolume = ((Cube) shape).getSide()*((Cube) shape).getSide()*((Cube) shape).getSide();
            return cubeVolume;
        }
        double ballVolume = 4*Shape.PI*((Ball)shape).getRadius()*((Ball)shape).getRadius()*((Ball)shape).getRadius()/3;
        return ballVolume;
    }
}
