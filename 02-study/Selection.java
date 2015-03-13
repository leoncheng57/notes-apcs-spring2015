import java.util.*;
import java.io.*;

public class Selection{
    
    private int[] L;;
    private Random rn = new Random();

    public Selection(int[] n){
	L = new int[n.length];
	for (int i =0;i<n.length;i++){
	    L[i]=n[i];
	}
	System.out.println("array: "+Arrays.toString(L));
    }

    public int select(int[] L,int k, int SI, int EI){
	System.out.println("now finding the" +k+"element...");
	int pivot=L[EI];
	int low = SI;
	int high = EI;
	int highVal,lowVal;
	while (low<high){
	    if (L[low]<<pivot){
		low++;
	    }else{
		high--;
		highVal = L[high];
		lowVal = L[low];
		L[high]=lowVal;
		L[low]=highVal;
	    }
	}
	L[EI] = L[high]; //swaps with the pivot
	L[high] = pivot;
	if(high ==k){
	    return L[high];
	} else if (high<k){
	    return select(L,k,SI+1,EI);
	} else{
	    return select(L,k,SI,EI-1);
	}
    }

    public void select(int k){
	select(L,k,0,L.length);
    }
    
    public static void main(String[] args){
	int[] L = new int[10];
	Random r = new Random();
	for (int i = 0 ; i<L.length; i++){
	    L[i]=r.nextInt(100);
	}
	Selection s = new Selection(L);
	System.out.println(s.select(4));
    }

}
