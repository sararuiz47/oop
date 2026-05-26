/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedirdatosdemanerainteractiva;

import java.util.Scanner;


/**
 *
 * @author Valentina
 */
public class PEDIRDATOSDEMANERAINTERACTIVA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner date=new Scanner(System.in);
       String firstname,lastname,email,password,phone_number,ident_number,birth_date;
       int age,i=0;
       boolean status;
       status=true;
       while(status){
       System.out.println("firstname:");
       firstname=date.nextLine();
       System.out.println("lastname:");
       lastname=date.nextLine();
       i+=1;
         while(status_res){
         System.out.println("do you wint to register user (Y/y/N/n):");
            res=data.nexfLine();
         if(res.equals("N")|| res.equals ("n"))
            status_res=false;
            status=false;
         if(res=="Y" || res "y")
            status_res=false
         if (res!="Y" || res!="N" || res!="n")
               System.out.println("invalid option try again [Y/y/N/n]");
 
            }//white status_res
          }
}//white status 
