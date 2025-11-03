class StudentToString{
    String name;
    int age;
    String rollNumber;
    String House;
    
    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.House = house;
    }
    
    @Override
    public String toString(){
        return "Student Details:{name:"+ name 
                +", age:"+ age 
                +", rollNumber:"+ rollNumber 
                +", House: "+ House +" }";
    }
    
    public static void main(String[] args) {
        StudentToString student1 = new StudentToString("John Doe", 16, "A101", "Gryffindor");
        System.out.println(student1);
    }
    
}