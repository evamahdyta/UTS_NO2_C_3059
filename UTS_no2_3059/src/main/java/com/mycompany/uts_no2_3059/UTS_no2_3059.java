/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_3059;

/**
 *
 * @author Eva Mahdyta Kiswana (21103059)
 */
public class UTS_no2_3059 {

    public static void main(String[] args) {

        SalariedEmployee S = new SalariedEmployee("Cinta", 21103059, 3000000);
        CommissionEmployee C = new CommissionEmployee("Andi", 21103059, 350000, 1000000, 20);
        ProjectPlanner P = new ProjectPlanner("Budi", 2130223, 4000000, 2000000, 120);
        
        System.out.println("== DATA PEGAWAI PERUSAHAAN ==");
        S.cetakSalariedEmployee();
        System.out.println("");
        C.cetakCommision_Employee();
        System.out.println("");
        P.cetakProjectPlanner();
        System.out.println("");
        
    }
}
