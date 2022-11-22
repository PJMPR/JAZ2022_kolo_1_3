package org.example.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product implements IHaveDescription{

    private long id;
    private String name;
    private LocalDate creationDate;
    private double price;

    public Product() {
    }

    public Product(long id, String name, LocalDate creationDate, double price) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "id: %d, title: %s, publication: %s, price: %f".formatted(id, name, creationDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")), price);
    }
}
