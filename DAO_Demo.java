import java.sql.*;
import java.util.*;

public class DAO_Demo {
	public static void main(String[] args) {
		try{
			DAO_Factory daoFactory = new DAO_Factory();

			daoFactory.activateConnection();
			passengerDAO pdao = daoFactory.getpassengerDAO();

			System.out.println("Press 1 to Book a Ticket , 2 to cancel the Ticket , 3 to search the Status of the Ticket");
			Scanner se = new Scanner(System.in);
			int anyNO = se.nextInt();
			if(anyNO == 1){
			    pdao.bookTicket();
			
			}
			else if(anyNO == 2){
				pdao.cancelTicket();
			}

			else if(anyNO == 3){
				pdao.searchTicket();
			}


			
			

			daoFactory.deactivateConnection();
		}catch(Exception e){
				
				e.printStackTrace();
		}
	}
}
