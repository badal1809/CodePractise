/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Badal_K
 */
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Integer> wordlist = new HashMap<String,Integer>(); 
        HashMap<String,Integer> checkwordlist = new HashMap<String,Integer>(); 
        Scanner in = new Scanner(System.in);
        String test="barfoothefoobarman";
        // words = new String[2];
        String[] words = {"foo", "bar"};
        int wrdl = words.length;
        int l = words[0].length();
        //test = in.next();
        System.out.println(test);
        for (String num : words) { 		      
           wordlist.put(num, new Integer(1));
        }
        int d;
        for(int i=0,k=0;i<test.length();i++){
            
            if(i+l<test.length()){
            if(wordlist.containsKey(test.substring(i, i+l))){
                //System.out.println("first text fount"+test.substring(i, i+l));
                d=i;
                for(k=1;k<wrdl;k++){
                    i=i+l;
                    if(wordlist.containsKey(test.substring(i, i+l))){
                        if(checkwordlist.containsKey(test.substring(i, i+l))){
                                                    break;
                        }else{
                        checkwordlist.put(test.substring(i, i+l), new Integer(1));
                        }
                    }
                    else{
                    break;
                    }
                }
                if(k==wrdl){
                    System.out.println(d);
                }
                checkwordlist.clear();
            }
        
        }
        }
    }
    
}
