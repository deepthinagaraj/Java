/*
 * Ironman is fighting and requires Jarvis's help but Jarvis is busy computing palindromes
 * for alphanumeric characters. Ironman need to activate the sonic-punch to kill Thanos
 * but needs Jarvis's help who is struck with computing palindromes. The responsibility 
 * is on you to compute the palindrome method so that Jarvis can save Ironman
 * 
 * Write a function called saveIronman which will return a value true if the I/p string
 * is a Plaindrome else print 'Ironman is dead'
 */

import java.util.*;

class Jarvis {
    public String reverseString(String str) {
        String reverved_str;
        if (str.length() == 1) {
            reverved_str = str;
            return reverved_str;
        } else {
            reverved_str = reverseString(str.substring(1)) + str.charAt(0);
            return reverved_str;
        }
    }

    public String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        return str;
    }

    void saveIronman(String str1, String str2) {
        if (!str1.equals(str2)) {
            System.out.println("Ironman is Dead!!");
        } else {
            System.out.println("Ironman is saved!!");
        }
    }
}

public class ironmanDriver {
    public static void main(String[] args) {
        Jarvis help = new Jarvis();
        String str1 = help.input();
        String str2 = help.reverseString(str1);
        System.out.println(str2);
        help.saveIronman(str1, str2);
    }
}
