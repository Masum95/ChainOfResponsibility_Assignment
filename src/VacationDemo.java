public class VacationDemo {

    public static void main(String[] args) {

        Vacation vacation = new Vacation("07/02/2018","11/02/2018");
        RequestHandler requestHandler = new RequestHandler();
        Response response = requestHandler.applyForVacation(vacation);

        switch (response)
        {
            case Approved:
                System.out.println("Congratutaions!!! Your vacation has been granted \n Carpe Diem");
                break;
            case Denied:
                System.out.println("Sorry! Request couldn't been granted");
                break;
        }


    }
}
