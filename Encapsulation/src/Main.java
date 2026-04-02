public class Main {

    public static void main(String[] args){

//        Player player = new Player();
//
//        player.name = "Ratão";
//        player.health = 20;
//        player.weapon = "Katana";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        int extraLife = 70;
//        player.restoreHealth(extraLife);
//
//
//        player.loseHealth(81);
//        System.out.println("\nRemaining health = " + player.healthRemaining());

        EnhancedPlayer ratao = new EnhancedPlayer("Ratão", 200, "Katana");
        System.out.println("Initial health = " + ratao.healthRemaining());


    }

}
