public class SearchInRange {
    public static void main(String[] args) {
        int NewArray[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(  LinearSearch(NewArray, 5 , 1, 4));
    }
    public static int LinearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index = start; index <=end; index++){
              //check for element at every index, whether it is equal to target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //this line will execute if none of the return statements are
        return -1;
    }
}
