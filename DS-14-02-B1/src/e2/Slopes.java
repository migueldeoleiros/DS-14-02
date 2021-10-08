package e2;

public class Slopes {

    /**
     * @throws IllegalArgumentException if the matrix is incorrect because:
     *  - right >= number of columns or right < 1
     *  - down >= number of rows of the matrix or down < 1
     *  - It is not square. * - It has characters other than "." and "#"
     */
     private static void test(char[][] slopeMap, int right, int down){
         if(right<1 || down<1 || right>slopeMap.length-1 || down>slopeMap.length-1)
             throw new IllegalArgumentException();
         for (char[] chars : slopeMap) {
             if (slopeMap.length != chars.length)
                 throw new IllegalArgumentException();
         }
         for (char[] chars : slopeMap) {
             for (char aChar : chars) {
                 if (aChar != '.' && aChar != '#')
                     throw new IllegalArgumentException();
             }
         }
     }

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
        int treeNum =0; //number of trees found along the way
        int row=0, col=0;
        test(slopeMap, right, down);
        while(row < slopeMap.length) {
            for(int x=0;x<right;x++){
                if (slopeMap[row][col] == '#') treeNum++;
                if(col < slopeMap[row].length-1){
                    col++;
                }
                else col=0;
            }
            for(int y=0;y<down;y++) {
                if (slopeMap[row][col] == '#') treeNum++;
                if(row < slopeMap.length-1){
                    row++;
                }else{
                    row++;break;
                }
            }
        }
        return treeNum;
    }

    /**
     * Traverses the slope map making the right and down movements and
     * returns the number of trees found along the way.
     * Since it "jumps" from the initial position to the final position ,
     * only takes into account the trees on those initial/final positions.
     * <p>
     * Params , return value and thrown exceptions as in downTheSlope ...
     */
    public static int jumpTheSlope(char[][] slopeMap, int right, int down) {
        int treeNum =0; //number of trees found along the way
        int row=0, col=0;
        test(slopeMap, right, down);
        while(row < slopeMap.length) {
            if (slopeMap[row][col] == '#') treeNum++;
            for(int x=0;x<right;x++){
                if(col < slopeMap[row].length-1){
                    col++;
                }
                else col=0;
            }
            for(int y=0;y<down;y++) {
                if(row < slopeMap.length-1){
                    row++;
                }else{
                    row++;break;
                }
            }
        }
        return treeNum;
    }
}