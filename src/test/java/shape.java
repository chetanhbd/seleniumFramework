abstract class shape {
    String color;
    // abstract login, abstacrt logut, abstract laon funtions--
    public String getColor() {
        return color;
    }
    abstract double area();

    public abstract String toString();

    public shape(String color1){ //user defined conts --- child class super is mandatory inside constr of that class
        System.out.println("shape const called");
        this.color=color1;
    }

}
