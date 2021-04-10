


public class BinarySearch1{


  public static int binarySearch(int[] a, int b){

     int left = 0;

     int right = a.length -1;


	while(left<right){

		int mid = left - (left - right) / 2;

		if(a[mid] == b) return b;

		if(a[mid] < b)
			left =mid +1;
		else
			right = mid-1;


	}		
 	
	return -1;
  }


  public static void main(String[] args) {       
        System.out.println("Binary search : " + binarySearch(new int[] {1, 3, 5, 7, 8}, 5));
        System.out.println("Binary search : " + binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7}, 0));
        System.out.println("Binary search : " + binarySearch(new int[] {2, 8, 89, 120, 1000}, 120));
    }

}
