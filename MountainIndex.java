public class MountainIndex {
    public static void main(String[] args) {
        int[] arr = {0,10, 5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr){
        if(arr.length<3){
            return -1;

        }
        int highest = 0;
        int end = arr.length-1;
        for(int i= 0; i<=end; i++){
            if(arr[i]>arr[highest]){
               highest = highest +1;
            }
        }
        return highest;
    }
}
