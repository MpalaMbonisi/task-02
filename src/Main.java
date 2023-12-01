public class Main {
    public static void main(String[] args){
        int array[] = {5 ,1 , 2, 3, 4};
        System.out.println("The sum of the numbers in the array is: "
        + calcSumArray(array));
    }
    public static int calcSumArray(int[] arr){
        int result = 0;
        for(int i=0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}