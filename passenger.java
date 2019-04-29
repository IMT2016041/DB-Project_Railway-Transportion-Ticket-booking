import java.lang.*;

public class passenger{
	String name;
	String sex;
	int age;
	long phone_no;
	int ticket_no;
	passenger(String name,String sex,int age,long phone_no, int ticket_no){
 		this.name=name;
 		this.sex=sex;
 		this.age=age;
 		this.phone_no=phone_no;
 		this.ticket_no=ticket_no;
 	}
 	public passenger(){

 	}
	public String getname(){
		return name;
	}

	public void setname(){
		this.name=name;
	}

	public String getsex(){
		return sex;
	}

	public void setsex(){
		this.sex=sex;
	}

	public int getage(){
		return age;
	}

	public void setage(){
		this.age=age;
	}

	public long getphone_no(){
		return phone_no;
	}

	public void setphone_no(){
		this.phone_no=phone_no;
	}
	public int getticket_no(){
		return ticket_no;
	}
	public void setticket_no(){
		this.ticket_no=ticket_no;
	}

}