package com.sapient.transactions;

public class IntradayTransaction extends Transactions{

	public IntradayTransaction(int eId,int cId,String sId, String tType, String tDate, int value)
	{
		this.eId = eId;
		this.cId = cId;
		this.sId = sId;
		this.tType = tType;
		this.tDate = tDate;
		this.value = value;
		this.fee = 10;
	}
	
}
