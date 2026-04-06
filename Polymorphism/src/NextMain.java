public class NextMain {

    static void main(String[] args){

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        //var deixa tirar vantagem da variavel local
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Aiplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Interstellar");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure){ //instanceof testa o tipo de um objeto ou instancia, retorna true se for Adventure
            ((Adventure) unknownObject).watchAdventure();
        } else if(unknownObject instanceof SciFi syfy){
            syfy.watchSciFi();
        }

    }

}
