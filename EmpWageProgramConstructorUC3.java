public class EmpWageComputationProgramConstructorUC3 {

    private static double isPartTime;
    private static int isFullime;
    private static double isFullTime;
    private static int empHrs;
    private static int wagePerHour;
    private static int empWage;
//    int isFullTime = 2;     //Constants
//    int wagePerHour = 20;
//    int empHrs = 0;  //variables
//    int empWage = 0;

    public EmpWageComputationProgramConstructorUC3() {

    }

    public EmpWageComputationProgramConstructorUC3(int a, int b, int c, int d, int e) {
        this.isPartTime = a;
        this.isFullTime = b;
        this.wagePerHour = c;
        this.empHrs = d;
        this.empWage = e;
    }

    void display(EmpWageComputationProgramConstructorUC3 object) {
        this.isPartTime = object.isPartTime;
        this.isFullTime = object.isFullTime;
        this.empWage = object.empWage;
        this.empHrs = object.empHrs;
        System.out.println("Emp Wage:" + empWage);

    }

    public static void main(String[] args) {
        EmpWageComputationProgramConstructorUC3 s1 = new EmpWageComputationProgramConstructorUC3(1, 2, 20, 0, 0);
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isPartTime)
            empHrs = 4;
        else if (empCheck == isFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * wagePerHour;
        s1.display(s1);
    }

}
