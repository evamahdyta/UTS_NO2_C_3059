/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_3059;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059)
 */
public class Employee {
   
    protected int nip, gaji;
    protected String nama;
    
    public Employee(String nama, int nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public int hitungGaji(){
        return gaji;
    }
    
    public void cetakEmployee(){
        System.out.println("Nama               : " + nama);
        System.out.println("NIP                : " + nip);
    }
    
}
