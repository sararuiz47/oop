/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.facturacion;

import java.util.Scanner;

/**
 * @author Valentina
 */
public class Facturacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       
        System.out.println("=== REGISTRO DE CLIENTE ===");
        System.out.print("Ingrese identificación: ");
        String id = entrada.nextLine();
        System.out.print("Ingrese nombre completo: ");
        String nombre = entrada.nextLine();

        Client cliente = new Client(id, nombre);

        
        System.out.println("\n=== REGISTRO DE FACTURA ===");
        System.out.print("Ingrese número de factura: ");
        String numFactura = entrada.nextLine();
        System.out.print("Ingrese valor total de la factura: $");
        double valorTotal = Double.parseDouble(entrada.nextLine());

        Invoice factura = new Invoice(numFactura, valorTotal, cliente);

        
        System.out.println("\n=== RESUMEN DE FACTURA ===");
        System.out.println("Número de factura: " + factura.getInvoiceNumber());
        System.out.println("Cliente: " + factura.getClient().getFullName());
        System.out.printf("Valor total: $%.2f%n", factura.getTotal());

        entrada.close();
    }
}

