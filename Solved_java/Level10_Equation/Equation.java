package Level10_Equation;

import java.util.ArrayList;

public class Equation {
    ArrayList<Term> equation = new ArrayList<>();
    public int terms = 0;

    public void addEquation(Term t){
        equation.add(t);
        terms++;
    }


    public void checkSameVariable(){
        for(int i = 0; i < this.equation.size(); i++){
            Term t1 = this.equation.get(i);
            for(int j = i + 1; j < this.equation.size(); j++){
                
                Term t2 = this.equation.get(j);
                    
                if(isSameVariableStructure(t1, t2)){
                    t1.setCoefficient(t1.getCoefficient() + t2.getCoefficient());
                    this.equation.remove(j);
                    j--;
                }
            }
        }
        terms = equation.size();
    }

    private boolean isSameVariableStructure(Term t1, Term t2) {
        if (t1.getFilledVariableCount() != t2.getFilledVariableCount()) return false;

        for (int i = 0; i < t1.variable.size(); i++) {
            char var = t1.variable.get(i);
            int power = t1.power.get(i);

            int indexInT2 = t2.variable.indexOf(var);
            if (indexInT2 == -1 || t2.power.get(indexInT2) != power) {
                return false;
            }
        }

        return true;
    }

    public void displayEquation(){
        boolean firstPrinted = false;
        for (Term term : equation) {
            int count = term.filledVariableCount;
            if(firstPrinted){
                if(term.getCoefficient() > 0){
                    System.out.print("+ " + term.getCoefficient());
                }
                else{
                    System.out.print("- " + term.getCoefficient());
                }
            }
            else{
                if(term.getCoefficient() < 0){
                    System.out.print("- " + term.getCoefficient());
                }
                else{
                    System.out.print(term.getCoefficient());
                }
            }
            
            firstPrinted = true;

            int i = 0;
            while(count > 0){

                System.out.print(term.variable.get(i));
                if(term.power.get(i) > 1){
                    System.out.print("^" + term.power.get(i));
                }

                i++;

                count--;
            }
            System.out.print(" ");
        }
    }


}
