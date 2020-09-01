package level8;

import java.util.Date;

public class Data {
    public static void main(String[] args) throws InterruptedException {
        //получение новой даты
        Date data=new Date();
        System.out.println(data);

        //разница между 2 датами
        Date dataOne= new Date();
        Thread.sleep(3000);
        Date dataTwo=new Date();
        long msDelay=dataTwo.getTime()-dataOne.getTime();
        System.out.println(msDelay);

        //наступило ли уже некоторое время
        Date data3=new Date();
        long endTime = data3.getTime()+5000;
        Date data4=new Date(endTime);

        Thread.sleep(6000);
        Date currentTime=new Date();
        if(currentTime.after(data4)){
            System.out.println("end time");
        }

        //сколько прошло времени с начала дня
        Date data5=new Date();
        double hour=data5.getHours();
        double minute=data5.getMinutes();
        double second=data5.getSeconds();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

    }
}
