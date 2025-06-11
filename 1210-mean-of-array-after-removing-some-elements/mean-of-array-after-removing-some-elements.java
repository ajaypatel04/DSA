class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int x=(int) (n * 0.05);
        double c=0;
        double sum=0;
        for(int i=x;i<n-x;i++){
            sum+=arr[i];
            c++;

        }
        return sum/c;


        
    }
}