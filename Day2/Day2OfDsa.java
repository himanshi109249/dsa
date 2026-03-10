package Day2;
//https://leetcode.com/problems/richest-customer-wealth/description/
class Day2OfDsa {
    public static void main(String[] args){
        int[][] accounts= {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth= Integer.MIN_VALUE;
        for(int person=0; person<accounts.length; person++){
            int sum=0;
            for(int account=0; account<accounts[person].length; account++){
                sum+= accounts[person][account];
            }
            if(sum> maxWealth){
            maxWealth= sum;
        }
        }
        return maxWealth;
    }
}