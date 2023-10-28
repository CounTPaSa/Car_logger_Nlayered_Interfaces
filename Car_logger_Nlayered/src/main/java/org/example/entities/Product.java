package org.example.entities;

public class Product
{
    private int id;
    private String name;
    private  double price;

    private String license_plate;

    public Product()
    {

    }

    public Product(int id, String name, double price, String license_plate)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.license_plate = license_plate;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getLicense_plate(String license_plate)
    {
        return license_plate ;
    }

    public void setLicense_plate(String license_plate)
    {
        this.license_plate = license_plate;
    }
}
