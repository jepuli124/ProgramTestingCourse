package week6.calculator.calculator.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private Scanner scanner;
    private ArrayList<Integer> vec = new ArrayList<>();;

    public Calculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void askGrades() {
        int i = 1;
        String s = "";

        System.out.println(
                "***\nThis program calculates average of school grades (4-10). Input number, press enter. Zero (0) ends the input.");

        while (!s.equals("0")) {
            System.out.println(i + ": ");
            if (scanner.hasNext()) {
                s = scanner.nextLine();
                try {
                    if (Integer.parseInt(s) >= 4){
                        if (Integer.parseInt(s) <= 10){
                            int value = Integer.parseInt(s);
                            this.vec.add(value);
                        }
                    }
                    i++;
                } catch (Exception e) {
                    continue;
                }
                
            }
        }

    }

    public float calculateAverage() { 
        return (float) divider(sum(), this.vec.size());
    }

    public float divider(int x, int y) {
        System.out.println(x + " " + y);
        float value = (float) x / y;
        if(y == 0){
            value = 0;
        }
        return value;
    }

    public int sum() {
        int s = 0;
        for (int integer : this.vec) {
            s += integer;
        }
        return s;
    }

    public ArrayList<Integer> getVec() {
        return this.vec;
    }

}
