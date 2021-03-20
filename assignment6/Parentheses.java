package Assignments.assignment6;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    List<String> l = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs("",n,0,0);
        return l;
    }
    public void dfs(String s,int n,int left,int right){
        if(s.length()==2*n){
            l.add(s);
            return ;
        }
        if(left<n){
            dfs(s+'(',n,left+1,right);
        }
        if(right<left){
            dfs(s+')',n,left,right+1);
        }
    }
}
