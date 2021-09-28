package e2;

public class Descenso {
    /**
     * Traverses the slope map making the right and down movements and
     * returns the number of trees found along the way.
     *
     * @param slopeMap A square matrix representing the slope with spaces
     *      represented as "." and trees represented as "#".
     * @param right    Movement to the right
     * @param down     Downward movement
     * @return Number of trees
     * @throws IllegalArgumentException if the matrix is incorrect because:
     *  - It is not square. * - It has characters other than "." and "#"
     *  - right >= number of columns or right < 1
     *  - down >= number of rows of the matrix or down < 1
     */
    public static int downTheSlope(char[][] slopeMap, int right, int down) {

    }

    /**
     * Traverses the slope map making the right and down movements and
     * returns the number of trees found along the way.
     * Since it "jumps" from the initial position to the final position ,
     * only takes into account the trees on those initial/final positions.
     * <p>
     * Params , return value and thrown expections as in downTheSlope ...
     */
    public static int jumpTheSlope(char[][] slopeMap, int right, int down) {

    }
}