/**
 * 
 */
package javalabrecords;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Janis Froehlig Mar 25, 2014
 */
public class Record {

	int iRecordID;
	String strArtist;
	String strLabel;
	String strTitle;
	String strGenre;
	int iCondition;
	BigDecimal bidOriginalPrice;
	BigDecimal bidCurrentPrice;
	Date dateConsigned;// Date & time makes this unique
	Date dateSold;// TODO - sell records
	BigDecimal bidSoldPrice;//
	int iConsignorID;

	/**
	 * @param iRecordID
	 * @param strArtist
	 * @param strLabel
	 * @param strTitle
	 * @param strGenre
	 * @param iCondition
	 * @param bidOriginalPrice
	 * @param bidCurrentPrice
	 * @param dateConsigned
	 * @param dateSold
	 * @param bidSoldPrice
	 * @param iConsignorID
	 */
	public Record(int iRecordID, String strArtist, String strLabel,
			String strTitle, String strGenre, int iCondition,
			BigDecimal bidOriginalPrice, BigDecimal bidCurrentPrice,
			Date dateConsigned, Date dateSold, BigDecimal bidSoldPrice,
			int iConsignorID) {

		this.iRecordID = iRecordID;
		this.strArtist = strArtist;
		this.strLabel = strLabel;
		this.strTitle = strTitle;
		this.strGenre = strGenre;
		this.iCondition = iCondition;
		this.bidOriginalPrice = bidOriginalPrice;
		this.bidCurrentPrice = bidCurrentPrice;
		this.dateConsigned = dateConsigned;
		this.dateSold = dateSold;
		this.bidSoldPrice = bidSoldPrice;
		this.iConsignorID = iConsignorID;
	}

	public void addNewRecord(int iConsignorID) {

		System.out.println("Enter Artist name:");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNext()) {
			strArtist = sc.next();
		}

		System.out.println("Enter Label:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) {
			strLabel = sc.next();
		}

		System.out.println("Enter Title:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) {
			strTitle = sc.next();
		}

		System.out.println("Enter Genre:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) {
			strGenre = sc.next();
		}

		System.out.println("Enter condition rating:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) {
			iCondition = sc.nextInt();
		}

		System.out.println("Enter starting price:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) {
			bidOriginalPrice = sc.nextBigDecimal();
		}

		System.out.println("Enter amount paid to consignor:");
		sc = new Scanner(System.in);
		if (sc.hasNext()) {
			bidSoldPrice = sc.nextBigDecimal();
		}

		sc.close();
	}// addNew method
}// class

