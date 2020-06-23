package lesson_02;

public class MultiClassJavaFile {
    public static void main(String[] args) {
        A.print();
        B.print();
        C.print();
        Test.привед_медвед();
    }
}

class A {
    public static void print() {
        System.out.println("Class A");
    }
}

class B {
    public static void print() {
        System.out.println("Class B");
    }
}

class C {
    public static void print() {
        System.out.println("Class C");
    }
}

