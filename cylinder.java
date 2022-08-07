public class cylinder extends Circle{
    private double height =1.0;

    public cylinder(double radius, String color , double height) {
        super(radius, color);
        this.height=height;
    }


   public cylinder(double radius){
        super(radius);
   }
   public cylinder(double radius , double height){
        super(radius);
        this.height=height;
   }
   public cylinder(){

   }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double  volume=((22*super.getRadius()*super.getRadius()* height)/7);
        System.out.println("The volume is ");
        return volume;
    }
}
