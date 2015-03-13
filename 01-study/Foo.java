import java.util.*;
import java.io.*;


public class Foo{
 
    public void read(){
	String s = IO.readString();
	System.out.println("wow"+s);
    }

    
    public static void main(String[] args){
	Foo f = new Foo();
	f.read();
    }
}
