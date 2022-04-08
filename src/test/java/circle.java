public class circle extends shape{

    double radius;
    public circle(String color1, double radius1) {
        super(color1);
        this.radius=radius1;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);

    }

    @Override
    public String toString() {
        return super.getColor()+area();
    }

}
