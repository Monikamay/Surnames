package aitc.monika;

public class Main {

    public static void main(String[] args) {
	// write your code here

       /* Animal anl = new Animal(false, "Armen", true);
        anl.eat();


        anl.setHungry( "meat");


        String own = anl.getOwnerNamwe();
        boolean hungry = anl.getHungry();
        */

        //System.out.println("owner:" + own + ", is hungry?" + hungry);//


      /*Dog mydog = new Dog(true,"Zara", true, false, true, true, true);

        mydog.setFriendly(false);
        mydog.setBarking(true);
        mydog.examination();
        mydog.getisMilkTeeth();
        mydog.setHungry("meat");

        System.out.println("owner:" + mydog.getOwnerNamwe() + ", is hungry?" + mydog.getOwnerNamwe());
        */

      String  surname = "";

      String [] surnames = {" Gasparyan", " Mayilyan", " Marutyan", " Tserunyan", " Stepanyan", " Grigoryan", " Margaryan" , " Egiazaryan"};


      String [] name = {" Hovhannes", " Monika", " Sirun", " Anatoli", " Vache", " Ashot", " Araqs", " Armen"};
       int len = surnames.length;



        for (int i =0; i < len; i++){



                System.out.println(  surnames[i]  + name [i]);
            }


           /* int j = 0;
            while (j<len){

                System.out.println(  "my surname:" + surnames[j] );
                j ++;

                if(5==j)
                    break;

            }*/

        }
    }


