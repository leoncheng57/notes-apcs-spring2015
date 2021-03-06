public class ErasePaint{
    
    public int[][] image;
    final int Black = 1;
    final int White = 0;
    
    public void EraseObject(int row, int col){
	if (row>-1 &&
	    row<image.length &&
	    col>-1 &&
	    col<image[0].length){

	    if (image[row][col]==Black){
		image[row][col]=White;
		EraseObject(row-1,col);
		EraseObject(row+1,col);
		EraseObject(row,col+1);
		EraseObject(row,col-1);
	    }
	}
    }
}

/*
  My mistake on the test: Instead of writing "EraseObject(row-1,col);", I wrote "EraseObject(r-1,c);" for all four lines
 */
