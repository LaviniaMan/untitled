public class MyString {
    public static void main(String[] args) {
        String myString = "this is a text";
        System.out.println(myString);
        System.out.println("myString");

        int lungime= myString.length();
        System.out.println("lungimea textului este "+lungime+ " caractere");

        String myName = "Man Lavinia Roxana";
        int lungime2= myName.length();
        System.out.println(lungime2);
        System.out.println("lungimea numelui \""+ myName+"\" este \n"+ lungime2);
        String myNameWithoutSpace = myName.replace(" ","");
        int lungime3 = myNameWithoutSpace.length();
        System.out.println(lungime3);

        char aPatraLitera = myName.charAt(4);
        char primaLitera = myName.charAt(0);

        System.out.println(aPatraLitera);
        System.out.println(primaLitera);




    }
}
