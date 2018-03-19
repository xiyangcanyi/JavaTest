package shiyan3.stu.Seveth;

public class Village{
    static double waterAmount;
    int peopleNumber;
    String name;
    double setWateramount(String name,double waterAmount,int peopleNumber){
        this.name=name;
        this.waterAmount=waterAmount;
        this.peopleNumber=peopleNumber;
        return peopleNumber;
    }
    void  show(){
        System.out.println("庄名："+name);
        System.out.println("剩余水量："+waterAmount);
        System.out.println("庄的人数："+peopleNumber);
    }



}
