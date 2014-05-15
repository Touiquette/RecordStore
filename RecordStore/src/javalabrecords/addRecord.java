/**
 * 
 */
package javalabrecords;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Janis Froehlig
 * Mar 25, 2014
 */
public class addRecord {

String strArtist;
String strTitle;
BigDecimal bidOriginalPrice;
BigDecimal bidCurrentPrice;
Date dateConsigned;//Date & time makes this unique
Date dateSold;//TODO - sell records
BigDecimal bidSoldPrice;//

String strConsignorID;

//maybe add Label, at least


	public addRecord(String strConsignorID) {
		
		
		System.out.println	("Enter Artist name:");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) strArtist = sc.next();
		
		System.out.println	("Enter Title:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) strTitle = sc.next();
		
		System.out.println	("Enter starting price:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) bidOriginalPrice = sc.nextBigDecimal();
		
		dateConsigned = new Date();
		/* for later - fetch from fileDate Today = new Date()
		
		if (dateConsigned >= ....*/
		
		//for now, for new
		//bidCurrentPrice = new BigDecimal(bidOriginalPrice); //I think
		
		sc.close();
		
		

	}//constructor
	}//class

