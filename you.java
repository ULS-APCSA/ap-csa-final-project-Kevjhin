import java.util.Scanner;
public class you{
    int power=0;
    int attack=20;
    boolean die=false;

    int date=0;
    int time=0;

    int materials=5;
    int iron=5;
    int food=3;
    int AidPacket=2;
    int health=100;

    boolean infected=false;

    boolean craftingTable=false;
    boolean stick=false;
    boolean gun=false;
    boolean fireAxe=false;
    boolean complexWall=false;

    int luck=(int)(Math.random()*20);

    boolean build=false;
    boolean office=false;
    boolean policeStation=false;
    boolean market=false;
    boolean trainStation=false;

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
    public boolean Dead(){
        return die;
    }

    public void DayByDay(){
        while(die==false){
            if(date>=5){
                
            }else{
                daying();
            }
            }
            System.out.println("x-x-x-x-x-x--xx--x-xx-x-x-x-x-xx-x-xx-x-xx-xx--x--x--x-x-x-x-x-");
            System.out.println("You died");
            System.out.println("x-x-x-x-x-x--xx--x-xx-x-x-x-x-xx-x-xx-x-xx-xx--x--x--x-x-x-x-x-");
            Scanner deather=new Scanner(System.in);

            if(deather.next()=="yes"){
                int luck=(int)(Math.random()*20);
                if(luck>=19){
                }else 
                if(luck>=14){
            
                }
                if(luck>=10){
                    
                }
                //gift code for next round
                
            }
    }

    public void daying(){
        date+=1;
        time=0;
        if(infected==true){
            health-=30;
        }
        System.out.println("Day:"+date);
    if(date==1){
        System.out.println("Now you have 4 time periods a day, they are morning,afternoon,evening,and night.");
        System.out.println("You can only go out at morning and afternoon, going out takes 1 time periods");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("You can try to go out at night :)");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("You can only stay up late to do things(for one night and then you have to go to sleep) or sleep(if you think your shelter is strong enough)");
    }
    if(die==false){
        morning();
    }
    if(die==false && time==1){
        afternoon();
    }
    if(die==false && time==2){
        evening();
    }    if(die==false){
        night();
    }
    }

    public void morning(){
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
    }

    public void afternoon(){
        Scanner mc=new Scanner(System.in);
        System.out.println("Day "+date);
        System.out.println("What do you want to do to now?");
        System.out.println("(type 1 to check your items;)");
        System.out.println("(type 2 to build new things;)");
        System.out.println("(type 3 to go some where;)");
        int choice=mc.nextInt();
        if(choice == 1){
        checking();
        afternoon();
        }else{
            time+=1;
            if(choice == 2){
                building();
            }
            if(choice == 3){
                goingOut();
            }
        }
    }

    public void evening(){
        Scanner mc=new Scanner(System.in);
        System.out.println("Day "+date);
        System.out.println("What do you want to do to now?");
        System.out.println("(type 1 to check your items;)");
        System.out.println("(type 2 to build new things;)");
        int choice=mc.nextInt();
        if(choice == 1){
        checking();
        evening();
        }else{
            time+=1;
            if(choice == 2){
                building();
            }
        }
    }

    public void night(){
        Scanner mc=new Scanner(System.in);
        System.out.println("Day "+date);
        System.out.println("What do you want to do to now?");
        System.out.println("(type 1 to check your items;)");
        System.out.println("(type 2 to build new things :) )");
        System.out.println("(type other number to skip this day)");
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
        if(health>90){
        System.out.println("healthy");
        }else{
            if(health>70){
        System.out.println("fine");
            }else{
                if(health>50){
            System.out.println("injured");
                }else{
                    if(health>30){
                System.out.println("seriously injured");
                    }else{
                    System.out.println("dying");
        }
    }
}
}
        System.out.println("infected:"+infected);
    System.out.println("-------------------------------------------------------------");
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
                complexWall=true;
                materials-=3;
                iron-=2;}
    }
    if(fireAxe==false && materials>=2 && iron>=1){
        System.out.println("2 materials and 1 iron to build a fireAxe");
        System.out.println("enable you to break any doors, and has the most DPS!");
        System.out.println("Type 1 to build type else to check other things");
        if(bu.nextInt()==1){
            complexWall=true;
            materials-=3;
            iron-=2;}
    }

}
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

    Scanner choice=new Scanner(System.in);
    if(choice.nextInt()==1){
        if(office=false){
            office office=new office();
        }
    }
}

}