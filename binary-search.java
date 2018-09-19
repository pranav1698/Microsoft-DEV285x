import java.util.*;

class BSearch{
    static Scanner sc = new Scanner(System.in);

    static void bubbleSort(int[] lst, int number){
        for(int i = 0; i < lst.length; i++){
            for(int j = 0; j < lst.length - 1;j++){
                if(lst[j] > lst[j + 1]){
                    int temp = lst[j];
                    lst[j] = lst[j + 1];
                    lst[j + 1] = temp;
                }
            }
        }
        binarySearch(lst, number);
    }

    static void binarySearch(int[] nums, int number){
        int n = nums.length / 2;
        
        if(nums[n] == number){
            System.out.println("The number is found at: " + n + 1);
        } else {
            if(number < nums[n]){
                int[] result = new int[n];
                for(int i = 0; i < n; i++){
                    result[i] = nums[i];
                }
                binarySearch(result, number);    
            } else {
                int[] result = new int[n];
            }
        }
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3,5,6,4};

        System.out.println("Enter number you want to search:");
        int number = sc.nextInt();

        bubleSort(numbers, number);
    }
}