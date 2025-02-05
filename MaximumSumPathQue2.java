public class MaximumSumPathQue2 {
    public static int maxSumPath(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 = 0, result = 0;
        int i = 0, j = 0;
        int m = arr1.length, n = arr2.length;
        
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        
        while (i < m) {
            sum1 += arr1[i++];
        }
        
        while (j < n) {
            sum2 += arr2[j++];
        }
        
        result += Math.max(sum1, sum2);
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 10, 13};
        int[] arr2 = {1, 5, 7, 8};
        
        System.out.println("Maximum sum path: " + maxSumPath(arr1, arr2));
    }
}

