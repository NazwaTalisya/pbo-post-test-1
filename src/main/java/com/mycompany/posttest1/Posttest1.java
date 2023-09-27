/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Posttest1 {
    public static void main(String[] args) {
        Salon pelanggan1 = new
    Salon("'Creambath'", "'Nazwa'",50000);
        Salon pelanggan2 = new
    Salon("'Potong Rambut'","'Adel'",80000);
        Salon pelanggan3 = new
    Salon("'Hair Color'", "'Nabila'",150000);
        Salon pelanggan4 = new
    Salon("'Nailart'","'Alin'",65000);
        Salon pelanggan5 = new
    Salon("'Pedicure'", "'Allya'",70000);
        
    ArrayList<Salon> buyers = new ArrayList<>();
    buyers.add(pelanggan1);
    buyers.add(pelanggan2);
    buyers.add(pelanggan3);
    buyers.add(pelanggan4);
    buyers.add(pelanggan5);
        
    for (Salon dataPelanggan : buyers) {System.out.println
        ("Menu Treatment: "+dataPelanggan.menuTreatment+"|"+"Nama Pelanggan:"
                           +dataPelanggan.namaPelanggan+"|"+"Harga"
                           +dataPelanggan.harga);
            }
        }
    }

