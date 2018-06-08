public class TeamLeader implements IApprover{

    private IApprover nextApprover;

    @Override
    public Response handleRequest(Vacation vacation) {
        try{
            System.out.println(vacation.getLength());

            if(vacation.getLength()==1)
            {
                return Response.Approved;
            }
            else{
                return nextApprover.handleRequest(vacation);
            }
        }catch (NullPointerException ex)
        {
            return Response.Denied;
        }
    }

    @Override
    public void nextApprover(IApprover employee) {
        this.nextApprover = employee;
    }
}
