package org.example.dataAccess;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao
{
    public void add(Product product)
    //Sadece DataBase erisim kodlari yazilir -> SQL bilmek gerekir
    {
        System.out.println("Arac bilgisi veri tabanina eklendi (HiberNate)");
    }
}
