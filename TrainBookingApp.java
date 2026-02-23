class TrainReservation{
    int total_berths=12;
    synchronized void bookBerth(int berths){
        if(total_berths>=berths){
            System.out.println(berths+" berths booked successfully :)");
            total_berths=total_berths-berths;
            System.out.println("Berths left: "+total_berths);
        }
        else{
            System.out.println("Booking failed :(");
            System.out.println("Berths left: "+total_berths);
        }
    }
}

class TrainBookingApp extends Thread{
    static TrainReservation res=new TrainReservation();
    int berths;
    public void run(){
        res.bookBerth(berths);
    }
    public static void main(String[] args){
        TrainBookingApp passenger1=new TrainBookingApp();
        passenger1.berths=6;
        passenger1.start();
        TrainBookingApp passenger2=new TrainBookingApp();
        passenger2.berths=6;
        passenger2.start();
    }

}
