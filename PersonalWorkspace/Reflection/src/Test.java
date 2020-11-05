// A simple Java program to demonstrate the use of reflection

// class whose object is to be created
class Test {

    // creating a private field
    private String s;

    // creating a public constructor
    public Test() {
        s = "GeeksforGeeks";
    }

    // Creating a public method with no arguments
    public String method1() {
        return "The string is " + s;

    }

    // Creating a public method with int as argument
    public String method2(int n) {
        return "The number is " + n;
    }

    // creating a private method
    private String method3() {
        return "Private method invoked";
    }
}