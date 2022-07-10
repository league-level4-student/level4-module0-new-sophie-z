package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

    /*
     * itemsReceived cannot be negative. All negative parameters should set
     * itemsReceived to 0.
     */

    protected int itemsReceived;

    /*
     * degreesTurned must be locked between 0.0 and 360.0 inclusive. All
     * parameters outside this range should set degreesTurned to the nearest
     * bound.
     */

    protected double degreesTurned;

    /*
     * nomenclature must not contain an empty String. An empty String parameter
     * should set nomenclature to a String with a single space.
     */

    protected String nomenclature;

    /*
     * memberObj must not be a String. A String parameter should set memberObj
     * to a new Object(); Hint: Use the instanceof operator.
     */

    Object memberObj;

	public void setItemsReceived(int randomPositiveNum) {
		// TODO Auto-generated method stub
		if(randomPositiveNum>0){
			this.itemsReceived = randomPositiveNum;
		}
		else {
			itemsReceived = 0;
		}
	}

	public Integer getItemsReceived() {
		// TODO Auto-generated method stub
		return itemsReceived;
	}

	public void setDegreesTurned(double randomPositiveNum) {
		// TODO Auto-generated method stub
		if(randomPositiveNum>=0.0 && randomPositiveNum<=360.0) {
			this.degreesTurned = randomPositiveNum;
		}
		else if(randomPositiveNum<0){
			degreesTurned = 0;
		}
		else {
			degreesTurned = 360;
		}
	}

	public Double getDegreesTurned() {
		// TODO Auto-generated method stub
		return degreesTurned;
	}

	public void setNomenclature(String randomString) {
		// TODO Auto-generated method stub
		if(randomString.isEmpty()==false) {
			this.nomenclature = randomString;
		}
		else {
			nomenclature.equals(" ");
		}
	}

	public Object getNomenclature() {
		// TODO Auto-generated method stub
		return nomenclature;
	}

	public void setMemberObj(Object randomObject) {
		// TODO Auto-generated method stub
		
	}

	public Object getMemberObj() {
		// TODO Auto-generated method stub
		return null;
	}

}
