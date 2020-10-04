/*#**********************************************************************************************************#
#Level 1: 15 Marks
#Question2:
#	Complete the incomplete functions in the ArrayList(Dynamic array API) class. There are 5 incomplete 
#	functions inside the class which are:
#	1) add() - which takes a generic variable as a parameter and adds the element to the dynamic array. 
#			   Insert elements into a dynamic array which doubles in size when the array is 3/4th full 
#			   and halves in size when the array is 1/4th full
#	2) pop() - this function does not take a parameter.When called pop deletes the last element in the dynamic array.
#	3) resize() - this function takes one integer parameter. When called resize changes the size of the array
#				to the value of the parameter sent.
#	4) size() - Does not take any parameter and returns the number of elements present in the dynamic array.
#	5) toString() - Does not take any parameter and returns the string representation of the dynamic array.
#**********************************************************************************************************#*/
//@SuppressWarnings("unchecked")
public class array
{
	double value = 0.25;
	double value1 = 0.75;
	int arraysize = 4;
	static int k;
	int remove;
	int head = 0;
	static double length;
	static int Array[];
	public array()
	{
		Array = new int[arraysize];
	}
	public void add(int b)
	{
		Array[head] = b;
		head++;
	}
	public void pop()
	{
		head--;
		remove = Array[head];
		Array[head] = 0;
		int count = 0;
		for(int i = 0; i < Array[i]; i++) 
		{
			count++;
		}
		k = count;
		length = (double)k/arraysize;
		System.out.println("value remove is: " +remove);
	}
	
	public void resize()
	{
		if(length == value ) {
			int newArray[] = new int[(arraysize/2)*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			Array = newArray;
			arraysize = arraysize/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == value1) {
			int newArray[] = new int[arraysize*2];
			for(int i = 0; i < Array.length; i++) {
				newArray[i] = Array[i];
			}
			arraysize = arraysize * 2;
			Array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("coding errors");
		}
	}
	    public int size()
	    {
		  return arraysize;
	    }
	    public String toString()
	    {
		   String k = Integer.toString(arraysize);
		   return k;
	    }
/*#*************************************************************************************************************#
#*		DO NOT WRITE/MODIFY CODE BELOW THIS LINE. ANY CHANGES MAY CAUSE YOUR HIDDEN TEST CASES TO FAIL 		*#
#*				YOU MAY USE THE SPACE PROVIDED ABOVE TO WRITE YOUR PROGRAM. ALL THE BEST!					*#
#*************************************************************************************************************#*/
	public static void main(String[] args) 
	{
		array obj = new array();
		obj.add(6);
		obj.add(7);
		obj.add(3);
		obj.add(2);
		obj.pop();
		obj.resize();
		System.out.println("The value of toString is: " +obj.toString());
		System.out.println("The number of value in new array is: " +k);
		System.out.println("The Size of new array is: " +obj.size());
	}
}