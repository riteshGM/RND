package com.appname.impprogs;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int largest = 0;
        int secondLargest = 0;
        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i]; //100
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];//14
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
	}

}
