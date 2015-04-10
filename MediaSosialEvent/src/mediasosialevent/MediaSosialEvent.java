/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DMC
 */
public class MediaSosialEvent {

    int pil;
    public Scanner sSt = new Scanner(System.in);
    public Scanner sInt = new Scanner(System.in);

    public int menu() {
        do {
            System.out.println("Log in as : ");
            System.out.println("1. Public User");
            System.out.println("2. Event Organizer ");
            System.out.println("3. Group Admin");
            System.out.println("0. Exit");
            System.out.println("Answer : ");
            pil = sInt.nextInt();
        }while((pil == 0) || (pil>4)); 
            return pil;
        } /**
         * @param args the command line arguments
         */

    public static void main(String[] args) {

        // TODO code application logic here
    }
}
