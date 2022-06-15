package polytec1_1;

public class class0615_5 { // class car
    String color;
    int speed;

    void upSpeed(int value){
        speed = speed + value;
    }

    void downSpeed(int value){
        speed = speed - value;
    }
}

class Sedan extends class0615_5{ // class0615_5 클래스 가져옴 / 상속받음 extends
    int seatNum;

    int getSeatNum(){       // public 전체 범위
        return seatNum;
    }
}

class Truck extends class0615_5{
    int capacity;

    int getCapacity(){
        return capacity;
    }
}

class Ex_01{ //public class 를 주려면? 교과서에는 public class 로 나와있음.!!

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan();
        Truck truck1 = new Truck();

        sedan1.upSpeed(300);
        truck1.upSpeed(100);

        sedan1.seatNum = 5;
        truck1.capacity = 50;

        System.out.println("승용차 속도는 " + sedan1.speed + "km, 좌석수는 " + sedan1.getSeatNum() + "개 입니다.");
        System.out.println("트럭 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCapacity() + "톤 입니다.");
    }
}
