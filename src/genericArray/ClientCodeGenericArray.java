package genericArray;

public class ClientCodeGenericArray {
	public static void main(String[] args) {
		
		System.out.println("First, we will initialize an array of numbers.");
		
		int arraySize = 3;
		
		GenericArray myArray = new GenericArray(3);
		
		int num1 = 33;
		int num2 = 39;
		int num3 = 47;
		
		myArray.set(0, num1);
		myArray.set(1, num2);
		myArray.set(2, num3);
		
		System.out.println("Here are the values stored in the "
				+ "generic array: " + myArray.get(0) + ", " + myArray.get(1) + ", " + myArray.get(2));
		
		System.out.println("The size of the array is: " + myArray.size());
		
		System.out.println("Now we will change all of the values.");
		
		int num4 = 64;
		int num5 = 90;
		int num6 = 21;
		
		myArray.set(0, num4);
		myArray.set(1, num5);
		myArray.set(2, num6);
		
		System.out.println("These are the changed values: " 
		+ myArray.get(0) + ", " + myArray.get(1) + ", " + myArray.get(2));
		
		System.out.println("We will check if the array is empty. Checking...");
		
		if (myArray.isEmpty())
			System.out.println("Array is empty.");
		else
			System.out.println("Array is not empty.");
		
		
		System.out.println("Now, we will initialize an array of strings.");
		
		int strArraySize = 4;
		
		GenericArray myStrArray = new GenericArray(4);
		
		String str1 = "Mauve", str2 = "Lavander", str3 = "Dusky Purple", str4 = "Indigo";
		
		myStrArray.set(0, str1);
		myStrArray.set(1, str2);
		myStrArray.set(2, str3);
		myStrArray.set(3, str4);
		
		
		System.out.println("Here are the values stored in the "
				+ "generic array: " + myStrArray.get(0) + ", " + myStrArray.get(1) 
				+ ", " + myStrArray.get(2) + ", " + myStrArray.get(3));
		
		System.out.println("The size of the array is: " + myStrArray.size());
		
		String str5 = "Ivy", str6 = "Caulk", str7 = "Beige", str8 = "Leaf Green";
		
		myStrArray.set(0, str5);
		myStrArray.set(1, str6);
		myStrArray.set(2, str7);
		myStrArray.set(3, str8);
		
		System.out.println("These are the changed values: "  + myStrArray.get(0) + ", " + myStrArray.get(1) 
		+ ", " + myStrArray.get(2) + ", " + myStrArray.get(3));
		
		System.out.println("We will check if the array is empty. Checking...");
		
		if (myArray.isEmpty())
			System.out.println("Array is empty.");
		else
			System.out.println("Array is not empty.");
		
	}

}
