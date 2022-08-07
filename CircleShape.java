public class CircleShape extends Shape{
    protected double radius;
    public CircleShape(){

    }
    public  CircleShape(double radius){
        this.radius=radius;
    }
    public CircleShape(String color , boolean filled , double radius){
        super(color , filled);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "CircleShape{" +
                "radius=" + radius +
                ", color='" + super.getColor() + '\'' +
                ", filled=" +super.getFilled() +
                '}';
    }
}
