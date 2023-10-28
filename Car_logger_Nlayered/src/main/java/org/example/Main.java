package org.example;

import org.example.Core.Logging.DataBaseLogger;
import org.example.Core.Logging.FileLogger;
import org.example.Core.Logging.Logger;
import org.example.Core.Logging.MailLogger;
import org.example.business.ProductManager;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product car1 = new Product(1, "Opel Astra 2001", 300000, "34 BSS 0124");
        Product car2 = new Product(2, "Skoda Octavia 2015 DSG", 850000, "06 BAK 604");
        Product car3 = new Product(3, "Peugeot Partner Origin 2012", 500000, "34 LSA 0956");
        Product car4 = new Product(4, "Tesla Model Y", 2500000, "16 AAL 0576");
        Product car5 = new Product(5, "Alfa Romeo 2014", 750000, "34 SJ 4212");
        Product car6 = new Product(6, "BMW 5.20", 3000000, "55 SSL 0096");
        Product car7 = new Product(7, "Peugeot 3008", 1750000, "01 NLK 0899");
        Product car8 = new Product(8, "Mercedes C200", 4500000, "06 AC 0011");
        Product car9 = new Product(9, "Hyundai ix35", 750000, "45 AJK 553");
        Product car10 = new Product(10, "Fiat Fiorino", 500000, "34 LA 06");
        Product car11 = new Product(11, "Wolksvagen Passat", 950000, "61 AZ 044");


        Logger[] loggers = {new DataBaseLogger(),new FileLogger(), new MailLogger()};

        ProductManager productManager1 = new ProductManager(new JdbcProductDao(), loggers);
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager1.add(car1);
        productManager1.add(car2);
        productManager1.add(car3);
        productManager1.add(car4);
        productManager1.add(car5);
        productManager1.add(car6);
        productManager1.add(car7);
        productManager1.add(car8);
        productManager1.add(car9);
        productManager1.add(car10);
        productManager1.add(car11);

    }
}