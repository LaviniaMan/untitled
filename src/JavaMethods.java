public class JavaMethods {
    //main
    public static void main(String[] args) {
        printHello();
        weLearn();
        helloName("Lavinia");
        getSum(2, 3);
        getProduct(10, 5);
        getSum(2, 3, 5);
        getSum(2.3, 2.5);
        helloNameAge("Lavinia", 33);
        printFriends("Lavinia", "Cristina");
        getSumWithReturn(5, 6);
        int result = getSumWithReturn(5, 6);
        System.out.println(result);
        System.out.println(getSumWithReturn(7, 9));
        getProductWithReturn(100, 5);
        int product = getProductWithReturn(100, 5);
        System.out.println(product);
        // System.out.println(getProductWithReturn(100,5));
        System.out.println(areMere("Ana"));
        System.out.println(areMere("Lavinia"));
        System.out.println(negativeNumber(5));
        System.out.println(biggerNumber(11, 33));
        System.out.println(arithmeticMean(20,45,90));
        System.out.println(StringLenght("Mesopotamia"));
        String word1 = "Maraton";
        String word2 = "Nocturn";
        System.out.println(concatenateString(word1,word2));




    }

    private static void printHello() {
        System.out.println("Hello world");
    }

    private static void weLearn() {
        System.out.println("We learn Java Methods");
    }

    private static void helloName(String name) {
        System.out.println("Hello " + name);
    }

    private static void helloNameAge(String name, int age) {
        System.out.println(name + " is " + age + " year old");
    }

    private static void getSum(int x, int y) {
        System.out.println(x + y);
    }

    private static void getSum(double x, double y) {
        System.out.println(x + y);
    }

    private static void getSum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    private static void getProduct(int x, int y) {
        System.out.println(x * y);
    }

    private static void printFriends(String name1, String name2) {
        System.out.println(name1 + " and " + name2 + " are friends");
    }

    private static int getSumWithReturn(int x, int y) {
        // int sum = x+y
        return x + y;
    }

    // to do getProductWithReturn...
    private static int getProductWithReturn(int x, int y) {
        return x * y;
    }

    private static String areMere(String nume) {
        return nume + " are mere";
    }


    //Tema 1
// redare numar negativ
    private static int negativeNumber(int x){
        return -x;}
//redare numar mai mare
    private static int biggerNumber(int x, int y ){
        return Math.max(x, y); }
//media aritmetica a 3 numere
    private static double arithmeticMean(double x, double y, double z){
        return (x+y+z)/3;}
//lungimea numelui
    private static int StringLenght(String word){return word.length();}
//Concatenare 2 String
    private static String concatenateString(String word1, String word2){
        return word1+" "+word2;}
//Revers "abcd"



}









