/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exaikhtar1;
//EXA IKHTAR ALDIANSYAH
//227064516032
class Book {
    private String title;
    private String author;
    private String price;
    private String isbn;
    private String year;

    // Getter
    public String getTitle() {
        return title;}
    public String getAuthor() {
        return author;}
    public String getPrice() {
        return price; }
    public String getIsbn() {
        return isbn;}
    public String getYear() {
        return year;}
    // Setter
    public void setTitle(String title) {
        this.title = title;}

    public void setAuthor(String author) {
        this.author = author;}
    public void setPrice(String price) {
        this.price = price;}
    public void setIsbn(String isbn) {
        this.isbn = isbn;}
    public void setYear(String year) {
        this.year = year;
    }
}
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("les matematika");
        book1.setAuthor("Exa");
        book1.setPrice("Rp.250.000");
        book1.setIsbn("923-227064516032");
        book1.setYear("2020");

        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("ISBN: " + book1.getIsbn());
        System.out.println("Year: " + book1.getYear());

        book1.setPrice("Rp.300.000");
        System.out.println("Updated Price: " + book1.getPrice());
}
}