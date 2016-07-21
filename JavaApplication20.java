/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author Student
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       public String longestCommonPrefix(String[] strs) {
    String longestPrefix = "";
    if(strs.length>0){
        longestPrefix = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String analyzing = strs[i];
        int m=0;
        for(; m<Math.min(longestPrefix.length(), strs[i].length()); m++){
            if(longestPrefix.charAt(m) != analyzing.charAt(m)){
                break;
            }
        }
        longestPrefix = strs[i].substring(0, j);
    }
    return longestPrefix;
}
    }

