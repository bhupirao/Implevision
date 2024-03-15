import java.util.*;

class UndergroundSystem{

      public static int avgTime=60;


    static void checkIn(int id,String stationName,int t){
      
      if(cardId==id){

        if(station.equals(stationName) && time.equals(t)){
            System.out.print(stationName+" "+time+" "+id);
        }else{
            System.out.println("stationName is wrong");
        }


      }
      System.out.println("Id not found");

    }

    static void checkOut(int id,String stationName,int t){
   
      if(cardId==id){

        if(station.equals(stationName) && time.equals(t)){
            System.out.print(stationName+" "+time+" "+id);
            System.out.println("Check Out ");
        }else{
            System.out.println("stationName is wrong");
        }


      }
      System.out.println("Id not found");

    }

    static double getAverageTime(String startStation,String endStation){
  
           int t1=String.valueOf(startStation);
           int t2=String.valueOf(endStation);

           if(t2-t1<=60){
             
            return t2-t1;
           }

        return -1;
    }



}