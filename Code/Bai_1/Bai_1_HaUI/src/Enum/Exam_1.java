package Enum;

public class Exam_1 {
	
	public enum DayofWeek{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayofWeek monday = DayofWeek.Monday;
		System.out.println("Thứ hai là: " + monday);
		
		DayofWeek.Wednesday.ordinal(); //2
		
		DayofWeek[] dayofweeks = DayofWeek.values();
		for(DayofWeek d : dayofweeks) {
			System.out.println("Các thứ trong 1 tuần là: " + d);
		}
		
		DayofWeek friday = DayofWeek.valueOf("Friday");
		System.out.println(friday);
	}

}
