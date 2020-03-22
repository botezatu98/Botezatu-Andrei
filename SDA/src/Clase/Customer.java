package Clase;
import java.util.*;
public class Customer  {
	


		 String FirstName;
		    String LastName;
		    int age;
		    Adress adress;
		    PaymentMethod payment;
		    private Adress adress()
			{
		    	;
		    	 return adress;   
				
				
			}
	    
	    public Customer(String FirstName,String LastName,int age)
	    {
	        this.FirstName=FirstName;
	        this.LastName=LastName;
	        this.age=age;
	    }
	    
	    public Customer(String FirstName,String LastName,int age,Adress adress,PaymentMethod payment)
	    {
	        this.FirstName=FirstName;
	        this.LastName=LastName;
	        this.age=age;
	        this.adress=adress;
	        this.payment=payment;
	    }


		@Override
	    public String toString()
	    {
	        return "Customer{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age +" , "+
	        		 adress+" , "+payment;
	    }

	    public String getFirstName() {
	        return FirstName;
	    }

	    public void setFirstName(String FirstName) {
	        this.FirstName = FirstName;
	    }

	    public String getLastName() {
	        return LastName;
	    }

	    public void setLastName(String LastName) {
	        this.LastName = LastName;
	    }

	    public int getage() {
	        return age;
	    }

	    public void setage(int age) {
	        this.age = age;
	    }
	    
	  
	    public String getCompleteName()
	    {
	        return "FirstName: "+FirstName+" ,  LastName:"+LastName;
	        
	    }

	    public void setCompleteName(String FirstName,String LastName)
	    {
	        this.FirstName = FirstName;
	        this.LastName=LastName;
	    }

	    public PaymentMethod getPaymentMethod()
	    {
	        return payment;
	    }
	    public void setPaymentMethod(PaymentMethod payment) 
	    {
	        this.payment=payment;
	    }
	    
	   // getAdress().
	    public String getAdres()
	    {
	        return adress.street+ " "+adress.city+ " "+adress.number;
	        
	    }

	    public Adress getAdress()
	    {
	        return adress;
	        
	    }
	
	   



	}


