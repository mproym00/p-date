package es.unileon.prg.date;

public class Date {

	private int _day;
	private int _month;
	private int _year;

	public Date(int day, int month, int year) throws DateException{
		this._year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this._month = month;
		}
		
		if( isDayOfMonthRight(day)==true){
			this._day=day;
		}else throw new DateException("Dia "+day+" no valido en el mes "+this._month+".");		
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
	
	public int getMonths(){
		int months=this._month;
		return months;
	}
	
	public int getDay(){
		return this._day;
	}
		
	@Override
	public String toString() {
		return this._day + "/" + this._month + "/" + this._year;
	}
	
	public boolean isSameYearIf(Date year){
		boolean retorno=false;
		if(year.getYear()==this._year){
			retorno=true;
		}else retorno=false;
	return retorno;
	}
	
	public boolean isSameMonthIf(Date month){
		boolean retorno=false;
		if(month.getMonth()==this._month){
			retorno=true;
		}else retorno=false;
	return retorno;
	}
	
	public boolean isSameDayIf(Date day){
		boolean retorno=false;
		if(day.getDay()==this._day){
			retorno=true;
		}else retorno=false;
	return retorno;
	}
	
	public boolean isSame(Date date){
		boolean retorno=false;
		if( (this._year==date.getYear() ) && (this._day==date.getDay() ) && (this._month==date.getMonth() ) ){
			retorno=true;
		}else retorno=false;
	return retorno;
	}
	
	public String nameOfMonth(){
		String name=" ";
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


	public boolean isDayOfMonthRight(int day) throws DateException{
		boolean retorno=false;
		switch(this._month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day>31){
					throw new DateException("dia "+day+" no valido en este mes");
					//retorno=false;
				}
				else{
					retorno=true;
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>30){
					throw new DateException("dia "+day+" no valido en este mes");
					//retorno=false;
				}
				else{
					retorno=true;
				}
			break;
			case 2:
				if(day>28){
					throw new DateException("dia "+day+" no valido en el mes de febrero");
					//retorno=false;
				}
				else{
					retorno=true;
				}
			break;
			
		}
		return retorno;	
	}
	
	
	public String seasonOfMonth(){
		String season=" ";
		switch(this._month){
			case 1:
			case 2:
			season="invierno";
			break;
			case 3:
				if(this._day>1 && this._day<=20){
					season="invierno";
				}else if(this._day>20&&this._day<=31){
					season="primavera";
				 }
			break;
			case 4:
			case 5:
			season="primavera";
			break;
			case 6:
			if(this._day>1&&this._day<=20){
				season="primavera";
			}
			else if(this._day>20&&this._day<=30){
				season="verano";
			}
		break;
		case 7:
		case 8:
			season="verano";
		break;
		case 9:
			if(this._day>1&&this._day<=20){
				season="verano";
			}
			else if(this._day>20&&this._day<=30){
				season="otoño";
			}
		break;
		case 10:
		case 11:
			season="otoño";
		break;
		case 12:
			if(this._day>1&&this._day<=20){
				season="otoño";
			}
			else if(this._day>20&&this._day<=31){
				season="invierno";
			}
		break;
		}
		return season;
	}
	
	public String monthsLeft(){
	StringBuffer month=new StringBuffer();	
		for(int i=getMonths();i<=12;i++){
			month.append( nameOfMonth() + "\n");
			this._month=this._month+1;
		}
	return month.toString();
	}
	
	
	public int getMonthDayLeft(){
			int i=0;
		if(this._month==1||this._month==3||this._month==5||this._month==7||this._month==8||this._month==10||this._month==12){
			for(int o=this._day;o<=31;o++){
				i++;
			}
		}
		else if(this._month==4||this._month==6||this._month==9||this._month==11){
			for(int o=this._day;o<=30;o++){
				i++;
			}
		}
		else if(this._month==2){
			for(int o=this._day;o<=28;o++){
				i++;
			}
		}
	return i;
	}
	public int getMonthsSameDate(){
		for(int i=1;i<=12;i++){
			if(this._month==1||this._month==3||this._month==5||this._month==7||this._month==8||this._month==10||this._month==12){
				switch(i){
					case 1:
					System.out.println("enero");
					break;
					case 3:
					System.out.println("marzo");
					break;
					case 5:
					System.out.println("mayo");
					break;
					case 7:
					System.out.println("julio");
					break;
					case 8:
					System.out.println("agosto");
					break;
					case 10:
					System.out.println("octubre");
					break;
					case 12:
					System.out.println("diciembre");
					break;
				}
			}
		else if(this._month==4||this._month==6||this._month==9||this._month==11){
			switch(i){
			case 4:
			System.out.println("abril");
			break;
			case 6:
			System.out.println("junio");
			break;
			case 9:
			System.out.println("septiembre");
			break;
			case 11:
			System.out.println("noviembre");
			}
		}
		else if(this._month==2){
			switch(i){
			case 2:
			System.out.println("febrero");
			break;
			}
		}
		}
	return 0;	
	}
	
	public int daysPast(){
		int suma=0;
		int mes_31=31;	
		int mes_30=30;
		int mes_28=28;
			switch(this._month){
				case 1:
				suma=this._day;
				break;
				case 2:
				suma=this._day+mes_31;
				break;
				case 3:
				suma=this._day+mes_31+mes_28;
				break;
				case 4:
				suma=this._day+mes_31*2+mes_28;
				break;
				case 5:
				suma=this._day+mes_31*2+mes_28+mes_30;
				break;
				case 6:
				suma=this._day+mes_31*3+mes_28+mes_30;
				break;
				case 7:
				suma=this._day+mes_31*3+mes_28+mes_30*2;
				case 8:	
				suma=this._day+mes_31*4+mes_28+mes_30*2;
				case 9:
				suma=this._day+mes_31*4+mes_28+mes_30*3;
				break;
				case 10:
				suma=this._day+mes_31*5+mes_28+mes_30*3;
				break;
				case 11:
				suma=this._day+mes_31*5+mes_28+mes_30*4;
				case 12:
				suma=this._day+mes_31*6+mes_28+mes_30*4;
				break;
			}
		return suma;
			
		
	}
	
	public int numRandomTimesEqualDate1(){
		int numIntentos=0;
		boolean acierto=false;
		int numAcertar1=this._day;
		int numAcertar2=this._month;
		while(!acierto){
			int diaR=(int)(Math.random()*31+1);
			int mesR=(int)(Math.random()*12+1);
			if(diaR==numAcertar1&&mesR==numAcertar2){
				acierto=true;
			}else if(diaR!=numAcertar1||mesR!=numAcertar2){
				numIntentos++;	
			}
		}
		//System.out.println("numero de intentos: " +numIntentos);
		return numIntentos;
	}
	
		public int numRandomTimesEqualDate2(){
		int numIntentos=0;
		boolean acierto=false;
			do{
				int diaR=(int)(Math.random()*31+1);
				int mesR=(int)(Math.random()*12+1);
				
				if(diaR==this._day&&mesR==this._month){
					acierto=true;
				}
				else if(diaR!=this._day||mesR!=this._month){
				numIntentos++;
				}	
			}while(!acierto);
		return numIntentos;
	}
	
	
	public String dayOfWeek(){
		String day=" ";
		int dia=daysPast();
		if(dia%7==1){
			day="Monday";
		}
		else if(dia%7==2){
			day="Tuesday";
		}
		else if(dia%7==3){
			day="Wednesday";
		}
		else if(dia%7==4){
			day="Thursday";
		}
		else if(dia%7==5){
			day="Friday";
		}
		else if(dia%7==6){
			day="Saturday";
		}
		else if(dia%7==0){
			day="Sunday";
		}
	return day;
	}
	
	

}