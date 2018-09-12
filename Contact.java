
public class Contact
{
		private String name;
		private String phoneNumber;

		//NOTE: This is private Constructor and java internally does this we r using it with the help of factory methods
		private Contact(String name,String phoneNumber){
			this.name = name;
			this.phoneNumber = phoneNumber;
		}	

		//Getters
		public String getName(){
			return this.name;
		}
		public String getPhoneNumber(){
			return this.phoneNumber;
		}



		//Factory Method 
		public static Contact createContact(String name,String phoneNumber){
			return new Contact(name,phoneNumber);				//this makes the COntact obj and returns it
		}
}