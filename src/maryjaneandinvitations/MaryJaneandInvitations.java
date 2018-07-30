/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maryjaneandinvitations;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MaryJaneandInvitations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	int numline = reader.nextInt();
        String type = reader.next();
        String namelist[] = new String [numline];
        for(int i = 0; i<numline; i++){
            String name = reader.next();
            namelist[i] = name;
        }
        String tletter;
        tletter = OrderType(numline,type);
        String a = ", beloved artist, I would love to have you at my party. Come to my crib on April 20th.";
        String o = ", beloved occasion enthusiast, come to my crib to celebrate this very special day.";
        String r = ", April 20th is happening again this year. Don't miss out.";
        String d = "Dear ";
        for(int i = 0; i < numline; i++){
            if(tletter.charAt(i) == 'A'){
                System.out.println(d+namelist[i]+a);
            }
            if(tletter.charAt(i) == 'O'){
                System.out.println(d+namelist[i]+o);
            }
            if(tletter.charAt(i) == 'R'){
                System.out.println(d+namelist[i]+r);
            }
        }
    }

    private static String OrderType(int numline,String type) {
        String order = "";
        char[] Type =type.toCharArray();
        char[] Order = new char [type.length()];
        int count = 0;
        int countX = 0;
        for(int i = 0; i < type.length(); i++){
            if(Type[i] != 'X'){
                Order[count]=Type[i];
                if(i != 0){
                    if(Type[i-1] == 'X'){
                        count += countX;
                        countX = 0;
                    }
                    else{
                        count++;
                    }
                }
                else{
                    count++;
                }
            }
            else{
                count--;
                countX++;
            }
        }
        for(int i = 0; i < Order.length; i++)
            order += Order[i];
        
        return order;
    }
}
