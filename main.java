/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {

public static int a1;
public static int a2;
public static int a3;
public static int a4;

public static Scanner input=new Scanner(System.in);
public static void main(String[] args) {
        start();
    }
    static void start(){
        System.out.print("Masukkan Oktat 1 : ");
        a1=input.nextInt();
        System.out.print("Masukkan Oktat 2 : ");
        a2=input.nextInt();
        System.out.print("Masukkan Oktat 3 : ");
        a3=input.nextInt();
        System.out.print("Masukkan Oktat 4 : ");
        a4=input.nextInt();
        System.out.println("-----------------------------");
        System.out.println("IP Address  : "+a1+"."+a2+"."+a3+"."+a4);
        if(a1>0&&a1<128){
            System.out.println("Class   : A");
        }else if(a1>127&&a1<192){
            System.out.println("Class   : B");
        }else if(a1>191&&a1<224){
            System.out.println("Class   : C");
        }else{
            System.out.println("Class   : Maaf Nilai Oktat 1 yang anda masukkan tidak falid!");
        }
        System.out.println("Net Id  : "+a1+"."+a2+"."+a3+"."+0);
        System.out.println("Host Id :"+(a4-1));
    }
}