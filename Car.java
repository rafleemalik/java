class Vehicle {
   String nomor_polisi;
}

public class Car extends Vehicle {
   public static void main(String args[]) {

      Vehicle a = new Car();
      a.nomor_polisi="B39393";
      boolean result =  a instanceof Car;
      System.out.println(result);
   }
}