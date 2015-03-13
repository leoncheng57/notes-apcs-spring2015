import java.util.*;
import java.io.*;

public class Qselect{
    private int[] a,b;
    Random rnd = new Random();

    public Qselect(){
	this(20);
    }

    public Qselect(int n){
	Random r = new Random();
	a = new int[n];
	for (int i = 0 ; i<a.length; i++){
	    a[i]=r.nextInt(100);
	}
    }
    
    public String toString(){
	return Arrays.toString(a);
    }

    public int partition(int[] a, int l, int r){
	int tmp;
	//int pivotIndex = l+rnd.nextInt(r-1);
	int pivotIndex=l;
	int pivot = a[pivotIndex];
	tmp = a[r];
	a[r]=a[pivotIndex];
	a[pivotIndex]=tmp;
	int wall = l;
	int pcount = l;
	for (int i = l; i<r;i++){
	    if (a[i]<pivot){
		tmp = a[i];
		a[i]=a[wall];
		a[wall]=tmp;
		wall++;
	    }
	    if (a[i]==pivot)
		pcount++;
	}
	//now copy over all the pivots
	int rwall = wall;
tmp = a[
    }
    
}
