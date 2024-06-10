package BasicsOfJava;

import com.sun.security.jgss.GSSUtil;

public class multipleVariable {
    public static void main(String[] args) {
//        int x=5;
//        int y=8;
//        int z=9;
          int x=5,y=8,z=9;    //  another way to assign variable in one line
        System.out.println(x);
        System.out.println(y);
        z=10;
//        z=x;
//        z=x+y;
//        z=x/y;
        System.out.println(z);
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
        System.out.println("The value of z is "+z);
        System.out.println(x+y+z);
        System.out.println("mast cheez "+x+y+z); // ye yaha dekho differnt chij hua hai
        /* yaha seekhne ki cheej hai ki double court ke sath add karte hai agar no. ko to wo bhi text ban jata hai */
        System.out.println(""+x+y+z); // yaha par bhi differnt chij hua hai.

        System.out.println(x+y+""+z);
        /*yaha par dekho, pahle x,y no. add hoga phir string ke sath add hoke text ban jayega
        then phir z text ke sath add hoga text ban jayega */







//
    }
}
