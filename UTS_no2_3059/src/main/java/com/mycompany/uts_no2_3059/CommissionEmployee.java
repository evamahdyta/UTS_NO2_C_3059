/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_3059;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059)
 */
    public class CommissionEmployee extends Employee{
    
    int komisi, totalPenjualan;
    
    public CommissionEmployee(String nama, int nip, int gaji, int komisi, int totalPenjualan){
        super(nama, nip);
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }
    
    public int hitungGaji(){
        gaji = gaji + (komisi * totalPenjualan);
        return gaji;
    }
    
    public void cetakCommision_Employee(){
        super.cetakEmployee();
        System.out.println("Komisi             : " + komisi);
        System.out.println("Total penjualan    : " + totalPenjualan);
        System.out.println("Total gaji         : " + hitungGaji());
    }
    
}
