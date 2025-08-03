package Level10_Equation;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MultiplicationSystem system = new MultiplicationSystem(); 

        while(true){
            int choice;

            System.out.println();
            System.out.println("1. Create new equation");
            System.out.println("2. Multiply equations");
            System.out.println("3. Display equations");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            if(choice == 1){
                if(system.count >= 2){
                    System.out.println("Two equations are already added. ");
                    continue;
                }
                Equation equation = new Equation();
                int terms;
                System.out.println("How many terms ? ");
                terms = sc.nextInt();

                while(terms > 0){
                    Term t = new Term();

                    int coefficient;

                    System.out.println("Enter coefficient : ");
                    coefficient = sc.nextInt();

                    Character variable;
                    int power;

                    System.out.println("Enter variable : ");
                    variable = sc.next().charAt(0);

                    System.out.println("Enter power");
                    power = sc.nextInt();

                    t.addCoefficient(coefficient);
                    t.addVariableAndPower(variable, power);

                    terms--;

                    equation.addEquation(t);
                }

                system.addToEquations(equation);

            }

            else if(choice == 2){
                Equation result = system.multiplyEquation();
                result.checkSameVariable();
                result.displayEquation();
            }
            else if(choice == 3){
                system.displayEquations();
            }
            else if(choice == 4){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Enter only available options");
                continue;
            }


        }

        sc.close();
    }
}
