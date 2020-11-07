public class Author{
	
	private String Name;
	private String Email;
	private String Gender;
	

	public Author(String Name, String Email, String Gender) {
		setName(Name);
		setEmail(Email);
		setGender(Gender);
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
}