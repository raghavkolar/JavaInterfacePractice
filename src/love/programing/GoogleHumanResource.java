package love.programing;

public class GoogleHumanResource implements HumanResourceAgrement {
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

        System.out.println("Apply the SSN as soon a Worker accepted Contract");

    }
}
