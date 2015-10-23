package net.missdjoko.passobject;

/**
 * Created by Miss_ on 23.10.2015.
 */
public class PassObject {
    public static void main (String [] args ){
        Test ob1= new Test(5,10);
        Test ob2= new Test(5,10);
        Test ob3= new Test(-1,-1);

        System.out.println("ob1==ob2 : " + ob1.equales(ob2));
        System.out.println("ob1!=ob3 : "+ob1.equales(ob3));

    }
}
