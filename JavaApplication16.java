/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author Student
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String start = "THIS_IS_A_TEST";
    StringBuffer sb = new StringBuffer();
    for (String s : start.split("_")) {
        sb.append(Character.toUpperCase(s.charAt(0)));
        if (s.length() > 1) {
            sb.append(s.substring(1, s.length()).toLowerCase());
        }
    }
    System.out.println(sb);
    }
}
