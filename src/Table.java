import java.util.List;

/**
 * @author Sharon Hains
 */

public class Table {

    /**
     * guests at table
     */
    private List guestsAtTable;

    /**
     * number of chairs at table
     */
    private int tableSize;

    public List getGuestsAtTable() {
        return guestsAtTable;
    }

    public void setGuestsAtTable(List guestsAtTable) {
        this.guestsAtTable = guestsAtTable;
    }

    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }
}
