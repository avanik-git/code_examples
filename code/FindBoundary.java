

public class FindBoundary{


	
   	public static int findBoundary( boolean[] b){

		int left =0;
		int right = b.length-1;

		int boundaryIndex = -1;
		while(left<=right){
			int mid = (left-right)/2;

			System.out.println(" mid "+mid);

			boundaryIndex = mid;
			if(b[mid]){
				right = mid-1;
			}else{
				left = mid+1;
			}
		}
	return boundaryIndex;
	}		



   public static void main(String[] args) {      
        System.out.println("Find boundry :" + findBoundary(new boolean[]{false, false, true, true, true}));
        System.out.println("Find boundry :" + findBoundary(new boolean[]{true}));
        System.out.println("Find boundry :" + findBoundary(new boolean[]{false, false, false}));
        System.out.println("Find boundry :" + findBoundary(new boolean[]{true, true, true, true, true}));
        System.out.println("Find boundry :" + findBoundary(new boolean[]{false, true}));
    }
}
