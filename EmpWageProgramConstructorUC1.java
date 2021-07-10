package com.company;
public class EmpWageComputationProgramConstructorUC1 {
    int isFullTime;
    double empCheck;

    public EmpWageComputationProgramConstructorUC1() {
    }
//constructor public


    public EmpWageComputationProgramConstructorUC1(int i, double s) {
        this.isFullTime = i;   //variable should be in small letter
        this.empCheck = s;
        //use this keyword for current object in constructor
    }

    void display( EmpWageComputationProgramConstructorUC1 object) {
        System.out.println(object.isFullTime + " " + object.empCheck);
        System.out.println("employee are present");
    }
    //here we created object to call a value it is a method

    public static void main(String[] args) {
        EmpWageComputationProgramConstructorUC1 s1 = new EmpWageComputationProgramConstructorUC1(1, Math.floor(Math.random() * 10) % 2);
//new value; s1 is a object

        // double empCheck = Math.floor(Math.random() * 10) % 2;
        if (s1.isFullTime == s1.empCheck)
            s1.display(s1);           //to give output
        else
            System.out.println("employee are not present");
    }
}
