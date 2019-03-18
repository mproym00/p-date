package es.unileon.prg.date;

public class Date {

	private int _day;
	private int _month;
	private int _year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		
	}
	
	
	public Date(){
			this._day=01;
			this._month=01;
			this._year=2019;
		}
		
	public int getYear(){
		return this._year;
	}
	
	public int getMonth(){
		return this._month;
	}
	
	public int getDay(){
		return this._day;
	}
		
	@Override
	public String toString() {
		return this._day + "/" + this._month + "/" + this._year;
	}
	
	public isSameYearIf(int year){
		boolean retorno=false;
		if(year==this._year){
			retorno=true;
		}else retorno=false;
	return retorno;
	}
	
	public isSameMonthIf(int month){
		boolean retorno=false;
		if(month==this._moth){
			retorno=true;
		}else retorno=false;
	return retorno;
	}
	
	public isSameDayIf(int day){
		boolean retorno=false;
		if(day==this._day){
			retorno=true;
		}else retorno=false;
	return retorno;
	}
	
	public isSame(Date date){
		boolean retorno=false;
		if( (this._year==date.getYear() ) && (this._day==date.getDay() ) && (this._month==date.getMonth() ) ){
			retorno=true;
		}else retorno=false;
	return verdadero;
	}
	
	public String nameOfMonth(){
		switch(this._month){
			case 1:
			name="enero";
			break;
			case 2:
			name="febrero";
			break;
			case 3:
			name="marzo";
			break;
			case 4:
			name="abril";
			break;
			case 5:
			name="mayo";
			break;
			case 6:
			name="junio";
			break;
			case 7:
			name="julio";
			break;
			case 8:
			name="agosto";
			break;
			case 9:
			name="septiembre";
			break;
			case 10:
			name="octubre";
			break;
			case 11:
			name="noviembre";
			break;
			case 12:
			name="diciembre";
			break;
		}
		return name;
	}

	
	
	

}