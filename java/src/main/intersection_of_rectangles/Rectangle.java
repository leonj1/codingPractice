package intersection_of_rectangles;

public class Rectangle {

    // coordinates of bottom left corner
    Integer x;
    Integer y;

    // dimensions
    Integer width;
    Integer height;

    public Rectangle(Integer x, Integer y, Integer width, Integer height) {
        this.x = x;
        this.y = y;
        this.width  = width;
        this.height = height;
    }

    public Rectangle() {}

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String toString() {
        return String.format("(%d, %d, %d, %d)", x, y, width, height);
    }
}