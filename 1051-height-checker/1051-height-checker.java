class Solution {
    public int heightChecker(int[] heights) {
        int[] expect = new int[heights.length];
        int temp=0;
        int miss =0;
        expect = heights.clone();

        for(int i=0;i<heights.length-1;i++){
            for(int j=0;j<heights.length-1;j++){
            if(heights[j]>heights[j+1]){
                temp = heights[j];
                heights[j] = heights[j+1];
                heights[j+1] = temp;
            }
          }
        }

        for(int j=0;j<heights.length;j++){
            if(expect[j]!=heights[j])
            miss++;
        }

        return miss;
    }
}