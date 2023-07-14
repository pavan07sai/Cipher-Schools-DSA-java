//Sliding window
import java.util.*;

class Solution{
static int maximumSumarray(int K, ArrayList<Integer>Arr, int N){
/*
int max = Integer.MIN_VALUE;

for(int i =0; i<N-K; i++)
{
int sum = 0;
for (int j=0; j<K; j++)
{
sum = sum+Arr.get(i+j);
}
if(sum>max) max = sum;
}
return max;
*/

int max = Integer.MIN_VALUE;
int sum=0;
for (int i=0; i<N; i++)
{
sum = sum+Arr.get(i);
}
int max=sum;
for(int i=0; i<n-k; i++)
{
sum = sum-Arr.get(i) + Arr.get(i+K);
if(sum >max) max= sum;
}

return max;
}
}
