public class RectangleShape extends Shape{
    protected  double width;
    protected  double length;
    public RectangleShape(){

    }
    public RectangleShape(double width , double length){
        this.length=length;
        this.width=width;
    }
 public RectangleShape(String color , boolean filled,double width , double length){
        super(color,filled);
        this.width=width;
        this.length=length;
 }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public double getArea() {
        return this.length*this.length;
    }

    @Override
    public double getPerimeter() {
        return this.length+this.width;
    }

}
