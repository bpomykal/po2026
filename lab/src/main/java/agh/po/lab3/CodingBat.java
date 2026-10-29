package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();
        System.out.println(codingBat.helloName("Bob"));
        int[] liczby = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(codingBat.sum67(liczby));
        boolean wakacje = false;
        boolean dzien = false;
        System.out.println(codingBat.sleepIn(dzien, wakacje));
        int n = 20;
        System.out.println((codingBat.diff21(n)));
    }
    public String helloName(String name){
        return "Hello " + name +"!";
    }
    public int sum67(int[] nums) {
        int sum = 0;
        boolean inRange = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 6){
                inRange = true;
            }
            if (!inRange) {
                sum += nums[i];
            }

            if (nums[i] == 7 && inRange) {
                inRange = false;
            }
        }
        return sum;
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday && !vacation){
            return true;
        }
        else if(weekday && !vacation){
            return false;
        }
        else{
            return true;
        }
    }
    public int diff21(int n) {
        if(n==21) return 0;
        else if(n>21) return 2*(n-21);
        else return Math.abs(n-21);
    }



}
