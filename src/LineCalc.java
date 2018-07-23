public class LineCalc {
    double lineLength (Line2D line){
        double length = Math.sqrt((line.getX2()-line.getX1())*(line.getX2()-line.getX1())+(line.getY2()-line.getY1())*(line.getY2()-line.getY1()) );
        return length;
    }
}
