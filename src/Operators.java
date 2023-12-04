public class Operators {
    public static void main(String[] args) {
        int sum1 = 100+50;
        int sum2 = sum1 +50;
        int sum3 =sum1+sum2;
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1/number2);
        System.out.println(number1*number2);
        System.out.println(number1%number2);
        System.out.println(9%2);//restul
        System.out.println(9/2);//catul
        System.out.println(10%7);


        System.out.println(++number1);
        System.out.println(--number2);
        //Cand punem ++ dupa number1 prima data il afiseaza si dupa il incrementeaza ca in exemplul de mai jos la fel si cu decrementare se aplica aceeasi regula//
        System.out.println(number1++);
        System.out.println(number1);

        //Operatori de atribuire
        int number3 = number2;
        System.out.println(number2);

        number2=1;
        number2= number2+2;

        number2+=4; // echivalent cu number2=number2+4
        System.out.println(number2);
        number2-=2;
        System.out.println(number2);

        number2*=2;
        System.out.println(number2);

        //Operatori de comparare
        System.out.println(number1>number2);
        System.out.println('A'=='A');
        System.out.println('a'!='a');

        System.out.println(true);
        System.out.println(!true);

        System.out.println(number1);//102
        System.out.println(number2);//10
        boolean condition = number1>number2 || number1<100;
        System.out.println(condition);

        if (!condition)
            System.out.println("Conditia este adevarata");
        else System.out.println("Conditia nu este adevarata");









    }
}
