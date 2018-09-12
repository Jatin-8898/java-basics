import java.util.ArrayList;
public class MobilePhone{
	private String myNumber;
	private ArrayList<Contact> myContacts;


	//public Constructor
	public MobilePhone(String myNumber){				//just intialiszing the number and ArrayList
		this.myNumber = myNumber;						
		this.myContacts = new ArrayList<Contact>();
	}

	public boolean addNewContact(Contact Contact){
		if(findContact(contact.getName()) >= 0){					//here 0 or greater than means already h //coz string returns -1 if not found 
			System.out.println("Contact is already on file");			//Usually we dont write sop here we only status ie true or false
			return false;
		}
		myContacts.add(contact);											//no need of else by default it is else
		return true;
	}	

	public boolean updateContact(Contact oldcontact,Contact newContact){
		int foundPosition = findContact(oldcontact);					//first check oldcontact eg Jatin is der or not
		if(foundPosition < 0){											//ie -1 means not found
			System.out.println(oldcontact.getName()+"was not found");
			return false;
		}												
		this.myContacts.set(foundPosition,newContact);	//set Method replaces the element at the specified position in the list with specified element
		System.out.println(oldContact.getName()+",was replaced with"+newContact.getName());
		return true;
	}


	public boolean removeContact()


}
