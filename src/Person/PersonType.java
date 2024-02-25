package Person;


/*Singleton */
public class PersonType {
	private String nameFirst, nameMiddle, nameLast = "Blank";
	
	public PersonType(String nFirst, String nMiddle, String nLast) {
		
		/*Constructors*/
		this.nameFirst = nFirst;
		this.nameMiddle = nMiddle;
		this.nameLast = nLast;
		
		
	}
	
/*getter*/
	
	public String getNfirst() {
		return nameFirst;
	}
	
	public String getNmiddle() {
		return nameMiddle;
	}
	
	public String getNlast() {
		return nameLast;
	}
	
	/*setter*/

	public void setFname(String first) {
		this.nameFirst = first;
		
	}
	
	public void setMname(String middle) {
		this.nameMiddle = middle;	
	}
	
	public void setLname(String last) {
		this.nameLast = last;	
	}

	public static PersonType getInstance(String nameFirst2, String nameMiddle2, String nameLast2) {
		return null;
	}

	
	
	
	
}
