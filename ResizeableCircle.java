public class ResizeableCircle extends circle2 implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizeableCircle{" +
                "radius=" + super.getRaduis() +
                '}';
    }

    @Override
    public void resize(int percent) {

       double rediusResize = super.getRaduis() * percent /100;
        System.out.println("the resize is of ur percent is "+rediusResize);
    }
}
