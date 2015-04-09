import java.util.*;
import java.io.*;

public class Foo{

    int[][] arr = {{11,22,33,5,44,55},
		   {22,33,44,6,55,66},
		   {4,5,6,7,8,9},
		   {33,44,55,8,66,77},
		   {44,5,66,9,77,88}};

    public static void removeCross(int[][] m, int r, int c){
	for (int i = r+1; i<m.length;i++){
	    for(c = 0;c<m[0].length;c++){
		m[i-1][c]=m[i][c];
		m[i][c]=0;
	    }
	}
	for (int i=c+1;i<m[0].length;i++){
	    for (r = 0; r<m.length;r++){
		m[r][i-1]=m[r][i];
		m[r][i]=0;
	    }
	}
    }
    
    public void printArray(){
	for (int[] blah : arr){
	    System.out.println(Arrays.toString(blah));
	}
    }
    
}
