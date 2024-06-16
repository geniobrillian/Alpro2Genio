package Soal5;
class Point {
    public double x, y;

    Point(double x_value, double y_value) {
        x = x_value;
        y = y_value;
    }

    public void clear() {
        this.x = 0;
        this.y = 0;
    }

    public double distance(Point that) {
        double xDiff = x - that.x;
        double yDiff = y - that.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(3, 6);
        System.out.println("Jarak point1 dan point2 adalah : " + point1.distance(point2));

        point1.clear();
        point2.clear();
        System.out.println("Jarak sekarang : "+point2.distance(point1)); 
    }
}

// Membuat class dengan nama Point dengan atribut double x dan y, Memiliki konstruktor untuk mengisi value dari atribut x dan y, memiliki method clear() untuk mereset nilai atribut x dan y, dan method distance yang memiliki parameter object Point dan fungsinya menjumlahkan nilai yang masuk didalam code, memiliki 2 object yaitu point1 dan point2.
