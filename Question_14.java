class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

public class Question_14 {
    
    static void Actions(Shape shape) {
        shape.draw();
        shape.erase();
    }

    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Triangle(), new Square() };

        for (Shape shape : shapes) {
            Actions(shape);
            System.out.println("---");
        }
    }
}