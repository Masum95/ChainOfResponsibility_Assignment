public class ProjectManager implements IApprover{


    private IApprover nextApprover;

    @Override
    public Response handleRequest(Vacation vacation) {
        try{
            if(vacation.getLength()<=3)
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
