public class Test1 {
	public static void main (String[] args) {
		
	Dog[] pets;	
	pets = new Dog[5];
	pets[0] = new Dog();
	pets[1] = new Dog();
	pets[0].setSize(8);
	pets[1].setSize(90);
	pets[2] = pets[1];
	pets[1].setSize(8);
	System.out.println("Dog one:" +" "+ pets[0].getSize());
	System.out.println("Dog two:" +" "+ pets[1].getSize());
	System.out.println("Dog thr:" +" "+ pets[2].getSize());
	pets[0].bark();
	pets[1].bark();	
	pets[2].bark();	
		
	}	
	
}
class Dog{
	int size;
	int getSize(){
		return size;
	}
	void setSize(int s){
		size = s;
	}

	void bark(){
		if (size > 60){
			System.out.println("666");
		}else if (size > 20){
			System.out.println("555");
		}else{
			System.out.println("333");
	}
}
}