public class Car {
	public String make;
	public int year;
//top of this line is class
/* ----------------------------------------------------------------- */
//lower side of this line is object

Car () {
	make = "Unknown";
	year = 2015;
	}  //this is the list of cars

Car (String thisMake) {
	this();
	make = thisMake;
	}  // the String allows ThisMake to connect with make

Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear;
	}  // having int allows this to put the year in the data

public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
