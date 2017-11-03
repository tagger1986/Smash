
package smash;


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

        System.out.println(smash("Nikola", "Ide", "Ulicom"));

    }
    
}
