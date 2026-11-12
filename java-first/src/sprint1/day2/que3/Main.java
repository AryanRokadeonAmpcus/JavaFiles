package sprint1.day2.que3;

import javax.crypto.spec.PSource;

public class Main {

    public static void printMonths(String month){
        switch (month) {

                case "jan":
                System.out.println("This is the 1st Month of the Year January");
                break;

            case "feb":
                System.out.println("This is the 2nd Month of the Year February");
                break;

            case "mar":
                System.out.println("This is the 3rd Month of the Year March");
                break;

            case "apr":
                System.out.println("This is the 4th Month of the Year April");
                break;

            case "may":
                System.out.println("This is the 5th Month of the Year May");
                break;

            case "jun":
                System.out.println("This is the 6th Month of the Year Jun");
                break;

            case"jul":
                System.out.println("This is the 7th Month of the Year July");
                break;

            case "aug":
                System.out.println("This is the 8th Month of the Year August");
                break;

            case "sep":
                System.out.println("This is the 9th Month of the Year September");
                break;

            case "oct":
                System.out.println("This is the 10th Month of the Year October");
                break;

            case "nov":
                System.out.println("This is the 11th Month of the Year November");
                break;

            case"dec":
                System.out.println("This is the 12th Month of the Year December");
                break;

            default:
                System.out.println("Please provide valid month");
        }
    }

    public static void main(String[] args) {

        Main.printMonths("oct");
    }
}

