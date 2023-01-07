// Number of Boomerangs
// https://leetcode.com/problems/number-of-boomerangs/

class Solution {
    public long getDist(int i,int j,int arr[][]){
        long a1=(long)arr[i][0];
        long a2=(long)arr[j][0];
        long b1=(long)arr[i][1];
        long b2=(long)arr[j][1];
        return (a1-a2)*(a1-a2)+(b1-b2)*(b1-b2);
    }
    public int numberOfBoomerangs(int[][] arr) {
        int result=0;
        for(int i=0;i<arr.length;i++){
            Map<Long,Integer>map=new HashMap<>();
            for(int j=0;j<arr.length;j++){
                long dist=getDist(i,j,arr);
                map.put(dist,map.getOrDefault(dist,0)+1);
            }
            for(int v:map.values())
                result+=v*(v-1);
        }
        return result;
    }
}