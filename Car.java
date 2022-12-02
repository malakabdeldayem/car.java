public class Car{
	
  private double mpg;
  private double mileage;
  public double tankCapacity;
  private double gasInTank;

  /**
    Constructs a car.
    @param miles miles per gallon that car gets
    @param milesOnCar total mileage on car
    @param gasTankHolds amount of gas the tank holds
    @param gasTankHas gas in tank now
  */

  public Car (double miles, double milesOnCar, double gasTankHolds, double gasTankHas){
    mpg = miles;
    mileage = milesOnCar;
    tankCapacity = gasTankHolds;
    gasInTank = gasTankHas;
  }

  /**
    Returns the gas needed to drive miles (based on mpg).
    @param numMiles the number of miles to be driven
    @return gas needed to drive numMiles miles
  */
  public double gasNeeded (double numMiles){
    // TODO: Part A
    double needed = numMiles/20.0*20.0;
    return needed;
  }

  /**
    Returns true if the car has enough gas in the tank to drive numMiles miles, otherwise returns false.
    @param numMiles miles t obe driven
    @return true if gas in tank is enough to drive numMiles miles; false otherwise
  */
  public boolean enoughGas (double numMiles){
    // TODO: Part B
    double needed = numMiles/20.0*20.0;
    if(needed>=gasInTank){
      return true;
    } else {
      return false;
    }
  }


  /**
    If tank is less than half full, fills tank and updates gasInTank, otherwise does nothing.
  */
  public void getGas(){
    // TODO: Part C
    double halfTank= tankCapacity/2.0;
    if(gasInTank < halfTank) {
      gasInTank = tankCapacity;
    }
  
    
  }
  
  public double getMpg() {
	return mpg;
}

public void setMpg(double mpg) {
	this.mpg = mpg;
}

public void setMileage(double mileage) {
	this.mileage = mileage;
}

public double getTankCapacity() {
	return tankCapacity;
}

public void setTankCapacity(double tankCapacity) {
	this.tankCapacity = tankCapacity;
}

public void setGasInTank(double gasInTank) {
	this.gasInTank = gasInTank;
}

/** 
    Updates mileage and gasInTank to reflect numMiles being driven.
    @param numMiles number of miles driven
  */
  public void drive (double numMiles){
    // TODO: Part D
    if(enoughGas(numMiles) == true){
      mileage += numMiles;
      gasInTank = gasInTank - gasNeeded(numMiles);
    } else {
      mileage += getGasInTank() * mpg;
      gasInTank = 0.0;
    }
  }

  /**
    Returns the current mileage on the car.
    @return mileage on car
  */
  public double getMileage()   {
    return mileage;
  }

  /**
    Returns the amount of gas in the gas tank.
    @return amount of gas in tank
  */
  public double getGasInTank()   {
    return gasInTank;
  }

}
