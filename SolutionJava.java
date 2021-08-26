
import java.util.*;

class Main {
	public static void main (String[] args) {
		int[] array={2,1,6,4,9,7,5};
		
		// Firstly we'll take array's length-1 iterations as after this only one element would be remaining 
		//and that would be obviously sorted
		for(int i=0; i<array.length; i++){
		    
		    //we take a check if in any of iterations if swap doesn't take place, it means its now sorted and we don't need to check further
		    boolean flag=false;
		    
		    //here we'll keep checking adjacent elements swap them according to ascending
		    //order and we'll also keep decreasung our check range as after each iteration largest element of unsorted array is at last index
		    //so don't need to check that
		    for(int j=1; j<array.length-i; j++){
		        
		        //checking if previous element is bigger, then swap
		        if(array[j]<array[j-1]){
		            int temp=array[j];
		            array[j]=array[j-1];
		            array[j-1]=temp;
		            //updating flag is swapping happens
		            flag=true;
		        }
		    }
		    
		    //if swapping not happens then simply break, as it means array is now sorted 
		    if(flag==false){
		        break;
		    }
		}
		System.out.print(Arrays.toString(array));
	}
}
