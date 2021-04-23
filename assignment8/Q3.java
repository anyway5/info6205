package Assignments.assignment8;

import java.util.*;

public class Q3 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);
        int cnt = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size -- >0){
                String s = queue.poll();
                for(int i=0;i<s.length();i++){
                    char[] chs = s.toCharArray();
                    for(char c = 'a';c<='z';c++){
                        if(chs[i] == c){
                            continue;
                        }
                        chs[i] = c;
                        String newWord = String.valueOf(chs);

                        if(set.contains(newWord) && !visited.contains(newWord)){
                            if(newWord.equals(endWord)){
                                return cnt+1;
                            }
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
            cnt++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        Q3 q3 = new Q3();
        int i = q3.ladderLength(beginWord,endWord,wordList);
        System.out.println(i);

    }
}
