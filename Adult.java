public class Adult {

    // name, hight, profession
    private String name;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height, profession;

    public String getName(){

        return this.name;
    }

    public boolean setName(String name){
        if (name.equals("")) {
            this.name = name;
            return false;
        } else{
            this.name = name;
            return true;
        }
    }

}
