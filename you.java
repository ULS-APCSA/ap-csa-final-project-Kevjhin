import java.util.NoSuchElementException;
import java.util.Scanner;
public class you{
    String[] place={"office","policeStation","market","station"};
    int[] progress={0,0,0,0};
  
    int power=0;
    int attack=20;
    boolean die=false;
    boolean escape=false;
    boolean fule=false;

    int date=0;
    int time=0;
    int cost=1;

    int materials=5;
    int iron=5;
    int food=3;
    int AidPacket=2;
    boolean health=true;

    boolean infected=false;

    boolean craftingTable=false;
    boolean stick=false;
    boolean gun=false;
    boolean fireAxe=false;
    boolean complexWall=false;
    boolean fuel=false;

    int luck=(int)(Math.random()*20);

    boolean build=false;
    boolean office=false;
    boolean policeStation=false;
    boolean market=false;
    boolean trainStation=false;

    boolean save=false;
    boolean save2=false;

    public int all(){
        return iron+materials+food;
    }
    public boolean stick(){
        return stick;
    }
    public boolean gun(){
        return gun;
    }
    public boolean fireAxe(){
        return complexWall;
    }
    public boolean complexWall(){
        return complexWall;
    }
    public boolean escape(){
        return escape;
    }
    public boolean health(){
        return health;
    }
    public boolean dead(){
        return die;
    }
    public boolean fuel(){
        return fuel;
    }
    //get all info
    private void addrule(int a){
      int pos=0;
      if(a==1){
        for(int b=0;b<place.length;b++){
          if(place.equals("office")){
            pos=b;
          }
        }
        progress[pos]+=1;
      }else if(a==2){
        for(int b=0;b<place.length;b++){
          if(place.equals("policeStation")){
            pos=b;
          }
        }
        progress[pos]+=1;
      }else if(a==3){
        for(int b=0;b<place.length;b++){
          if(place.equals("market")){
            pos=b;
          }
        }
        progress[pos]+=1;
      }else if(a==4){
        for(int b=0;b<place.length;b++){
          if(place.equals("station")){
            pos=b;
          }
        }
        progress[pos]+=1;
      }
    }
  
    private void getrule(){
      for(int a=progress.length-1;a>=0;a--){
        System.out.println(place[a]+": "+progress[a]);
      }
    }

  
    private void setrule(){
      int place1;
      String name;
      for(int a=0;a<progress.length-1;){
        int small=progress[a];
        place1=a;
        name=place[a];
        for(int b=a+1;b<progress.length-1;){
          if(small>progress[b]){
            small=progress[b];
            name=place[b];
            progress[b]=progress[a];
            place[b]=place[a];
            place1=a;
            
          }
        }
        progress[a]=small;
        place[a]=name;
      }
    }
  
    public void getItem(int number,int amount){
        if(number==1){
            materials+=amount;
        }
        if(number==2){
            iron+=amount;
        }
        if(number==3){
            food+=amount;
        }
        if(number==4){
            AidPacket+=amount;
        }
        if(number==5){
            if(amount==0){
                health=false;
            }else{
                health=true;
            }
        }
        
    }
    //change the info stored in you 
    
    public you(){
    if(luck>=17){
        fireAxe=true;
        craftingTable=true;
        food=5;
        complexWall=true;
    }else 
    if(luck>=14){
        food+=1;

    }
    if(luck>=10){
        stick=true;
    }
    }
    //create a random guy; not using "this" method to avoid 
    public you(int a){
        luck=a;
        if(luck>=17){
            fireAxe=true;
            craftingTable=true;
            food=5;
            complexWall=true;
        }else 
        if(luck>=14){
            food+=1;
    
        }
        if(luck>=10){
            stick=true;
        }
        }
    public void Dead(){
        die=true;
    }

    public void getFuel(){
        fuel=true;
    }

    public void daying(){
        while(die==false&&escape==false){
        date+=1;
        time=0;
        System.out.println("Day:"+date);

        if(infected==true){
            System.out.println("You are infected!");
            health=false;
        }
        if(health==false&AidPacket>=1){
            AidPacket-=1;
            health=true;
        }
        if(food>=cost){
            food-=cost;
        }else{
            if(health==true){
                System.out.println("You are hungry!");
                health=false;
            }else{
                System.out.println("You are dead because of hunger!");
                die=true;
                System.out.println("Bad ending 2: Hunger");
            }

        }
    if(date==1){
        System.out.println("Now you have 4 time periods a day, they are morning,afternoon,evening,and night.");
        System.out.println("You can only go out at morning and afternoon, going out takes 1 time periods");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("You can try to go out at night :)");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("You can only stay up late to do things(for one night and then you have to go to sleep) or sleep(if you think your shelter is strong enough)");
    }
    if(die==false&&escape==false){
        morning();
    System.out.println("-------------------------------------------------------------");

    }
    if(die==false && time==1&&escape==false){
        afternoon();
    System.out.println("-------------------------------------------------------------");

    }
    if(die==false && time==2&&escape==false){
        evening();
    System.out.println("-------------------------------------------------------------");

    }    if(die==false&&escape==false){
        night();
    System.out.println("-------------------------------------------------------------");
      setrule();
    }
    }
    
    if(die==true){
        System.out.println("x-x-x-x-x-x--xx--x-xx-x-x-x-x-xx-x-xx-x-xx-xx--x--x--x-x-x-x-x-");
            System.out.println("You died");
            System.out.println("x-x-x-x-x-x--xx--x-xx-x-x-x-x-xx-x-xx-x-xx-xx--x--x--x-x-x-x-x-");
}
}

    public void morning(){
        try{
            Scanner mc=new Scanner(System.in);
        System.out.println("Day "+date);
        System.out.println("What do you want to do to now?");
        System.out.println("(type 1 to check your items;)");
        System.out.println("(type 2 to build new things;)");
        System.out.println("(type 3 to go some where;)");
        int choice=mc.nextInt();
        if(choice == 1){
        checking();
        morning();
        }else{
            time+=1;
            if(choice == 2){
                building();
            }
            if(choice == 3){
                goingOut();
            }
        }
        }catch (NoSuchElementException e) {
            morning();
        }
    }

    private void afternoon(){
        try{
            Scanner mc2=new Scanner(System.in);
            System.out.println("Day "+date);
            System.out.println("What do you want to do to now?");
            System.out.println("(type 1 to check your items;)");
            System.out.println("(type 2 to build new things;)");
            System.out.println("(type 3 to go some where;)");
            
                int choice2=mc2.nextInt();
            if(choice2 == 1){
            checking();
            afternoon();
            }else{
                time+=1;
                if(choice2 == 2){
                    building();
                }
                if(choice2 == 3){
                    goingOut();
                }
            }
        }catch (NoSuchElementException e){
            afternoon();
        }

    }

    public void evening(){
        try{

        }catch(NoSuchElementException e){
            afternoon();
        }
        Scanner mc3=new Scanner(System.in);
        System.out.println("Day "+date);
        System.out.println("What do you want to do to now?");
        System.out.println("(type 1 to check your items;)");
        System.out.println("(type 2 to build new things;)");
        int choice3=mc3.nextInt();
        if(choice3 == 1){
        checking();
        evening();
        }else{
            time+=1;
            if(choice3 == 2){
                building();
            }
        }
        mc3.close();

    }

    public void night(){
        try{
            Scanner mc4=new Scanner(System.in);
        System.out.println("Day "+date);
        System.out.println("What do you want to do to now?");
        System.out.println("(type 1 to check your items;)");
        System.out.println("(type 2 to build new things :) )");
        System.out.println("(type other number to skip this day(sleep))");
        int choice4=mc4.nextInt();
        if(choice4 == 1){
        checking();
        morning();
        }else{
            time+=1;
            if(choice4 == 2){
                building();
            }
                Scanner az=new Scanner(System.in);
                System.out.println("Music List");
                System.out.println("1.piano");
                System.out.println("2.whisper");
                System.out.println("3.legend");
                System.out.println("4.mild");
                System.out.println("5.scientific");
                System.out.println("6.constriction");
                System.out.println("Type a number to chose music");
                System.out.println("Type 0 to pick a random music");
                
        }
        }catch(NoSuchElementException e){
            night();
        }
    }

    public void checking(){
    System.out.println("-------------------------------------------------------------");
        System.out.println("Listing all the things you have:");
        System.out.println("Building Materials:"+materials);
        System.out.println("Iron:"+iron);
        System.out.println("Food:"+food);
        System.out.println("Iron:"+iron);
        System.out.println("Aidpacket:"+AidPacket);
        System.out.println("--------------------------------------");
        System.out.println("health condition:");
        System.out.print("health:");
        if(health==true){
        System.out.println("healthy");
        }else{
        System.out.println("injured");
        System.out.println("-------------------------------------------------------------");
            }
        }
    


public void building(){
    Scanner bu=new Scanner(System.in);
    System.out.println("You can build those things:");
    if(craftingTable==false){
        if(materials >= 3 && iron>=2){
            System.out.println("need 3 materils and 2 iron to build a craftingTable;");
            System.out.println("(basic crafting tool, enable you to build simple items)");    
            System.out.println("Type 1 to build");
            if(bu.nextInt()==1){
                craftingTable=true;
                materials-=3;
                iron-=2;
            }
        }
        
    }else {
    if(stick==false){
        if(materials >= 2){
            System.out.println("2 materials and 1 iron to build a stick");
            System.out.println("increase your damage & can be used to break a closed door");
            System.out.println("Type 1 to build type else to check other things");
            if(bu.nextInt()==1){
                stick=true;
                materials-=2;
            }
        }
    }
    if(complexWall==false && materials >= 5 && iron >= 3){
            System.out.println("5 materials and 3 iron to build complexwalls");
            System.out.println("protect yourself at night;lower the chance of attracting zombie");
            System.out.println("Type 1 to build type else to check other things");
            if(bu.nextInt()==1){
                complexWall=true;
                materials-=5;
                iron-=3;}
    }
    if(gun==false && materials>= 3 && iron>=2){
            System.out.println("3 materials and 2 iron to build a gun");
            System.out.println("enable you to kill enemy from distance(if you have bullets), but you only have 10 ammos :)");
            System.out.println("Type 1 to build type else to check other things");
            if(bu.nextInt()==1){
                gun=true;
                materials-=3;
                iron-=2;}
    }
    if(fireAxe==false && materials>=2 && iron>=1){
        System.out.println("2 materials and 1 iron to build a fireAxe");
        System.out.println("enable you to break any doors, and has the most DPS!");
        System.out.println("Type 1 to build type else to check other things");
        if(bu.nextInt()==1){
            fireAxe=true;
            materials-=3;
            iron-=2;}
    }

}
    bu.close();
}

public void goingOut(){
    System.out.println("Where do you want to go?");
    System.out.println("1.Office");
    System.out.println("a lot of debris");
    System.out.println("low risk of robbers");
    System.out.println("a probability of attracting rescue helicopters.");
    System.out.println("-------------------------------------------------------------");
    System.out.println("2.Police station");
    System.out.println("may be a variety of item");
    System.out.println("high risk of danger");
    System.out.println("heard that there are cryings from the station");
    System.out.println("-------------------------------------------------------------");
    System.out.println("3.Market");
    System.out.println("have materials and food");
    System.out.println("medium risk of robbers");    
    System.out.println("heard that there are cryings from the market");
    System.out.println("-------------------------------------------------------------");
    System.out.println("4.trainStation");
    System.out.println("may be a variety of item");
    System.out.println("high risk of robbers");    
    System.out.println("There is a train full of gas at the station");
    System.out.println("-------------------------------------------------------------");
    System.out.println("Type a number to choose");
    System.out.println("-------------------------------------------------------------");
    getrule();
    System.out.println("-------------------------------------------------------------");
  
  
    Scanner choice=new Scanner(System.in);
    int cho=choice.nextInt();
    if(cho==1){
      addrule(1);
        office office=new office();
        office.push();
    }else if(cho==2){
      addrule(2);
        policeStation policeStation=new policeStation();
        policeStation.push();
    }else if(cho==4){
      addrule(4);
        station station=new station();
        station.push();
    }else if(cho==3){
      addrule(3);
      market market=new market();
      market.push();
    }
    choice.close();
}

public void getEscape(){
    escape=true;
}


}