package edu.kh.poly.ex1.model.vo;

public class Truck extends Car {
	
	private double weight; // 적재량
	
	public Truck() {
		// super(); super() 생성자 미작성 시 컴파일러가 추가
	}

	public Truck(int wheel, int seat, String fuel, double weight) {
		super(wheel, seat, fuel);
		this.weight = weight;
	}
	
	public void loading() {
		System.out.println("물건을 실을 수 있다.");
	}

	@Override
	public String toString() {
		return super.toString() + " / 적재중량 " + weight; 
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
