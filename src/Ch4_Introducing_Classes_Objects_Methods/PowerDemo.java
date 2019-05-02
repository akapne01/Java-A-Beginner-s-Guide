package Ch4_Introducing_Classes_Objects_Methods;

class Power {
    double b;
    int e;
    double val;

    Power(double base, int exp) {
        b = base;
        e = exp;

        this.val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) this.val *= base;
    }

    // this refers to an object on this the method is called
    double get_power() {
        return this.val;
    }
}

public class PowerDemo {
    public static void main(String[] args) {
        Power x = new Power(4.0, 2);
        Power y = new Power(2.5, 1);
        Power z = new Power(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_power());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_power());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_power());


        byte number = 0b0000010;

        System.out.println(number);

        // 00001010 = 10
        // 00010100 = 20

    }
}
