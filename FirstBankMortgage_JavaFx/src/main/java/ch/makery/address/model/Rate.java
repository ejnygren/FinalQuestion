package ch.makery.address.model;

import domain.RateDomainModel;
import domain.base.RateDAL;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Rate extends RateDomainModel {
	
	public double getPayment(int NumberOfPayments)
	{
		double FutureValue;
		double PresentValue;
		boolean f;
		double ReturnCalct;
		double RateDAL.g;
		double PaymentCalc;
		
		double PV;
		//Calculates the present value using the FinanceLib equation
		ReturnCalc = (AnnualReturnPayback/12);
		RetiredCalc = (YearsRetired * 12);
		PaymentCalc = (RequiredIncome - MonthlySSI);
		FutureValue = 0;
		f = false;
		
		PV = FinanceLib.pv(ReturnCalc,RetiredCalc,PaymentCalc,FutureValue,f);
		//Prints answer
		System.out.println(PV);
		
		double PMT;
		// Calculates the payment time value using the FinanceLib equation
		ReturnCalc = (AnnualReturnInvestment/12);
		RetiredCalc = (YearsWorked * 12);
		PresentValue = 0;
		FutureValue = PV;
		f = false;
		
		PMT = FinanceLib.pmt(ReturnCalc,RetiredCalc,PresentValue,FutureValue,f);
		//Prints answer
		System.out.println(PMT);
		
		
		
		return 0;
	}
}
