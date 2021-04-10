import java.lang.Math;

public class BinarySearch {

	public static int binarySearch(int[] a,int b){

		int numberofelements = a.length;
		System.out.println(" Num of elements >>> "+numberofelements);

		int left = 0;
		System.out.println(""+left);
		int right = numberofelements-1;
		System.out.println(right);
		while(left <= right)
		{
			System.out.println("left"+left);
			System.out.println("right"+right);
			
			int mid = left + (right -left) / 2;

			if(a[mid] == b) return b;

			if(a[mid]< b)
				left = mid +1;
			else
				right = mid -1;
 
		}	


	return -1;
	}


	public static void main(String[] args){

		System.out.println("Binary search : " + binarySearch(new int[] {1, 3, 5, 7, 8}, 1));
	}

}

