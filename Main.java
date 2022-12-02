class Main {
  public static void main(String[] args) {
    Car myMini = new Car(25, 600, 20, 20);
    System.out.println("gas: " + myMini.getGasInTank());
    System.out.println("milage: " + myMini.getMileage());
    
    System.out.println("\nattempting to drive 100 miles");
    myMini.drive(100);
    System.out.println("gas: " + myMini.getGasInTank());
    System.out.println("milage: " + myMini.getMileage());

    System.out.println("\nattempting to get gas");
    myMini.getGas();
    System.out.println("gas: " + myMini.getGasInTank());
    System.out.println("milage: " + myMini.getMileage());

    System.out.println("\nattempting to drive 0 miles");
    myMini.drive(0);
    System.out.println("gas: " + myMini.getGasInTank());
    System.out.println("milage: " + myMini.getMileage());

    System.out.println("\nattempting to drive 1000 miles");
    myMini.drive(1000);
    System.out.println("gas: " + myMini.getGasInTank());
    System.out.println("milage: " + myMini.getMileage());

    System.out.println("\nattempting to get gas");
    myMini.getGas();
    System.out.println("gas: " + myMini.getGasInTank());
    System.out.println("milage: " + myMini.getMileage());
    
  }
}