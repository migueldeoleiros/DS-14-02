package e2;

public class Slopes {
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
        int treeNum =0;
        int row=0, col=0;
        int n=0;
        if(right<1 || down<1 || right>slopeMap.length-1 || down>slopeMap.length-1 )
            throw new IllegalArgumentException();
        for (int i=0; i<slopeMap.length; i++){
            if(slopeMap.length != slopeMap[i].length)
                throw new IllegalArgumentException();
        }
        while(row < slopeMap.length) {
            if (slopeMap[row][col]!='.'&&slopeMap[row][col]!='#')
                throw new IllegalArgumentException();
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
                    n=1;break;
                }
            }
            if(n==1)break;
        }
        return treeNum;
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
        int treeNum =0;
        int row=0, col=0;
        int n=0;
        if(right<1 || down<1 || right>slopeMap.length-1 || down>slopeMap.length-1 )
            throw new IllegalArgumentException();
        for (int i=0; i<slopeMap.length; i++){
            if(slopeMap.length != slopeMap[i].length)
                throw new IllegalArgumentException();
        }
        while(row < slopeMap.length) {
            if (slopeMap[row][col]!='.'&&slopeMap[row][col]!='#')
                throw new IllegalArgumentException();
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
                    n=1;break;
                }
            }
            if(n==1)break;
        }
        return treeNum;
    }
}