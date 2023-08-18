package Challenge07;

public class TireEx {
  public static void main(String[] args) {
    SnowTire snowTire = new SnowTire();
    Tire tire = snowTire;
    snowTire.run();
    tire.run();
  }
}
