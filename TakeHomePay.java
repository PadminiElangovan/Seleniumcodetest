package Assignment2;

import java.util.Scanner;

public class TakeHomePay {
	
	int BasicPay, Boa, Bonus;
	double MonthlyGross, YearlyGross, TaxRate, YearlyTax, MonthlyTax, MonthlyTakeHome;
	
	void CalMonthlyPay()
	{
		MonthlyGross = ((BasicPay + Boa + Bonus)-(BasicPay*0.12));
		YearlyGross = MonthlyGross * 12;
		
	// Tax Rate
		
		if (YearlyGross < 250000) {  TaxRate = 0; }
		
		else if(YearlyGross < 500000 ) { TaxRate = 0.05; }
		
		else if(YearlyGross < 750000 ) { TaxRate = 0.10; }
		
		else if(YearlyGross < 1000000 ) { TaxRate = 0.15; }
		
		else if(YearlyGross < 1250000 ) { TaxRate = 0.20; }
		
		else if(YearlyGross < 1500000 ) { TaxRate = 0.25; }
		
		else {  TaxRate = 0.30; }
		
		YearlyTax = YearlyGross * TaxRate;
		MonthlyTax = YearlyTax / 12;
		MonthlyTakeHome = MonthlyGross - MonthlyTax;
		
		System.out.println("Montly take home Salary:" +MonthlyTakeHome);
	}
	
	public static void main(String[] args) {
		//Scanner
		Scanner Scan1 = new Scanner(System.in);	
		//Obj
		TakeHomePay TakeHomePay1 = new TakeHomePay();
		System.out.println("Enter Basic Pay:");
		TakeHomePay1.BasicPay = Scan1.nextInt();
		System.out.println("Enter BOA:");
		
		
		
		TakeHomePay1.Boa= Scan1.nextInt();
		System.out.println("Enter Bonus:");
		TakeHomePay1.Bonus= Scan1.nextInt();
		
		TakeHomePay1.CalMonthlyPay();
		Scan1.close();
				
	}

}
