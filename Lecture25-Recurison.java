import java.util.*;

//Recursion

public class RecursionStudy
{
static void printDescending(int n)
{
if(n<1) return;
System.out.println(n);
printDescending(n-1);
}
public static void main(String[] args)
{
int n=5;
printDescending(n);
}
}


==============

import java.util.*;

publci class Fibonacci{
static int fib(int n)
{
if(n<2) return n;
int a = fib(n-1);
int b = fib(n-2);
return a+b;

}

public static void main (String[] args){
int n=4;
System.out.println(fib(n));
}
}

==========
import java.util.*;
public class BinarySearchWithoutRecursion
{
public static void main(String[] args)
{
int arr[] = {2,5,8,12,16,23,38,56,72};
int x=23;

int l=0;
int r = arr.length -1;
while (l<r)
{
int mid = (l+r)/2;
int (arr[mid] == x)
{
System.out.println("Value found at index: "+mid);
}
else if(x<arr[mid])
{
r =mid-1;
}
else
{
l=mid+1;
}
System.out.println("value not found");
}
}import java.util.*;

//Recursion

public class RecursionStudy
{
static void printDescending(int n)
{
if(n<1) return;
System.out.println(n);
printDescending(n-1);
}
public static void main(String[] args)
{
int n=5;
printDescending(n);
}
}


==============

import java.util.*;

publci class Fibonacci{
static int fib(int n)
{
if(n<2) return n;
int a = fib(n-1);
int b = fib(n-2);
return a+b;

}

public static void main (String[] args){
int n=4;
System.out.println(fib(n));
}
}

==========
import java.util.*;
public class BinarySearchWithoutRecursion
{
public static void main(String[] args)
{
int arr[] = {2,5,8,12,16,23,38,56,72};
int x=23;

int l=0;
int r = arr.length -1;
while (l<r)
{
int mid = (l+r)/2;
int (arr[mid] == x)
{
System.out.println("Value found at index: "+mid);
}
else if(x<arr[mid])
{
r =mid-1;
}
else
{
l=mid+1;
}
System.out.println("value not found");
}
}
