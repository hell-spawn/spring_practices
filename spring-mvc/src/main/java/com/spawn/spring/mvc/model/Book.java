package com.spawn.spring.mvc.model;

import com.spawn.spring.mvc.utils.validations.ISBNValidator;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;

public class Book {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    @ISBNValidator( value = "ISBN-", message = "must start with ISBN-")
    private String isbn;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String author;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String title;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String language;
    private String payMethod;
    private String[] typeEdition;
    @NotNull(message = "is required")
    private Integer quantity;

    private HashMap<String, String> languages;
    private HashMap<String, String> payMethods;
    private HashMap<String, String> editions;

    public Book(){
        this.languages = new HashMap<>();
        this.languages.put("es", "Spanish");
        this.languages.put("en", "English");
        this.languages.put("fr", "French");

        this.payMethods = new HashMap<>();
        this.payMethods.put("cash", "Cash");
        this.payMethods.put("credit_card", "Credit Card");
        this.payMethods.put("paypal", "PayPal");

        this.editions = new HashMap<>();
        this.editions.put("pocket_edition", "Pocket Edition");
        this.editions.put("collectors_edition", "Collector's Edition");
        this.editions.put("standard_edition", "Standard Edition");
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String[] getTypeEdition() {
        return typeEdition;
    }

    public void setTypeEdition(String[] typeEdition) {
        this.typeEdition = typeEdition;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public HashMap<String, String> getLanguages() {
        return languages;
    }

    public HashMap<String, String> getPayMethods() {
        return payMethods;
    }

    public HashMap<String, String> getEditions() {
        return editions;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
