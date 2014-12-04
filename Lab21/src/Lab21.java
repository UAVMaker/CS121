
public class Lab21 {

	public static void main(String[] args){
		
	//	primes= new int[5];
		int[] primes = {1,2,3,5,7};
		
//		for(int i =0; i < primes.length; i++){
//			
//			System.out.println(primes[i]);
//		}
		
		Dog[] dogs = new Dog[4];
		dogs[0] = new Dog("Lily", 5);
		dogs[1] = new Dog("Jason",2);
		dogs[2] = new Dog("Sugar",8);
		dogs[3] = new Dog("Bush",3);
		
		for(int i =0; i< dogs.length;i++){
			System.out.println(dogs[i].toString());
			
		}
		
	}
}
