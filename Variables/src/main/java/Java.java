public class Java {

    // 1. Add two ints
    int add(int a, int b) {
        return a + b;
    }

    // 2. Add three ints
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Add four ints
    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 4. Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // 5. Add three doubles
    double add(double a, double b, double c) {
        return a + b + c;
    }

    // 6. Add int and double
    double add(int a, double b) {
        return a + b;
    }

    // 7. Add double and int
    double add(double a, int b) {
        return a + b;
    }

    // 8. Add two long values
    long add(long a, long b) {
        return a + b;
    }

    // 9. Add two float values
    float add(float a, float b) {
        return a + b;
    }

    // 10. Add unspecified number of integers (varargs)
    int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
________________________________________

}
