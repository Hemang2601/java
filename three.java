abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class three {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle();
        shape.draw();

        shape = new Circle();
        shape.draw();
    }
}
