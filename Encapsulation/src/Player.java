public class Player {

    public String name, weapon;
    public int health;

    public void loseHealth(int damage){
        health -= damage;

        if(health <= 0){
            System.out.printf("\nPlayer %s fainted", name);
            health = 0;
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;

        if(health > 100){
            System.out.println("Health fully restored");
            health = 100;
        }else{
            System.out.printf("\nHealth restored to %d/100 points", health);
        }
    }

}


