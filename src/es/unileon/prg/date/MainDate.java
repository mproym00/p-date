package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today, tomorrow;

		try {
			today = new Date(31, 03, 2019);
			System.out.println(today.toString());
			tomorrow = new Date(01, 04, 2019);
			System.out.println(tomorrow.toString());
			System.out.println("Is "+today + " the same year than " + tomorrow + "? " + today.isSameYearIf(tomorrow));
			System.out.println("Is "+today + " the same month than "+tomorrow+"? "+today.isSameMonthIf(tomorrow));
			System.out.println("Is "+today + " the same day than "+tomorrow+"? "+today.isSameDayIf(tomorrow));
			System.out.println("Is "+today + " the same date than "+tomorrow+"? "+today.isSame(tomorrow));
		
		
			System.out.println(today.getMonthDayLeft());
			System.out.println(today.seasonOfMonth());
			System.out.println(today.isDayOfMonthRight(today.getDay()));
			System.out.println(today.getMonthsSameDate());
			System.out.println(today.daysPast());
			System.out.println(today.numRandomTimesEqualDate1());
			System.out.println(today.numRandomTimesEqualDate2());
			System.out.println(today.dayOfWeek());
			System.out.println(today.monthsLeft());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}