interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Test_Multiple implements Printable, Showable {

    public void print() {
        System.out.println("Printing Method");
    }

    public void show() {
        System.out.println("Showing Method");
    }
}

class four {
    public static void main(String[] args) {
        Test_Multiple t1 = new Test_Multiple();
        t1.print();
        t1.show();
    }
}
