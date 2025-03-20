public class ShapeFactory {
    public static Shape createShape(String shapeType) throws UnsupportedShapeException {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else {
            throw new UnsupportedShapeException("Unsupported shape: " + shapeType);
        }
    }
}

