package Jobsheet5;

public class Power {
    int baseNumber, exponent;

    Power(int n, int e){
        baseNumber = n;
        exponent = e;
    }

    int powerBF(int n, int e){
        int result = 1;
        for (int i = 0; i < e; i++) {
            result = result * n;
        }
        return result;
    }

    int powerBF() {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * baseNumber;
        }
        return result;
    }

    int powerDC(int n, int e){
        if (e == 1) {
            return n;
        } else {
            if (e % 2 == 1) {
                return (powerDC(n, e/2) * powerDC(n, e/2) * n);
                // combine for odd exponent
            } else {
                return (powerDC(n, e/2) * powerDC(n, e/2));
                // combine for even exponent
            }
        }
    }
}
