class Solution {
    public void fib(int i, int arr[], int n){
        if(i > n) return;
        if(i == 0 || i == 1) arr[i] = 1;
        else arr[i] = arr[i-1] + arr[i-2];
        fib(i + 1, arr, n);
    }
    public int climbStairs(int n) {
        int arr[] = new int[n + 1];
        fib(0, arr, n);
        return arr[n];
    }
}
