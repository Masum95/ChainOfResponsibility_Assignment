public interface IApprover {


    void nextApprover(IApprover employee);
    Response handleRequest(Vacation vacation);

}
