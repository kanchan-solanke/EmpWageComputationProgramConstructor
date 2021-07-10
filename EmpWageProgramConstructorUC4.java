public class EmpWageComputationProgramConstructorUC5 {
    private static int isPartTime;
    private static int isFullTime;
    public static int empRatePerHr;
    public static int numWorkingDays;
    private int empWage;
    private int empHrs;

    public EmpWageComputationProgramConstructorUC5() {

    }

    public EmpWageComputationProgramConstructorUC5(int a, int b, int c, int d) {
        this.isPartTime = a;
        this.isFullTime = b;
        this.empRatePerHr = c;
        this.numWorkingDays = d;

    }

    void display(EmpWageComputationProgramConstructorUC5 object) {
        this.isPartTime = object.isPartTime;
        this.isFullTime = object.isFullTime;
        this.empWage = object.empWage;
        this.empHrs = object.empHrs;
        System.out.println("Emp Wage:" + empWage);
    }

    public static void main(String[] args) {
        EmpWageComputationProgramConstructorUC5 s1 = new EmpWageComputationProgramConstructorUC5(1, 2, 20, 2);
        int empHrs = 0, empWage = 0, totalEmpWage = 0; numWorkingDays = 0;
        for (int day = 0; day < numWorkingDays; day++) {
            int empCheck = (int) Math.floor(Math.random()) * 10 % 3;
            switch (empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

                    empWage = empHrs * empRatePerHr;
                    totalEmpWage += empWage;
                    s1.display(s1);
                    System.out.println("Total Emp Wage:" + totalEmpWage);
            }
        }
    }

}
