package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    //variables
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    //constructor
    public Building(int length, int width, int LotLength, int lotWidth){
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = LotLength;
        this.mLotWidth = lotWidth;
    }
    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    public void setLength(int length){
        this.mLength = length;
    }
    public void setWidth(int width){
        this.mWidth = width;
    }
    public void setLotLength(int lotLength){
        this.mLotLength = lotLength;
    }
    public void setLotWidth(int lotWidth){
        this.mLotWidth = lotWidth;
    }
    public int calcBuildingArea(){
        int area = mLength * mWidth;
        return area;
    }
    public int calcLotArea(){
        int lArea = mLotLength * mLotWidth;
        return lArea;
    }
    public String toString() {
        return "The building " + getLength();
    }
}
