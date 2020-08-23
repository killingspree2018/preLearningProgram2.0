package com.sapient.transactions;

public class Transactions implements Comparable {	
	
	int eId;
	int cId;
	String sId;
	String tType;
	String tDate;
	int value;
	boolean flag;
	int fee;


@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	
	Transactions x = (Transactions)o;
	int cIdCompare = this.cId - x.cId;
	int feeCompare = this.fee -  x.fee;
	int tTypeCompare = this.tType.compareTo(x.tType);
	int tDateCompare = this.tDate.compareTo(x.tDate);
	if(cIdCompare == 0) {
		if(tTypeCompare == 0) {
			if(tDateCompare == 0)
				return feeCompare;
			else
				return tDateCompare;
		}
		else {
			return tTypeCompare;
		}
	}
	else {
		return cIdCompare;
	}
}

@Override
public String toString() {
	return cId + "," + tType + "," + tDate + "," + ""  + "," + fee + "\n" ;
}

}