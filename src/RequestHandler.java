public class RequestHandler {

    private IApprover nextApprover;

    public RequestHandler() {

        createChain();

    }

    public Response applyForVacation(Vacation vacation)
    {
        return nextApprover.handleRequest(vacation);
    }

    private void createChain() {

        IApprover approver1 = new TeamLeader();
        IApprover approver2 = new ProjectManager();
        IApprover approver3 = new ResourceManager();

        approver1.nextApprover(approver2);
        approver2.nextApprover(approver3);

        nextApprover = approver1;
    }

}
