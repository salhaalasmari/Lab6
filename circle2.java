public class circle2 implements GeometricObject {
    protected  double raduis;

    public circle2(double raduis) {
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double getPerimemeter() {
        return getRaduis();
    }

    @Override
    public double getArea() {
        return raduis* raduis;
    }
}
