class AddSub {
    protected int num1;
    protected int num2;

    public AddSub(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int calAdd() {
        return num1 + num2;
    }

    public int calSub() {
        return num1 - num2;
    }
}

class MulDiv extends AddSub {

    public MulDiv(int num1, int num2) {
        super(num1, num2);
    }

    public int calMul() {
        return num1 * num2;
    }

    public double calDiv() {
        if (num2 != 0) {

            return (double) num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}

class two {
    public static void main(String[] args) {

        MulDiv calculator = new MulDiv(10, 5);

        System.out.println("Addition: " + calculator.calAdd());
        System.out.println("Subtraction: " + calculator.calSub());
        System.out.println("Multiplication: " + calculator.calMul());
        System.out.println("Division: " + calculator.calDiv());
    }
}
