public class EnhancedPlayer {

    private String fullName, weapon;
    private int healthPercentage;

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon){
        this.fullName = fullName;

        if(healthPercentage <= 0){
            this.healthPercentage = 1;
        }else if(healthPercentage > 100){
            this.healthPercentage = 100;
        }else{
            this.healthPercentage = healthPercentage;
        }

        this.weapon = weapon;
    }

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public void loseHealth(int damage){
        healthPercentage -= damage;

        if(healthPercentage <= 0){
            System.out.printf("\nPlayer %s fainted", fullName);
            healthPercentage = 0;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage += extraHealth;

        if(healthPercentage > 100){
            System.out.println("Health fully restored");
            healthPercentage = 100;
        }else{
            System.out.printf("\nHealth restored to %d/100 points", healthPercentage);
        }
    }

}
