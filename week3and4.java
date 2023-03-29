package loop;

//import java.lang.reflect.Array;

public class week3and4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[8];

ages[0]=3;
ages[1]=9;
ages[2]=23;
ages[3]=64;
ages[4]=2;
ages[5]=8;
ages[6]=28;
ages[7]=93;
//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
ages[0]=ages[ages.length-1];
for(int age :ages) {
	System.out.println(age);
}
;
//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).

ages[1]=35;
for(int age :ages) {
	System.out.println(age);
}
;

//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
double average;
int sum=0;
for(int age: ages) {
	sum+=age;
}
average=sum/ages.length;
System.out.println("The average is :"+ average);


//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
String[] names = new String[6];

names[0]="Sam" ;
names[1]= "Tommy";
names[2]= "Tim";
names[3]= "Sally";
names[4]= "Buck";
names[5]= "Bob";
//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
int sumOfLetter=0;
for(String name:names) {
	sumOfLetter +=name.length()
;}
System.out.println("the average number of letters per name is :"+ sumOfLetter/names.length);

//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
String concataineWord="";
for (String name:names) {
	concataineWord +=" "+ name;
}
System.out.println(concataineWord);

//	3.	How do you access the last element of any array?
// By : arrayName[arrayName.length-1];


//	4.	How do you access the first element of any array?

// By : arrayName[0];
//	5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
int[]nameLengths = new int[6];
for(int i=0; i<names.length; i++) {
	nameLengths[i]=names[i].length();
}
//	6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
int sumNameLength=0;
for(int nameLength:nameLengths) {
	sumNameLength+=nameLength;
}
System.out.println("The Sum is :"+ sumNameLength);

System.out.println(multiplyString("Hello",3));
System.out.println(fullName("jires", "Chamfort"));
System.out.println(sumTrue(ages));
multiplicationTableOF(5);
	}
//	7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
public static String multiplyString (String word, int num) {
	String resultWord ="";
	if(num>1) {
		for(int i=1; i<=num; i++) {
			resultWord+=word;
		}
	}
	
	return resultWord;
}
//	8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
public static String fullName (String firstNAme ,String lastName) {
	//String fullName= firstNAme+lastName;
	return (firstNAme+ " "+lastName);
}

//	9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
private static boolean sumTrue(int myArray[]) {
	boolean isgreater;
	int sum=0;
	for(int num:myArray) {
		sum+=num;
	}
	if (sum>100) {
		isgreater=true;
	}else {
		isgreater=false;
	}
	
	return isgreater;
}

//	10.	Write a method that takes an array of double and returns the average of all the elements in the array.
public static double averageArray(double myArray[]) {
	double sum=0;
	double average;
	for(double num : myArray) {
		sum+=num;
	}
	average=sum/myArray.length;
	return average;
}
//	11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
public static boolean averageOfarrays(double myArray1[], double myArray2[]) {
	//boolean isgreater;
	double sum1=0;
	double sum2=0;
	for(double num1:myArray1) {
		sum1+=num1;
	}
	for (double num:myArray2) {
		sum2+=num;
	}

	return ((sum1/myArray1.length)==(sum2/myArray2.length));
}
//	12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink (boolean isHotOutside ,double moneyInPocket) {
		if (isHotOutside && moneyInPocket>10.50) {
			return true;
		}else {		
		return false;
		}
	}
//	13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	//this methode write the multiplacation table of a given number 
	//I wrote it to help my kid to learn his mathematic lesson 
	public static void  multiplicationTableOF(int num ) {
		System.out.println("The Multiplication Table of :"+num);
		for (int i=1 ; i<+12;i++) {
			System.out.println(i+ "x "+ num +" = "+i*num);
		}
	}
		
	}

