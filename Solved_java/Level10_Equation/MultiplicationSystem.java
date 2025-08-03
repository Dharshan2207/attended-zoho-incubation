package Level10_Equation;

public class MultiplicationSystem {
    Equation[] equations = new Equation[2];
    int count = 0;

    Equation result = new Equation();

    public void addToEquations(Equation e){
        equations[count] = e;
        count++;
    }

    public Equation multiplyEquation(){
        
        Equation eq1 = equations[0];
        Equation eq2 = equations[1];

        for(int i = 0; i < eq1.equation.size(); i++){
            for(int j = 0; j < eq2.equation.size(); j++){
                Term resultTerm = Term.multiplyTerm(eq1.equation.get(i), eq2.equation.get(j));
                result.addEquation(resultTerm);
            }
        }

        return result;
    }

    public void displayEquations(){
        Equation eq1 = equations[0];
        Equation eq2 = equations[1];

        eq1.displayEquation();
        System.out.println();
        eq2.displayEquation();
    }


}
