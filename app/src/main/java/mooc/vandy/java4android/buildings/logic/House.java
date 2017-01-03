package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    //variables
    private String mOwner;
    private boolean mPool;

    //constructor
    public House(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner){
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }
    public void setOwner(String owner){
        this.mOwner = owner;
    }
    public void setPool(boolean pool){
        this.mPool = pool;
    }
    public String toString(){
        if(calcBuildingArea()<calcLotArea())
            return "Owner: "+this.getOwner()+"; has a big open space\n";
        else
            return "Owner: "+this.getOwner()+"; has a small open space\n";
    }
    public boolean equals(Object o){
        if(o instanceof House){
            if(this.calcBuildingArea()==((House) o).calcBuildingArea() && this.hasPool()==((House) o).hasPool())
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
