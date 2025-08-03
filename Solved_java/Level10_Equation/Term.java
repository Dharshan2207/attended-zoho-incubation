package Level10_Equation;

import java.util.ArrayList;

public class Term {
    private int coefficient;

    public ArrayList<Character> variable = new ArrayList<>();
    public ArrayList<Integer> power = new ArrayList<>();

    public int filledVariableCount = 0;

    public void addCoefficient(int coefficient){
        this.coefficient = coefficient;
    }

    public void addVariableAndPower(Character var, int power){
        this.variable.add(var);
        this.power.add(power);
        filledVariableCount++;
    }

    public void displayTerm(Term t){
        int count = t.filledVariableCount;

        System.out.print(t.coefficient);
        int i = 0;
        while(count > 0){
            System.out.print(t.variable.get(i) + "^");
            System.out.print(t.power.get(i));
            i++;
            count--;
        }
    }

    public static Term multiplyTerm(Term t1, Term t2){
        Term result = new Term();
        int count1 = t1.filledVariableCount;
        int count2 = t2.filledVariableCount;

        int i = 0 ,j = 0;

        while(count1 > 0){
            result.addVariableAndPower(t1.variable.get(i), t1.power.get(i));
            i++;

            count1--;
        }

        while(count2 > 0){

            if(result.variable.contains(t2.variable.get(j))){
                int power = result.power.get(j) + t2.power.get(j);
                result.power.set(j, power);
                j++;
            }
            else{
                result.addVariableAndPower(t2.variable.get(j), t2.power.get(j));
                j++;
            }

            count2--;
        }

        result.coefficient = t1.getCoefficient() * t2.getCoefficient();
        return result;
    }


    public int getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public ArrayList<Character> getVariable() {
        return this.variable;
    }

    public void setVariable(ArrayList<Character> variable) {
        this.variable = variable;
    }


    public int getFilledVariableCount() {
        return this.filledVariableCount;
    }

    public void setFilledVariableCount(int filledVariableCount) {
        this.filledVariableCount = filledVariableCount;
    }



}
