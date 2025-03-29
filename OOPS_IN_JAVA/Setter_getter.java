class person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("Age must be positive!");
        }
    }
    public int getAge(){
        return age;
    }

}

public class Setter_getter {
    public static void main(String args[]){
        person p=new person();
        p.setName("raj");
        p.setAge(25);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
