/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facturacion;

/**
 *
 * @author Valentina
 */
public class Client {
    private String identification;
    private String fullName;

    
    public Client() {}

    
    public Client(String identification, String fullName) {
        this.identification = identification;
        this.fullName = fullName;
    }

    
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

