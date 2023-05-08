
public class Course
{
    private String name;
    private String number;
    private String section;
    private int creditHours;

    /**
     A no-arg constructor
     */
    public Course()
    {
        name = "Default";
        number = "DEF-100";
        section = "H100";
        creditHours = 0;
    }

    /**
     A constructor that accepts arguments for each field
     @param name The name of the Course 
     @param number The course number
     @param section The section number
     @param creditHours The number of credit hours for the Course
     */
    public Course(String name, String number, String section, int creditHours)
    {
        this.name = name;
        this.number = number;
        this.section = section;
        this.creditHours = creditHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    
    
        
   /**
      A Copy Constructor
      @param obj The Course object to make a copy of
   */
   public Course(Course obj)
   {
      this.name = obj.name;
      this.number = obj.number;
      this.section = obj.section;
      this.creditHours = obj.creditHours;
   }
   
   /**
      Compares two Course objects for equality, based off of their Course numbers
      @param c - a Course object to compare for equality
      @return true if the objects have the same Course Number, false otherwise
   */
   public boolean equals(Course c)
   {
      //we conside course objects to be equal if their number is the same 
      //use the equals() method of the String class to compare the numbers
      return this.number.equals(c.getNumber());
      
   }
   
   /**
      @return a String representation of the object 
   */
   public String toString() 
   {
        return "Course{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", section='" + section + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }

}
