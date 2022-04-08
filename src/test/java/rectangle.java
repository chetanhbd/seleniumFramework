public class rectangle extends shape{
    double length;
    double width;
    public rectangle(String color1,double length1, double width2)
    {
        super(color1);
        this.length=length1;
        this.width=width2;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return super.getColor()+area();
    }
}
