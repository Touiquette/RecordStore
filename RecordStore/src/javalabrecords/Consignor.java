/**
 * 
 */
package javalabrecords;

import java.util.Scanner;

/**
 * @author Janis Froehlig Mar 25, 2014
 */
public class Consignor {

	static String strName;
	static String strPhNo;
	static int keyID;

	public Consignor() {

	}

	public Consignor() {
		/*
		 * Search ConsignorTable & ----TODO
		 * 
		 * 
		 * //for (hmConTable : strStoredConID){}
		 * 
		 * create from Consignor table or enter new
		 */

		String strNewName = new String();
		String strNewPhNo = new String();
		int keyID = new String();

		System.out.println("Enter consignor name:");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			strNewName = sc.next();
		}

		System.out.println("Enter consignor phone number: (10 digits only)");
		// TODO improve input control
		sc = new Scanner(System.in);
		if (sc.hasNext()) {
			strNewPhNo = sc.next();
		}

		strName = strNewName;
		strPhNo = strNewPhNo;
		strConID = strNewID;

		sc.close();
	}
}
