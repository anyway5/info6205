package Assignments.assignment6;

public class Collision {
    public int[] asteroidCollision(int[] asteroids) {
        int[] nums=new int[asteroids.length];
        int x = 0;
        for(int i = 0;i<asteroids.length;i++){
            if(asteroids[i]<0 && x>0 && nums[x-1]>0){
                if(nums[x-1]+asteroids[i]<0){
                    x -= 1;
                    i--;
                }else if(nums[x-1]+asteroids[i]==0){
                    x -= 1;
                }
            }else{
                nums[x]=asteroids[i];
                x += 1;
            }
        }
        int[] res = new int[x];
        for(int i=0;i<x;i++){
            res[i]=nums[i];
        }
        return res;
    }
}
