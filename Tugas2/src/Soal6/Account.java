package Soal6;
public class Account {
    int a;
    int b;

    public void setData(int c, int d) {
        a = c;
        b = d;
    }

    public void showData() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }

    public static void main(String args[]) {
        Account obj[] = new Account[2];
        obj[0] = new Account();
        obj[1] = new Account();
        obj[0].setData(1, 2);
        obj[1].setData(3, 4);
        System.out.println("For Array Element 0");
        obj[0].showData();
        System.out.println("For Array Element 1");
        obj[1].showData();
    }
}
//Membuat class Accout yang memiliki atribut int a dan int b, memiliki method setData() untuk mengisi value dari atribut a dan b, Method showData() untuk menampilakan value dari a dan b, Memiliki Object yang bertipe Array dengan 2 indexs 