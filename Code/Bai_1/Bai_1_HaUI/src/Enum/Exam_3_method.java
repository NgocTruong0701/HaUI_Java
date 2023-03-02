package Enum;

public class Exam_3_method {
	
	public enum DayofWeek_tuong_minh{
		// enum fields 
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
		
		protected String printDay() {
			String message = "Hom nay la thu: " + this;
			return message;
		}
	}
	
	public enum DayofWeek_truu_tuong{
		// Enum fields
		Monday{
			@Override
			public String printDay() {
				String message = "Hom la thu hai";
				return message;
			}
		};
		
		public abstract String printDay();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayofWeek_truu_tuong monday = DayofWeek_truu_tuong.Monday;
		System.out.println(monday.printDay());
		
		DayofWeek_tuong_minh tuesday = DayofWeek_tuong_minh.Tuesday;
		System.out.println(tuesday.printDay());
	}

}
