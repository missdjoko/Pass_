package net.missdjoko.passobject;

/**
 * Created by Miss_ on 23.10.2015.
 */
public class Test {
    int a,b;

    Test(int i, int j){
        a=i;
        b=j;
    }

    boolean equales(Test o){ // тип пароаметра Test- тут не класс, а как int
        if (o.a==a && o.b==b) return true;// возвращает true, если в параметразх указан вызывающий объект
        else return false;                // те вызввал сам себя
    }
}
