import jdk.jshell.spi.ExecutionControl;

public class Triangle extends Shape{

    private double firstside, secondside, thirdside;

    public Triangle(int a, int b, int c){
        super("Triangle");
        this.firstside = a;
        this.secondside = b;
        this.thirdside = c;
    }

    public double getFirstside() {
        return firstside;
    }

    public void setFirstside(double firstside) {
        this.firstside = firstside;
    }

    public double getSecondside() {
        return secondside;
    }

    public void setSecondside(double secondside) {
        this.secondside = secondside;
    }

    public double getThirdside() {
        return thirdside;
    }

    public void setThirdside(double thirdside) {
        this.thirdside = thirdside;
    }


    public double getArea(){
        double p = (firstside+secondside+thirdside)/2;
        return Math.sqrt(p*(p-firstside)*(p-secondside)*(p-thirdside));
    }

    public double getPerimeter(){
        return firstside + secondside + thirdside;
    }

}