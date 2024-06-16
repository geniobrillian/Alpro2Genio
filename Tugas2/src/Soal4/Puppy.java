package Soal4;

class Puppy {
    int puppyAge;

    Puppy(String name) {
        System.out.println("Passed Name is :" + name);
    }

    public int setAge(int age) {
        puppyAge = age;
        return age;
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}

//Membuat class dengan nama Puppy dangan satu atribut yaitu puppyAge, dan menggunakan konstruktor untuk mengisi value String name di dalam nya, memiliki method setter dan getter yaitu method setAge untuk mengisi atribut puppyAge, sedangkan method getAge untuk menampilkan value atribut puppyAge, Serta membuat object dengan nam myPuppy