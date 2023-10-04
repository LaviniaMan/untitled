public class HomeworkDataTypes {
    public static void main(String[] args) {
        //Exercice 1
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "la2b3c";
        //Exercice 2a
        byte x = 2;
        double a = x;
        int y = (int) a;
        System.out.println(y);
        //How it should be done
        byte variabila1 = 2;
        int variabila2 = variabila1;
        //Exercice 2b
        float z = 5.25f;
        double w = z;
        int q =(int) w;
        System.out.println(q);
        //How it should be done 2
        float variabila3 = 5.25f;
        int variabila4 = (int)variabila3;
        //Exercice 3
        String myCountry = "Romania";
        int lungime = myCountry.length();
        System.out.println(lungime);
        //Exercice 4
        double []myArray = {1.2,2.3,3.4,4.5};
        //Exercice 4a
        System.out.println(myArray[1]);
        //Exercice 4b
        System.out.println(myArray[3]);
        int lungime2 = myArray.length;
        System.out.println(lungime2);











    }

}
