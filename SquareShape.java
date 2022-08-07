public class SquareShape extends  RectangleShape{
    private double side;
    public SquareShape(){

    }
    public SquareShape(double side){
        this.side=side;
    }
    public SquareShape(String color , boolean filled, double width , double length , double side){
        super(color , filled , width , length);
        this.side=side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "SquareShape{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
