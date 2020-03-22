package Clase;
import java.util.*;


public class Adress {
	String street;
    String city;
    int number;

public Adress(String street,String city,int number)
{
    this.street=street;
    this.city=city;
    this.number=number;
}


@Override
public String toString()
{
    return "Adress{" + "street=" + street + ", city=" + city + ", number=" + number + '}';
}

public String getstreet() {
    return "Street: "+ street;
}

public void setstreet(String street) {
    this.street = street;
}

public String getcity() {
    return "City:" +city;
}

public void setcity(String city) {
    this.city = city;
}

public String getnumber() {
    return "Number:"+number;
}

public void setnumber(int number) {
    this.number = number;
}

public String getFullAdress() {
    return "Street:"+street+" , City:"+city+" ,  Number:"+number;
}

public void setFullAdresst(String FullAdress) {
    this.street = street;
    this.number = number;
    this.city=city;
}


}
