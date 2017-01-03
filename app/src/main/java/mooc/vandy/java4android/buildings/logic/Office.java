package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    //variables
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    //constructors
    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        sTotalOffices++;

        /*to use constructor from this class do this, alot easier so keep in mind
        this(length, width, lotLength, lotWidth);
         */
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }
    public String getBusinessName(){
        return mBusinessName;
    }
    public int getParkingSpaces(){
        return mParkingSpaces;
    }
    public void setBusinessName(String name){
        this.mBusinessName = name;
    }
    public void setParkingSpaces(int space){
        this.mParkingSpaces = space;
    }
    public String toString(){
        if(getBusinessName()==null)
            return "Business: unoccupied (total offices: "+ sTotalOffices +")";
        else
            return "Business: "+ getBusinessName ()+" total offices: "+ sTotalOffices +")";
    }
    public boolean equals(Object o){
        if(o instanceof Office){
            if(this.calcBuildingArea()== ((Office) o).calcBuildingArea() &&
                    this.getParkingSpaces()==((Office) o).getParkingSpaces())
                return true;
            else
                return false;
        }else
            return false;
    }
}
