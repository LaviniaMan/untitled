public class HomeworkDataType2 {
    public static void main(String[] args) {
        //Exercice 1
        float one = 2.5f;
        float two = 3.25f;
        System.out.println(one + two);
        System.out.println(one - two);
        System.out.println(one * two);
        //Exercice 2
        String myFavoriteMovie = "Howl's moving Castle";
        System.out.println("My favorite movie is "+'"'+ myFavoriteMovie+'"');
        //Exercice 3
        myFavoriteMovie.toUpperCase();
        myFavoriteMovie.toLowerCase();
        System.out.println(myFavoriteMovie.toLowerCase());
        System.out.println(myFavoriteMovie.toUpperCase());
        //Exercice 4
        int lungime = myFavoriteMovie.length();
        System.out.println(lungime);
        System.out.println(myFavoriteMovie.length());
        //Exercice 5
        char []myCharArray = {'a','b','c','d'};
        System.out.println(myCharArray[0]);
        System.out.println(myCharArray[1]);
        System.out.println(myCharArray[3]);

        for (int i=0;i<myCharArray.length;i++) {
            System.out.println(myCharArray[i]);

        }




    }
}
