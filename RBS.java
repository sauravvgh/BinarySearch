public class RBS {

    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2,3};
        System.out.println(findPivot(arr));
    }
    //find the pivot element out of all elements in rotated array
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
           if(arr[mid]>=arr[end]){
               start = mid+1;
           }
           if(arr[mid]<=arr[start]){
               end = mid-1;
           }
        }
        return -1;

    }

}
