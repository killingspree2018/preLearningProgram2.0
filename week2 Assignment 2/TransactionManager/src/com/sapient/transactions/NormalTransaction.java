package com.sapient.transactions;

public class NormalTransaction extends Transactions{

	public NormalTransaction(int eId,int cId,String tType, String tDate, int value, boolean flag){
		
		this.eId = eId;
		this.cId = cId;
		this.tType = tType;
		this.tDate = tDate;
		this.value = value;
		this.flag = flag;
		if(flag) 
			fee = 500;
		else {
			if(tType.equals("sell") || tType.equals("withdraw")) 
				fee = 100;
			else
				fee = 50;
		}
	}


}
