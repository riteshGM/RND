package com.appname.opps;

public class Inheritance extends C {
	
	
	
	public static void main (String args[]){
		MultiLevelChild grandchildObj = new MultiLevelChild();
		grandchildObj.getVariable();
		
		
		/*Point to note here - constructor if Child is called based on what we mentoin on right side
			Parent Class Constructor is not implicitly called.
		*/
		
		/*
		 * Preference is Given to Overidden method of the class where it is first down in hierarchy
		 */
		
		BaseParent grandchildObj2 = new MultiLevelChild();
		System.out.println(grandchildObj2.getCountry());
		/*
		 * Preference is Given to Overidden method of the class where it is first down in hierarchy
		 */
		BaseParent childObj1 = new ChildOfBaseParent();
		System.out.println(childObj1.getCountry());
	}
}