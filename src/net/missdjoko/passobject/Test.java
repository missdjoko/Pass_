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

    boolean equales(Test o){ // ��� ���������� Test- ��� �� �����, � ��� int
        if (o.a==a && o.b==b) return true;// ���������� true, ���� � ����������� ������ ���������� ������
        else return false;                // �� ������� ��� ����
    }
}
