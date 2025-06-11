class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
     Arrays.sort(banned);
     Set<Integer>hashset=new HashSet<>();
     for(int b:banned){
        hashset.add(b);
     }  
     int c=0;
     int s=0;
       for(int i=1;i<=n;i++){
        if(hashset.contains(i)) continue;
        if(s+i>maxSum) break;
         s+=i;
         c++;
       } 
       return c;
    }
}