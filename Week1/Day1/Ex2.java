interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {

    public static Shape getShape(String type) {

        if(type.equalsIgnoreCase("Circle")) {
            return new Circle();
        }

        else if(type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

class Main {
    public static void main(String[] args) {

        Shape s1 = ShapeFactory.getShape("Circle");
        s1.draw();

        Shape s2 = ShapeFactory.getShape("Rectangle");
        s2.draw();
    }
}