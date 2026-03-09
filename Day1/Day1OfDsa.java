//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class Day1OfDsa {
    public static void main (String[] args){
        int[] nums= {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int evenDigits= digits(num);
        return evenDigits%2==0;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}