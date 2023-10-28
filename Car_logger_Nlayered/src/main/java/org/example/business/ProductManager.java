package org.example.business;

import org.example.Core.Logging.Logger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

import java.util.List;

public class ProductManager
{
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers)
    {
        this.productDao = productDao;
        this.loggers = loggers;
    }
    public void add(Product product) throws Exception {
        if (product.getId() > 10)
        {
            throw new Exception("Loglanacak arac sinirina ulasildi"); //hata durumunda program durur.
        }
        else if (product.getPrice() > 5000000)
        {
            throw new Exception("Araclarda tavan fiyat 5000000TL'dir");
        }
        else if (product.getPrice() < 200000)
        {
            throw new Exception("Araclarda taban fiyat 200000TL'dir");
        }
        productDao.add(product);
        for (Logger logger: loggers)//[db, mail, file]
        {
            logger.log(product.getName());
        }
    }
}
