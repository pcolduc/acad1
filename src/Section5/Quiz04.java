package Section5;

public class Quiz04 {
    public static void main(String[] args) {
        //주차요금 정산기
        int hour = 5;
        boolean small = false;
        boolean dasbled = true;
        int fee =hour*4000;
        if (fee>30000){
            fee = 30000;
        }
        if(small || dasbled){
            fee /=2;

        }
        System.out.println(fee);
       }
    }

