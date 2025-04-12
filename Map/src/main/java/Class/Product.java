package main.java.Class;

import java.util.Objects;

class Product implements Comparable<Product> {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Product)) return false;
        Product o = (Product) obj;
        return this.getId() == o.getId() && this.getName() == o.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return this.id + " " + this.name;
    }

    @Override
    public int compareTo(Product o) {
        int idCompare = Integer.compare(this.id, o.id);
        if(idCompare != 0) return idCompare;
        return this.name.compareTo(o.getName());
    }
}
