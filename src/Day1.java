//1)
public class Day1 {
    class Solution {
        //Just print the space seperated array elements
        void printArray(int arr[], int n) {
            //   code here
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

//2)
class Solution {
    int sum(int arr[], int n) {
        // code here
        int ans = 0;
        for (int i = 0; i<arr.length; i++){
            ans = ans + arr[i];
        }
        return ans;
    }
}