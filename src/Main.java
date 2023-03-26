import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Car car=new Car(1,8989);
        CarData carData=new CarData(LocalDate.of(1800,2,1),"passat","4000$","black");

        HashMap<Car,CarData> hashMap=new HashMap<>();
        hashMap.put(car,carData);
        System.out.println(hashMap.entrySet());
    }
}