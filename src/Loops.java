public class Loops {
    public static void main(String[] args) {

        //FOR
        //afisarea numerelor de la 5 la 0 in ordine descrescatoare
        for (int i=5; i>=0; i--){
            System.out.println(i);
        }


        //afisare numerelor de la 0 la 10 din 2 in 2
        for (int i=0; i<=10; i+=2){
            System.out.println(i);
        }

        //FOR EACH
        String cars[] = {"BMW","Mazda","Opel","Toyota"};
        for (String car: cars){
            System.out.println(car);
        }

        //WHILE
        int l=0;
        while (l<5){
            System.out.println(l);
            l++;
        }

        //DO WHILE
        int j=0;
        do {
            System.out.println(j);
            j++;
        }while (j<5);

        //BREAK
        for (int k=0; k<10; k++){
            if (k==4){break;}
            System.out.println(k);
        }
        int k=0;
        while (k<10){
            k++;
            if (k==4) continue;
            System.out.println(k);
        }

        //Exercise 4 from homework A5
        String fruits[] = {"mar", "capsuni", "pere", "banane" };

        //version1 - FOR clasic
        for (int i=0; i< fruits.length; i++){
        System.out.println("Imi place sa mananc "+ fruits[i]);}

        //varianta2 - FOR EACH
        for (String f:fruits){
            System.out.println("Imi place sa mananc "+f);
        }


        //Exercise 5 from homework A5
        int luna=7;
        switch (luna){
            case 1: System.out.println("Ianuarie");break;
            case 2: System.out.println("Februarie");break;
            case 3: System.out.println("Martie");break;
            case 4: System.out.println("Aprilie");break;
            case 5: System.out.println("Mai");break;
            case 6: System.out.println("Iunie");break;
            case 7: System.out.println("Iulie");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("Septembrie");break;
            case 10: System.out.println("Octombrie");break;
            case 11: System.out.println("Noiembrie");break;
            case 12: System.out.println("Decembrie");break;


        }

    }
}
