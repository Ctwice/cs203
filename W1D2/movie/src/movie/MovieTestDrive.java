
package movie;


public class MovieTestDrive {

    
    public static void main(String[] args) {
       Movie one = new Movie();
       one.title = "Gone with the Stock";
       one.genre = "Tragic";
       one.rating = -2;
       Movie two = new Movie();
       two.title = "Lost in Cuicle Space";
       two.genre = "commedy";
       two.rating = 5;
       two.playIT();
       Movie three = new Movie();
       three.title = "Byte Club";
       three.genre = "Tragic but ultimately uplifting";
       three.rating = 127;
    }
    
}
