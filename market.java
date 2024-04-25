public class market extends place{

    
    public void push() {
        you a=new you();
        super.push();
        form[0][2]=getProgress(2)+1;
        int now=chanceCalculator(2);

        if(now==1 || getProgress(2)==2){
            System.out.println("You find a food warehouse");
            if(a.fireAxe==true){
                System.out.println("You use the axe to break the door and get a lot of food!");
                a.food+=10;
            }else{
                if(a.stick==true){
                    System.out.println("You use the stick to break the door and get a lot of food!");
                    a.food+=10;
                }
            }
        }
        if(now==2){
            System.out.print("You saw a stick!");
            a.stick=true;
        }
        if(now==3){
            System.out.print("You met some zombies");
            if(a.gun()==true||a.fireAxe()==true){
                System.out.print("You killed them easily and get some materials");
                a.getItem(1, 2);
            }
            else if(a.stick()==true){
                System.out.print("You killed them with your stick and get some materials, but the stick broke");
                a.getItem(1, 2);
                a.stick=false;
            }else{
                System.out.print("You escaped from the zombies, but seriously injured");
                if(a.health==false){
                    a.Dead();
                System.out.println("Bad ending 4:killed by zombie");

                }
                a.health=false;
            }
        }else{
            System.out.println("You get some food and a medic");
            a.getItem(3, 1);
            a.getItem(4, 1);
        }

    }


}