package mmmm;

import java.util.Scanner;

class Student {
    private String name; //student class의 name라는 변수를 보여주지 않겠다.
    private String dept; //student class의 dept라는 변수를 보여주지 않겠다.
    int year; //학년은 보여주겠다.

    private Student() {
        year = 1;
    }

    public Student(String name, String dept) {
        this();
        this.name = name;
        this.dept = dept;
    }
    public String getName() {
        return this.name;
    }
    public int getyear() {
        return this.year;
    }
    //public void viewStudent() {
        //System.out.println("이름>> "+ name + " 학과>> " + dept + " 학년>> " + year);
    //}
}

public class Sa {
    static Student[] stud; 
    public static void printStudentInfo(Student[] stud){
        for(Student temp: stud) {
            System.out.print("이름>> "+ temp.getName());
            System.out.println("학년>> "+ temp.getyear());
        }
    }
    public static void changeyear(Student[] stud) {
        for(Student temp: stud) {
            temp.year++;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수>> ");
        int su = Integer.parseInt(sc.nextLine());
        stud = new Student[su];
        for (int i = 0; i < su ; i++) {
            String tName, tDept;
            System.out.print("학생이름 >> ");
            tName = sc.nextLine();
            System.out.print("학생학과 >> ");
            tDept = sc.nextLine();
            stud[i] = new Student(tName,tDept);
        }
        printStudentInfo(stud);
        changeyear(stud);
    }
}