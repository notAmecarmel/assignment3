class Geometry {

    double radius, length, width, base, height;

    // Constructor Overloading
    Geometry(double radius) {
        this.radius = radius;
    }

    Geometry(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Geometry(double base, double height, int type) {
        this.base = base;
        this.height = height;
    }

    // Method Overloading
    double calculateArea() { // Circle
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) { // Rectangle
        return length * width;
    }

    double calculateArea(double base, double height, int type) { // Triangle
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Geometry c = new Geometry(7);
        System.out.println("Area of Circle: " + c.calculateArea());

        Geometry r = new Geometry(4, 5);
        System.out.println("Area of Rectangle: " + r.calculateArea(4, 5));

        Geometry t = new Geometry(6, 8, 1);
        System.out.println("Area of Triangle: " + t.calculateArea(6, 8, 1));
    }
}