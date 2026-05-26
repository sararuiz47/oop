/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcome_project;

   import java.util.Scanner;
/**
 *
 * @author Valentina
 */
public class Welcome_project {

    public static void main(String[] args) {
        
       Scanner date=new Scanner(System.in);
       String firstname,lastname,email,password,phone_number,ident_number,birth_date;
       int age,i=0;
       age=0;
       while(i<=10){
           System.out.println(i);
           i+=1;
         
       }
       int j=1;
       boolean status=true;
        while (status){
           System.out.println(j); 
           j+=1;
                   if(j>10)
                       status=false;
         intk=1;
         Status=true;
                 while(status){
                     System.out.println(k);
                     k+=1;
                     if(k>10)
                         break;
                 }
              
        }
        System.out.println("INGRESE SU NOMBRE ");firstname= date.nextLine();
        System.out.println("INGRESE SU APELLIDO ");lastname=date.nextLine();
        System.out.println("INGRESE SU CORREO");email=date.nextLine();
        System.out.println("INGRESE SU CONTRASEÑA  ");password=date.nextLine();
        System.out.println("INGRESE SU NUMERO DE CELULAR  ");phone_number=date.nextLine();
        System.out.println("INGRESE SU NUMERO DE IDENTIDAD ");ident_number=date.nextLine();
        System.out.println("INGRESE SU FECHA DE CUMPLEAÑOS ");birth_date =date.nextLine();
        System.out.println("INGRESE SU EDAD "); age =date.nextInt();
       
    }
}
