
/*
Time Complexity is :
 O(logn) - At each and every iteration we are eliminating half of the array(search space).
 Best Case - O(1) - If the element it at the middle.
Space complexity is : O(1) - As we are not using any extra arrays here.I am just using variables.
*/
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Write your code here
        while(l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                r = mid -1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }

    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
