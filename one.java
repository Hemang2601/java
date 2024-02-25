class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Student extends Human {
    private int grade;

    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}

class Worker extends Human {
    private double weekSalary;
    private int workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public double moneyPerHour() {
        int workDaysPerWeek = 5;
        return weekSalary / (workHoursPerDay * workDaysPerWeek);
    }
}

class one {
    public static void main(String[] args) {
        Student student = new Student("Hemang", "Lakhadiya", 10);
        Worker worker = new Worker("Hiren", "Lakhadiya", 500, 8);

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println();

        System.out.println("Worker Information:");
        System.out.println("Name: " + worker.getFirstName() + " " + worker.getLastName());
        System.out.println("Week Salary: " + worker.getWeekSalary());
        System.out.println("Work Hours per Day: " + worker.getWorkHoursPerDay());
        System.out.println("Money Earned per Hour: " + worker.moneyPerHour());
    }
}
