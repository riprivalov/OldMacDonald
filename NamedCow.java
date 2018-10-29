class NamedCow extends Cow
{
	protected String myName;
	public NamedCow(String nametype, String namesound, String namename){
		myType = nametype;         
        mySound = namesound;
        myName = namename;
	} 
	public NamedCow()     {         
         myType = "unknown";         
         mySound = "unknown";   
         myName = "unknown";  
     }      
     public String getName() {
     	return myName;
     }
}