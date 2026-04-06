import java.util.Scanner;

public class Main {

    static void main(String[] args){
//        Movie interstellar = new SciFi("Interstellar");
//        interstellar.watchMovie();
//
//        Movie starWars = new Adventure("Star Wars");
//        starWars.watchMovie();
//
//        Movie asBranquelas = new Comedy("As Branquelas");
//        asBranquelas.watchMovie();
//
//        Movie inter = Movie.getMovie("SciFi", "Interstellar");
//        inter.watchMovie();

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter a type \nA - Adventure\nC - Comedy\nS - SciFi\nQ - Quit\nR: ");
            String op = scan.nextLine();

            if("Qq".contains(op)){
                break;
            }

            System.out.println("Movie title: ");
            String title = scan.nextLine();
            Movie movie = Movie.getMovie(op,title);
            movie.watchMovie();
        }


    }

}
