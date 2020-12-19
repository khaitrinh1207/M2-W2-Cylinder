public class Cylinder extends Circle{
    private double height;

    public Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
     public double getVolume(double radius, double height){
        return radius*radius*height*Math.PI;
     }

     public double getSurroundingArea(double radius, double height){
        return radius*height*2*Math.PI;
     }

     public double getTotalArea(double radius, double height){
        return 2*Math.PI*radius*(radius+height);
     }

    @Override
    public String toString() {
        return "Cylinder{ " +
                "height=" + height +
                ", radius="+ getRadius()+
                ", color="+ getColor()+
                ", Sđ="+ getArea(getRadius())+
                ", volume="+ getVolume(getRadius(), height)+
                ", Sxq="+ getSurroundingArea(getRadius(),height)+
                ", Stp="+ getTotalArea(getRadius(),height)+
                " }";
    }
}
