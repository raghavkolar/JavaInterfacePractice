package love.programing;

public class AmazonHumanResource implements HumanResourceAgrement {
    @Override
    public String getLeaveRequest(String iD) {
        return null;
    }

    @Override
    public float[] getWorkersSlary() {
        return new float[0];
    }

    @Override
    public void applyForSocialSecurity() {

        System.out.println("Apply for SSN after worker starts working");

    }
}
