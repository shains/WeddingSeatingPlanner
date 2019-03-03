import java.util.List;

/**
 * @author Sharon Hains
 */

public class Guest {

    /**
     * Name of guest
     */
    private String name;

    /**
     * is guesting attending {Confirmed = 0, Expected = 1, Not coming = 0}
     */
    private int attendingStatus;

    /**
     *  Does the guest have a plus one
     */
    private boolean plusOne;

    /**
     * other guests the guest should sit with
     */
    private List mustSitWith;

    /**
     * people guest cannot sit with
     */
    private List cannotSitWith;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPlusOne() {
        return plusOne;
    }

    public void setPlusOne(boolean plusOne) {
        this.plusOne = plusOne;
    }

    public List getMustSitWith() {
        return mustSitWith;
    }

    public void setMustSitWith(List mustSitWith) {
        this.mustSitWith = mustSitWith;
    }

    public List getCannotSitWith() {
        return cannotSitWith;
    }

    public void setCannotSitWith(List cannotSitWith) {
        this.cannotSitWith = cannotSitWith;
    }

    public int getAttendingStatus() {
        return attendingStatus;
    }

    public void setAttendingStatus(int attendingStatus) {
        this.attendingStatus = attendingStatus;
    }
}
