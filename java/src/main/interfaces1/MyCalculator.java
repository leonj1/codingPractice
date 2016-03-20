package src.main.interfaces1;

/**
 * Created by jose on 3/2/16.
 */
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
