import java.util.*;

class Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Enter numbers:");
        for(int i = 0; i <= numbers.length - 1; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter number you want to search:");
        int number = sc.nextInt();
        sc.close();
        
        int i = 0;
        try{
            while(numbers[i] != number){
                i++;
            }
            System.out.println(number + " is at " + (i + 1) + " position");
        } catch(ArrayIndexOutOfBoundsException err){
            System.out.println(number + " is not present in the array");
        }
        
    }
}