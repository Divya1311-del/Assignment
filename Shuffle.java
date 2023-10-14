import java.util.*;
class Shuffle{
public static void main(String args[]){
int[] Array={1,2,3,4,5};
Random rand=new Random();
for(int i=0;i<Array.length;i++){
int randomIndexToSwap=rand.nextInt(Array.length);
int temp=Array[randomIndexToSwap];
Array[randomIndexToSwap]=Array[i];
Array[i]=temp;
}



System.out.println(Arrays.toString(Array));
}}