package codesoft;
import java.util.Scanner;

public class studentgradecalucator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //give grade cutoffs
        final int a_min=90;
        final int b_min=80;
        final int c_min=70;
        final int d_min=55;
        final int e_min=40;
        //enter no.of subjects
        System.out.println("Enter number of subjects registered by student in this semester:");
        int noofsubjects=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=noofsubjects;i++){
            //enter marks for each subject
            System.out.println("Enter marks for Subject"+i+":");
            int marks=sc.nextInt();
            totalmarks+=marks;
        }
        //calucate perecentage
        double avgpercentage= (double) totalmarks/noofsubjects;

        //calucation of grade based on average percentage
        char grade;
        if(avgpercentage>= a_min){
            grade='A';
        } else if (avgpercentage>= b_min) {
            grade='B';
        } else if (avgpercentage>= c_min) {
            grade='C';
        } else if (avgpercentage>= d_min) {
            grade='D';
        } else if (avgpercentage>= e_min) {
            grade='E';
        }else{
            grade='F';
        }
        System.out.println("Total marks:"+totalmarks);
        System.out.println("Average pecentage:"+avgpercentage+"%");
        System.out.println("Grade:"+grade);


    }
}
