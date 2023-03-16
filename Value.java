class Value {
    
public static void main(String[] args) {

int a;
double b;
boolean c;
boolean d;
boolean e;
boolean f;

        a = (101 + 0) / 3;
        System.out.println("(101 + 0) / 3 : " + a);

        b = 3.0e-6 * 10000000.1;
        System.out.println("3.0e-6 * 10000000.1 : " + b);

        c = true && true;
        System.out.println("true && true : " + c);

        d = false && true;
        System.out.println("false && true : " + d);

        e = (false && false) || (true && true);
        System.out.println("(false && false) || (true && true) : " + e);

        f = (false || false) && (true && true);
        System.out.println("(false || false) && (true && true) : " + f);
    }
}
