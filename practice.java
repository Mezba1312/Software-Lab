public interface Shape {
    void draw();
}

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("CIRCLE");
        if (shape1 != null) {
            shape1.draw();
        } else {
            System.out.println("Invalid shape type");
        }

        Shape shape2 = ShapeFactory.createShape("RECTANGLE");
        if (shape2 != null) {
            shape2.draw();
        } else {
            System.out.println("Invalid shape type");
        }
    }
}
