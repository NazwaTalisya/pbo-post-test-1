/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author ADMIN
 */
public class Salon {
    public String menuTreatment;
    public String namaPelanggan;
    public int harga;
    
    public Salon(String menuTreatment, String namaPelanggan, int harga){
        this.menuTreatment = menuTreatment;
        this.namaPelanggan = namaPelanggan;
        this.harga = harga;
        }

    public String getmenuTreatment(){
        return menuTreatment;
        }

    public String getnamaPelanggan (){
        return namaPelanggan;
    }
    
    public int getHarga (){
        return harga;
        }

    }
