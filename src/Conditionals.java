public class Conditionals {
    public static void main(String[] args) {
        if (5<0){
            System.out.println("5 is smaller than 0");
        }
        else
        {System.out.println("5 is smaller than 0");
            System.out.println("another statement");}

        int time = 99;
        if (time<10){
            System.out.println("good morning");
        } else if (time<18) {
            System.out.println("Good day");
        } else if (time<24) {
            System.out.println("Good evening");
        }
        else System.out.println("only 24 hours in a day!!!");

        int day = 5;
        switch (day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default:
                System.out.println("unknown");
        }

        int month = 7;
        switch (month){
            case 1: System.out.println("January");break;
            case 2: System.out.println("February");break;
            case 3: System.out.println("March");break;
            case 4: System.out.println("April");break;
            case 5: System.out.println("May");break;
            case 6: System.out.println("June");break;
            case 7: System.out.println("Julie");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("September");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("December");break;
            default: System.out.println("not a month");
        }
    }
}
