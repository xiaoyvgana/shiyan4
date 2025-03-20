public class FactoryPatternDemo {
    public static void main(String[] args) {
        try {
            Shape circle = ShapeFactory.createShape("CIRCLE");
            circle.draw();
            circle.erase();

            Shape rectangle = ShapeFactory.createShape("RECTANGLE");
            rectangle.draw();
            rectangle.erase();

            Shape triangle = ShapeFactory.createShape("TRIANGLE");
            triangle.draw();
            triangle.erase();

            // 测试不支持的形状
            Shape unknownShape = ShapeFactory.createShape("Ellipse");
            unknownShape.draw();
        } catch (UnsupportedShapeException e) {
            System.out.println(e.getMessage());
        }
    }
}

