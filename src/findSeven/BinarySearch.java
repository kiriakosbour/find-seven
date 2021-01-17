package findSeven;
import java.util.Arrays;
public class BinarySearch {
	String binarySearch(int arr[], int left, int right,int seven) {
		if (right>=left) {
			int middle = left + (right-left)/2;
			//first we search if the element is present at the middle of the array
			if(arr[middle] == 7) {
				return "Found";
			}
			//if smaller then exists in the left part of the array
			if(arr[middle] > 7) {
				return binarySearch(arr, left,middle - 1,seven); 
			}// else it exists in the right part of the array
				return binarySearch(arr, middle + 1, right, seven); 
			
		}
		
		return "there is no 7 in the array";
		
	}


public static void main(String args[]) 
{ 
    BinarySearch bs = new BinarySearch(); 
    int arr[] = {  10, 40, 7 }; 
    Arrays.sort(arr);
    int n = arr.length; 
    int x = 7; 
    String result = bs.binarySearch(arr, 0, n - 1, x); 
System.out.println(result);
} 
} 
