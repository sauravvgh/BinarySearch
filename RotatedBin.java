public class RotatedBin {
        public static void main(String[] args) {
            int[] arr ={4,5,6,7,0,1,2,8,9,20};
            System.out.println(SearchArray(arr, 4));
        }
        public static int SearchArray(int[] nums, int target){
            int pivot = findPivot(nums);
            if(pivot == -1){ //no pivot element is found, that means that the array is not rotated
                return BinarySearch(nums, target, 0,  nums.length-1);
            }
            if(nums[pivot] == target){
                return pivot;
            }
            if(target>=nums[0]){
                return BinarySearch(nums, target, 0, pivot-1 );
            }
                return BinarySearch(nums, target, pivot+1, nums.length-1);
        }
        public static int BinarySearch(int[] arr, int target, int start, int end){
                while(start<=end){
                int mid = start + (end-start)/2;

                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
            return -1;
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
                if(arr[mid]<=arr[start]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return -1;

        }

    public static int findPivotWithDuplicates(int[] arr){
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
            //if elements at middle, start, end are equal, then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]== arr[end]){
                //skip the duplicates:
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++; //start++ =  start = start +1;
                //what if end-1 is the pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--; // end--=  end = end-1;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }
}
