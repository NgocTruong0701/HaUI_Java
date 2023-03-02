package Enum;

public class Exam_2_constructor {
	
	public enum DayofWeek{
		// Enum fields 
		Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7), Sunday(8);
		
		// internal state
		private int day;
		
		// Constructor
		private DayofWeek(final int day) {
			// TODO Auto-generated constructor stub
			this.day = day;
		}
		
		public int getDay() {
			return day;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayofWeek wednesday = DayofWeek.Wednesday;
		System.out.println(wednesday); // Wednesday
		System.out.println(wednesday.getDay()); // 4
		System.out.println(DayofWeek.Wednesday.getDay()); // 4
	}

}
