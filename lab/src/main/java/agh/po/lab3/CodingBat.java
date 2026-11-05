package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();
        System.out.println(codingBat.helloName("Bob"));
        System.out.println(codingBat.sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
        System.out.println(codingBat.sleepIn(false, false));
        System.out.println((codingBat.diff21(20)));
        System.out.println(codingBat.mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))));
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
    public Map<String, String> mapAB2(Map<String, String> map) {
        boolean w1 = false;
        if(map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }




}
