// Written by adamegyed

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
         try {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());
        
        int numTrees = Integer.valueOf(st.nextToken());
        int totalTime = Integer.valueOf(st.nextToken());
        int reloadTime = Integer.valueOf(st.nextToken());
        
        Tree[] trees = new Tree[numTrees];
        for (int i = 0; i < numTrees; i++) {
            st = new StringTokenizer(input.readLine());
            int distance = Integer.valueOf(st.nextToken());
            int pointValue = Integer.valueOf(st.nextToken());
            trees[i] = new Tree(distance, pointValue);
        }
        
        Arrays.sort(trees);
        
        
        int timeLeft = totalTime;
        int score = 0;
        
        for (int i = trees.length-1; i > 0; i--) {
            Tree current = trees[i];
            if (current.distance + reloadTime > timeLeft) continue;
            score += current.pointValue;
            timeLeft -= current.distance + reloadTime;
            
        }
        
        System.out.println(score);
        
         } catch (IOException e) {
             e.printStackTrace();
             System.exit(-1);
         }
        
    }
    
    private static class Tree implements Comparable{
        public int distance;
        public int pointValue;
        public double efficiency;
        
        public Tree(int distance, int pointValue) {
            this.distance = distance;
            this.pointValue = pointValue;
            efficiency = (double) pointValue / distance;
        }
        
        public int compareTo(Object other) {
            Tree otherTree = (Tree) other;
            return (int) efficiency - (int) otherTree.efficiency;
        }
    }
}
