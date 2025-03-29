

 class CAR {
    String brand;
    int speed;
    void display(){
        System.out.println("brand: " +brand+ " speed: "+speed);
    }
    
}

 public class Main {
    public static void main(String[] args) {
        CAR myCar = new CAR(); // Creating an object
        myCar.brand = "Tesla";
        myCar.speed = 120;
        myCar.display();
    }
}

