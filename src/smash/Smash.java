/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smash;

/**
 *
 * @author nosto
 */
public class Smash {

    public static String smash(String... words) {

        StringBuilder recenica = new StringBuilder();

        for (String word : words) 
        {
        recenica.append(word).append(" ");
        }
        return recenica.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println(smash("Rodja", "Ide", "Ulicom"));

    }
    
}
