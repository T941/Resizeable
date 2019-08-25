public class Main {
    public static void main(String[] args) {
Shape[] shapes=new Shape[3];
shapes[0]=new Circle(2);
shapes[1]=new Rectangle(2,3);
shapes[2]=new Square(1);
for (Shape shape : shapes){
    if (shape instanceof Circle) {
        Circle circle = (Circle) shape;
        System.out.println(circle);
    } else if (shape instanceof Rectangle) {
        Rectangle rectangle = (Rectangle) shape;
        System.out.println(rectangle);
    } else if (shape instanceof Square) {
        Square square = (Square) shape;
        System.out.println(square);
    }
}
}
}
