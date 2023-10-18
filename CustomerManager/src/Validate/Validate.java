package Validate;


import java.util.Scanner;

public class Validate {

    private Scanner sc = new Scanner(System.in);

    public Validate() {
    }

    public int inputInt(String ms, int min, int max) {
        int output;
        System.out.print(ms + " : ");
        while (true) {
            try {
                output = Integer.parseInt(sc.nextLine());
                if (output >= min && output <= max) {
                    return output;
                }
                System.err.print(ms + " again: ");
            } catch (Exception e) {
                System.err.println("Try input a digit !!");
            }
        }
    }

    public double inputDouble(String ms, int min, int max) {
        double output;
        System.out.print(ms + " : ");
        while (true) {
            try {
                output = Integer.parseInt(sc.nextLine());
                if (output >= min && output <= max) {
                    return output;
                }
                System.err.print(ms + " again: ");
            } catch (Exception e) {
                System.err.println("Try input a digit !!");
            }
        }
    }

    public String inputID(String ms) {
        String output;
        System.out.print(ms + " : ");
        while (true) {
            output = sc.nextLine().trim();
            if (output.matches("^[A-Za-z0-9]+$")) {
                return output;
            }
            System.err.print(ms + " again: ");
        }
    }

    public String inputString(String ms) {
        String output;
        System.out.print(ms + " : ");
        while (true) {
            output = sc.nextLine().trim();
            if (output.matches("^[A-Za-z\\s]+$")) {
                return output;
            }
            System.err.print(ms + " again: ");
        }
    }

//    public static void main(String[] args) {
//        Validate v = new Validate();
//        System.out.println(v.inputDouble("Enter salary", 1, 10));
//        System.out.println(v.inputInt("Enter int", 1, 10));
//        System.out.println(v.inputID("enter id"));
//        System.out.println(v.inputString("enter name"));
//
//    }
}
