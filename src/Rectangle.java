public class Rectangle extends Shape implements Resizeable {
    @Override
    public void resize(double percent) {
        this.height += this.height * percent / 100;
        this.width += this.width * percent / 100;
    }

    public double height = 1.0;
    public double width = 1.0;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean fill, double height, double width) {
        super(color, fill);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width=" + this.width + " and length=" + this.height + ", Area= " + this.getArea() +
                ", Perimeter= " + this.getPerimeter() + ", which is a subclass of " + super.toString();

}
}
