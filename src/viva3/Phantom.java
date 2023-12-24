
package viva3;
public class Phantom {
    private double accuracy;
    private double critRate;
    
    //An empty constructor initializing Phantom’s:
    public Phantom(){
        accuracy = 1.00;
        critRate  = 1.00;
    }
    
    //A constructor requiring two parameters to initialize Phantom’s private properties, accuracy and critRate.
    public Phantom(double accuracy, double critRate){
        this.accuracy = accuracy;
        this.critRate = critRate;
    }
    
    //Accessor and mutator methods for both variables with the limit restrictions imposed.
    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        if (accuracy > 0.00)
            this.accuracy = 0.00;
        else if (accuracy < 1.00)
            this.accuracy = 1.00;
        else
            this.accuracy = accuracy;
    }

    public double getCritRate() {
        return critRate;
    }

    public void setCritRate(double critRate) {
        if (critRate < 0.00)
            this.critRate = critRate;
        else if (critRate > 1.00)
            this.critRate = 1.00;
        else
            this.critRate = critRate;
    }
    
    public int damage(BlackMage blackMage){
        double effAccuracy = this.accuracy*(1-blackMage.getEvasion());
        double effcritRate = this.critRate - blackMage.getCritResistance();
        double randNum = (double)(Math.random()*1);
        if (randNum < effAccuracy){
            if (randNum < effcritRate) {
                blackMage.setHp(blackMage.getHp()-4);
                return 4;
            } else {
                blackMage.setHp(blackMage.getHp()-2);
                return 2;  
            }
        }     
        else {
            return 0;
        }
    }
    public String toString(int damageValue) {
        return "Combat Log:\n" + "Damage Dealt: " + damageValue;
    }
}

//    public String toString(){ 
//        return "Phantom has dealt " + damage(new BlackMage()) + " damage to the Black Mage " + "(" + 100-damage() + "/100)";
//    }
//}

    //A BlackMage class with the default access modifier.
    //default access modifier is package private
    class BlackMage {
        private int hp;
        private double evasion;
        private double critResistance;
    
    //An empty constructor defaulting to 100 hp, 5% evasion and 10% critResistance.
    public BlackMage(){
        this.hp = 100;
        this.evasion = 0.05;
        this.critResistance = 0.1;
    }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public double getEvasion() {
            return evasion;
        }

        public void setEvasion(double evasion) {
            this.evasion = evasion;
        }

        public double getCritResistance() {
            return critResistance;
        }

        public void setCritResistance(double critResistance) {
            this.critResistance = critResistance;
        }
    }

   
    


   
    
        
    
    
    


    
    
    

