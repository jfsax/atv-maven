package br.com.maven_comercio.model;

public class Product {
    private Integer id;
    private String name;
    private Double unitPrice;
    private Integer quantity;

    public Product(Integer id, String name, Double unitPrice, Integer quantity) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "id=" + id + " / name = " + name + " / unit price = R$" + unitPrice + " / quantity = " + quantity;
    }
}
