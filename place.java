public class place {
    int progress;
    boolean specialEvent=false;
    int [][] form={
        {0,0,0,0},//progress
        {5,20,20,20},//chance for first special events
        {0,10,10,10},//chance for second special events
        {15,30,20,40},//chance for bad events
        {15,40,30,50},//chance for normal events
    };

    public void push(){
        progress+=1;
    }

    public int getProgress(int a){
        int pr=form[0][a];
        return pr;
    }

    public int getS1(int a){
        int pr=form[1][a];
        return pr;
    }

    public int getS2(int a){
        int pr=form[2][a];
        return pr;
    }

    public int getBad(int a){
        int pr=form[3][a];
        return pr;
    }

    public int chanceCalculator(int a){
        int s1=getS1(a);
        int s2=getS2(a);
        int bad=getBad(a);
        int chance=(int)(Math.random()*100);
        int num=4;
        if(chance<s1){
            num=1;
        }else{
            if(chance<s2){
                num=2;
            }else{
                if(chance<bad){
                    num=3;
                }
            }
        }

        return num;
    }

}
