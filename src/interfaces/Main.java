package interfaces;

public class Main {

	public static void main(String[] args) {
			
			Logger[] loggers = {
				new SmsLogger(), new FileLogger()
			};
		
		
			CustomerManager customerManager = new CustomerManager(loggers);
			
			Customer musteri = new Customer(1,"Musteri1", "Soyad");
			
			customerManager.add(musteri);
	}

}
