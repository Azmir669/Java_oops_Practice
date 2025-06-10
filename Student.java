class Student{
    private String name="azmir";
    public void introduce(Student s){
        System.out.println("Hello, my name is "+s.name);
    }
    public void sayHello(){
        introduce(this);
    }
    public static void main(String[] args){
        Student s= new Student();
        s.sayHello();

    }
}