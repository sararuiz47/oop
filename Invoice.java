/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facturacion;

/**
 *
 * @author Valentina
 */
public class Invoice {
   private String invoiceNumber;
    private double total;
    private Client client;

    
    public Invoice() {}

   
    public Invoice(String invoiceNumber, double total, Client client) {
        this.invoiceNumber = invoiceNumber;
        this.total = total;
        this.client = client;
    }

    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    } 
}
