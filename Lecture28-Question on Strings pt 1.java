//Questions on a String pt1

import java.util.*;

public class ReverseAString{
public static void main(String[] args)
{
String s1 = "CipherSchools";
int n = s1.length();
char arr[] = new char[n];
for(int i=0;i<n; i++)
{
arr[i] = s1.charAt(n-1-i);
}
String rev = new String(arr);
System.out.println(rev);

//time complexity [TC] = O(n)
//Is it an inplace solution ? --> no we created arr[]
// What is space complexity --> O(n) -->for arr[n]

String res = new String();
for( int i =n-1; i>=0; i--)
{
res = res+s1.charAt(i); //TC = O(n)
}
System.out.println(res);

char strArr[] = s1.toCharArray();
int l=0;
int r= n-1;
while(l<r)
{
char temp = strArr[1];
strArr[l] = strArr[r];
strArr[r] = temp;
l++;
r--;

}
//swapping completed
String result = new String(strArr);
System.out.println(result);
}
}
