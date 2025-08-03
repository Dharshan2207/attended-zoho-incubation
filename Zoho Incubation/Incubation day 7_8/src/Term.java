import java.util.HashMap;

public class Term {
    int coefficient;
    HashMap<Character, Integer> variable;


    int calculatePowerSum(char ch, Term t1, Term t2){
        int power = t1.variable.get(ch) + t2.variable.get(ch);
        return power;
    }

    String powerToString(Term t, char ch){
        String result = "";
        if(t.variable.get(ch) > 0){
            if(t.variable.get(ch) == 1){
                result += ch;
            }
            else{
                result += ch;
                result += '^';
                result += t.variable.get(ch);
            }
        }
        return result;
    }


    Term multiply(Term t1, Term t2){
        Term t3 = new Term();
        t3.coefficient = t1.coefficient * t2.coefficient;

        int totalPower = calculatePowerSum('x', t1, t2);
        t3.variable.put('x', totalPower);

        totalPower = calculatePowerSum('y', t1, t2);
        t3.variable.put('y', totalPower);

        totalPower = calculatePowerSum('z', t1, t2);
        t3.variable.put('z', totalPower);

        return t3;
    }


    String toString(Term t){
        String result = "";

        result += t.coefficient;
        result += powerToString(t, 'x');
        result += powerToString(t, 'y');
        result += powerToString(t, 'z');

        return result;
    }
}