package assesment3;
import java.util.*;
public class Stock {
 private int sid;
 private float price;
 private String item;
 private int quantity;
public Stock(int id,String items, float price, int quantity) {
	this.sid = sid;
	this.quantity = quantity;
	this.item = items;
	this.price = price;
}

public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public int getId() {
	return sid;
}
public void setId(int sid) {
	this.sid = sid;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getItems() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}

}