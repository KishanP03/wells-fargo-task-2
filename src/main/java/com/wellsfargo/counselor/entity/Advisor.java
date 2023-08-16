package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long Client_Id;

    @ManyToOne
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone_no;

    protected Client() {

    }
    public Client(String firstName, String lastName, String address, String phone_no, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone_no = phone_no;
        this.email = email;
    }

    public Long getClient_Id() {
        return Client_Id;
    }

    public Advisor getadvisor(){
        return advisor;
    }

    public void setAdvisor(Advisor advisor){
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone_no;
    }

    public void setPhone(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
@Entity
public class Portfolio{

    @Id
    @GeneratedValue()
    private long portfolio_Id;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creation_date;

    @Column(nullable = false)
    private String type_of_asset;

    @Column(nullable = false)
    private long value;

    protected Portfolio() {

    }
    public Portfolio(String creation_date, String type_of_asset, long value) {
        this.creation_date = creation_date;
        this.type_of_asset = type_of_asset;
        this.value = value;
    }

    public Long getportfolio_Id() {
        return portfolio_Id;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public String getcreation_date() {
        return creation_date;
    }

    public void setcreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String gettype_of_asset() {
        return type_of_asset;
    }

    public void settype_of_asset(String type_of_asset) {
        this.type_of_asset = type_of_asset;
    }

    public long getvalue() {
        return value;
    }

    public void setvalue(long value) {
        this.value = value;
    }
}
@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long Security_Id;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchase_date;

    @Column(nullable = false)
    private long purchase_price;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }
    public Security(String Name, String category, String purchase_date, long purchase_price, int quantity) {
        this.Name = Name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
    }

    public Long getsecurity_Id() {
        return Security_Id;
    }

    public Portfolio getportfolio(){
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getpurchase_date() {
        return purchase_date;
    }

    public void setpurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public long getpurchase_price() {
        return purchase_price;
    }

    public void setpurchase_price(long purchase_price) {
        this.purchase_price = purchase_price;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquatity(int quantity) {
        this.quantity = quantity;
    }
}
