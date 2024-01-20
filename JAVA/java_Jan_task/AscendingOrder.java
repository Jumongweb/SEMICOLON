import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrder{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter array length: ");
	int length = scanner.nextInt();
		
	int[] originalArray = new int[length];
	
	for (int i = 0; i < length; i++){
		System.out.printf("Enter array[%d]: ", i);
		originalArray[i] = scanner.nextInt();
	}
	System.out.println(Arrays.toString(originalArray));

	System.out.println(Arrays.toString(sortArray(originalArray)));

    }
     public static int[] sortArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++){
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
    }




  /*  public static int[] getAscendingValue(int[] array){
	int[] AscendingOrder = new int[array.length];
	
	int temp = 0;
	for (int index = 0; index < array.length; index++){
		for (int index2 = index + 1; index2 < array.length; index2++){
			if (AscendingOrder[index] < array[index2]){
				temp = AscendingOrder[index];
				AscendingOrder[index] = array[index];
				array[index] = temp;				
			}
		}
	}
	return AscendingOrder;
    }   */
}