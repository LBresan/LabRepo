package p1;

public class Name {
    
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Name(String first, String middle, String last){
        
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    public String getFirst(){
        
        return firstName;
    }
    
    public String getMiddle(){
        
        return middleName;
    }
    
    public String getLast(){
        
        return lastName;
    }
    
    public String firstMiddleLast(){
        
        return(firstName + " " + middleName + " " + lastName);
    }
    
    public String lastFirstMiddle(){
        
        return(lastName + ", " + firstName + " " + middleName);
    }

    public boolean equals(Name otherName){
                
        String thisName = firstMiddleLast();
        boolean compare = thisName.equalsIgnoreCase(otherName.firstMiddleLast());
        return compare;
    }
    
    public String initials(){
        
        String firstInitial = firstName.substring(0, 1);
        String middleInitial = middleName.substring(0, 1);
        String lastInitial = lastName.substring(0, 1);
        return(firstInitial.toUpperCase() + middleInitial.toUpperCase()
                + lastInitial.toUpperCase());
    }
    
    public int length(){
        
        String nameLength = firstMiddleLast().replaceAll("\\s", "");
        int length = nameLength.length();
        return length;
    }
}
