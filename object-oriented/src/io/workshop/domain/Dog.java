package io.workshop.domain;

public class Dog {
	
	//syntax for declaring attributes
	//<modifier>* type name [ = <initial_value> ];

	private int weight;
	
	public Dog() {
		weight = 42;
	}
	
	public Dog(int weight) {
		this.weight = weight;
	}
	
	//syntax declaring methods
	//<modifier>* <return-type> name(<argument> *){
	//<statement> *
	//}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			weight = newWeight;
		}
		
		
	}

	@Override
	public String toString() {
		return "Dog [weight=" + weight + "]";
	}
	

}
