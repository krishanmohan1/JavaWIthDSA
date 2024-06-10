package BasicsOfJava;

public class doubleDataType {
    public static void main(String[] args){
        double x=5;
        double y=2;
        double z = 5/2;
        double w= x/y;
        System.out.println(5/2);
        /* eske output me change aayega , yaha par do integer me
        division ho rha then usko double value me store kar rahe rahe hai
         */

        System.out.println(x/y);
        /* yaha par double value par division karke , double me store kar rahe hai
         */
        System.out.println(w);

        /*  5/2=2
            5.0/2=2.5
            5/2.0=2.5
            5.0/2.0=2.5

           computer me jab do integer par operation hota hai to interger he output aata hai

         */
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

    }
}
