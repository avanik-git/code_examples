import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    

   public static int removeDuplicates( int[] nums){
	int slow = 0;


	for (int fast =0; fast< nums.size(); ++fast){
		if(nums[fast] != nums[slow]){
 			nums[slow] = nums[fast];
			slow++;
		}
	}
	return slow+1;
   }




   public static void main(String[] args) {
        //Driver code
        String[] inputs = {"0 0 1 1 1 2 2","1 2 3","1 1 1 1 1 1 1 1 1 1 1 1"};
        for(int i = 0; i < inputs.length; i++) {
            int[] nums = Arrays.stream(inputs[i].split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = removeDuplicates(nums);
            String actual_output = Arrays.toString(Arrays.stream(nums).limit(count).mapToObj(Integer::toString).toArray());

            System.out.println("Remove duplicates : "+actual_output);
        }
    }
}

