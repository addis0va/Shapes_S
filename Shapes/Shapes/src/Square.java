public class Square extends Shape{

    private double side;

    public Square(int x){
        super("Square");
        this.side = x;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return 4*side;
    }

}