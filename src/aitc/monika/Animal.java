package aitc.monika;

/**
 * Created by studenta on 10.04.2017.
 */
public class Animal {
    private boolean isMammal;
    private String ownerName;
    private boolean isHungry;

    public Animal(boolean isMammal,
                  String ownerName,
                  boolean isHungry) {

        this.isMammal = isMammal;
        this.ownerName = ownerName;
        this.isHungry = isHungry;

    }

    public Animal(){

    }

    public String getOwnerNamwe() {
        return ownerName;
    }

    public void setOwnerNamwe(String ownerNamwe) {
        this.ownerName = ownerNamwe;
    }

    public boolean getHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }


    public void  setHungry (String food){
        if ("meat"==food ){

            this.isHungry   = false;
        }
        else if (food == "plant") {

            this.isHungry = false;
        }

        else {
            this.isHungry = true;
        }
    }



    public void sleep() {
        System.out.println("I am sleeping");
    }


    public void eat() {
        System.out.println("I am eating");
    }

}



