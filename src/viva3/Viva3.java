package viva3;
public class Viva3 {
    public static void main(String[] args) {
        System.out.println("The epic battle begins!");
        Phantom phantom = new Phantom();
        BlackMage blackMage = new BlackMage();
        
        int damageValue;
        
        while (blackMage.getHp() > 0) {
            // Inside the loop, Phantom deals damage to the Black Mage
            damageValue = phantom.damage(blackMage);
            if (damageValue > 0) {
                System.out.println("[NORM] Phantom has dealt " + damageValue + " damage to the Black Mage (" + blackMage.getHp() + "/100)");
            } else {
                System.out.println("[MISS] Phantom has dealt 0 damage to the Black Mage (" + blackMage.getHp() + "/100)");
            }
        }
        System.out.println("The Black Mage is defeated...");
    }
    
}
