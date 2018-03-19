package shiyan3.stu.Second;

public class Vehicle {
    double speed;
    int power;

    void speedUp(int s) {
        speed += s;
    }

    void speedDown(int d) {
        double m = speed - d;
    }

    void setPower(int p) {
        power = p;
    }

    double getPower() {

        return power;
    }

    double getSpeed(){
        return speed;
 }
 double brake(){
       return  speed=0;
 }
}
