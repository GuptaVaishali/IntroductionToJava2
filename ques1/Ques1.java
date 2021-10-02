package ques1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ques1 {
    public static void main(String[] args) {

    }
}

abstract class Book {
    private String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;
    private List<Author> authors;
}

class BookItem extends Book {
    private int bookId;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private boolean available;

    public BookItem(int bookId, Date borrowed, Date dueDate, double price, boolean available) {
        this.bookId = bookId;
        this.borrowed = borrowed;
        this.dueDate = dueDate;
        this.price = price;
        this.available = available;
    }

    void displayBookDetails(){}
}

class Person {
    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Author extends Person {
    List<Book> booksPublished;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class SystemUser extends Person {

    private String Email;
    private String phoneNumber;
    private Account account;

    public SystemUser(String email, String phoneNumber, Account account) {
        super();
        Email = email;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }
}

class Account {

    private String userName;
    private String password;
    private int accountId;

    public Account(String userName, String password, int accountId) {
        this.userName = userName;
        this.password = password;
        this.accountId = accountId;
    }
}

interface databaseOperation{
    ArrayList<Book> books = new ArrayList<Book>();
    void add(Book book);
    void delete(Book book);
    void display();
}

class Librarian extends SystemUser implements databaseOperation{
    private int librarianId;
    Transaction transaction;

    public Librarian(String email, String phoneNumber, Account account) {
        super(email, phoneNumber, account);
    }

    void issueBook(){}
    void returnBook(){}

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public void delete(Book book) {
        books.remove(book);
    }

    @Override
    public void display() {
        for(Book book:books)
           System.out.println(book);
    }
}

class Member extends SystemUser implements databaseOperation{
    int memberId;
    int maxBookLimit;
    Address address;
    Transaction transaction;

    public Member(String email, String phoneNumber, Account account) {
        super(email, phoneNumber, account);
    }

    void issueBook(){}
    void returnBook(){}

    @Override
    public void add(Book book) {
    }

    @Override
    public void delete(Book book) {
    }

    @Override
    public void display() {
    }
}

class Address{
    String city;
    String state;
    String country;
    int pincode;

    public Address(String city, String state, String country, int pincode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}

class Transaction{
    int transactionId;
    int memberId;
    int bookId;
    Date dateOfIssue;
    Date dueDate;

    public Transaction(int transactionId, int memberId, int bookId, Date dateOfIssue, Date dueDate) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.dateOfIssue = dateOfIssue;
        this.dueDate = dueDate;
    }

    void createTransaction(){}

    void deleteTransaction(){}
}

