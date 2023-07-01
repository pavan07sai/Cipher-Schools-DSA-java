import java.util.*;

public class Main
{
	public static void main(String[] args) {
	// for loop
	
	int i;
	for(i=1;i<=100;i++){
	    System.out.println(i);
	}
	System.out.println("i is: "+i);
	
	
	// while loop
	
	int n = 10;
	while(n>0){
	    System.out.println("Hello");
	    n--;
	}
	System.out.println("After while loop n is: " +n);



    // do-while
    
    n=10;
    do{
        System.out.println(n);
        n--;
    }while(n>0);
    
    
    // while loop
	 n = 0;
	while(n>0){
	    System.out.println(n);
	    n--;
	}
	System.out.println("After while loop n is: " +n);



    // do-while - It will runs atleast once
    
    n = 0;
    do{
        System.out.println(n);
        n--;
    }while(n>0);
    System.out.println("After the do-while loop is: "+n);
	}
}

