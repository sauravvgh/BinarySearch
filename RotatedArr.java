public class RotatedArr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            } if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start])


        }
        return -1;
    }
}
