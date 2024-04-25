public class station extends place{
        public void push() {
            you a=new you();
            super.push();
            form[0][3]=getProgress(3)+1;
            int now=chanceCalculator(3);
    
            if(now==1 || getProgress(3)==2){
                System.out.println("There is nobody here, you entered the train");
                if(a.fuel==true){
                    if(a.save==true & a.save2==true){
                        System.out.println("You guys use the fuel to start the train and escaped!");
                        System.out.println("Perfect ending: the one");
                a.getEscape();

                    }else{
                        System.out.println("You use the fuel to start the train and escaped!");
                        System.out.println("Good ending 3: Train escape");
                a.getEscape();

                    }
                }else{
                    a.fuel=true;
                    System.out.println("You get some fuel");
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
                    if(a.health()==false){
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

