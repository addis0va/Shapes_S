public class Circle extends Shape{

    private double radius;

    public Circle(int r){
        super("Circle");
        this.radius = r;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double width) {
        this.radius = radius;
    }


    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
