import java.util.*;
import java.io.*;


public class Car {

	private String carName, carModel;
	private double carPrice;
	
	public Car() {
	
		carName = "";
		carModel = "";
		carPrice = 0;
	}
	
	public void setCar(String cT, String cM, double cP){
		
		carName = cT;
		carModel = cM;
		carPrice = cP;	
	}
	
	public String getCarName() {
		return carName;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public String getCar() {
		return getCarName() + "-" + getCarModel();
	}
		
	public double getCarPrice() {
		return carPrice;
	}
	

}