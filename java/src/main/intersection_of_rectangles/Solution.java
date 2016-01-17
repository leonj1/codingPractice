package intersection_of_rectangles;

/**
 * Find the intersection rectangle if it exists
 * Needs work
 * - create Class to hold overlap
 * - needs method to find the range overlap - returns overlap class
 * - needs parent method to find Rectangle overlap - returns rectangle class
 */
public class Solution {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(0,0,5,3);
        Rectangle rec2 = new Rectangle(3,2,4,9);

        Rectangle rec = getIntersection(rec1, rec2);
        System.out.println(rec);

    }

    static public Rectangle getIntersection(Rectangle r1, Rectangle r2) {
        Rectangle result = null;

        int overlapX = r1.getX() >= r2.getX() ? r1.getX() : r2.getX();
        int overLapWidth = overlapX == r1.getX() ?
                (r2.getWidth() + r2.getX() - overlapX) :
                (r1.getWidth() + r1.getX() - overlapX);

        int overlapY = r1.getY() >= r2.getY() ? r2.getY() : r1.getY();
        int overLapHeight = overlapY == r1.getY() ?
                (r2.getHeight() + r2.getY() - overlapY) :
                (r1.getHeight() + r1.getY() - overlapY);


        if (overlapX > 0 && overlapY > 0)
            new Rectangle(overlapX, overlapY, overLapWidth, overLapHeight);

        return result;
    }
}
