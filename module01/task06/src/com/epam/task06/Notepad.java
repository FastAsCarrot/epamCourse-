package com.epam.task06;



/**
 * Created by vrama on 28.02.2016.
 */
public class Notepad {
    /** @javadoc
     *  Creates new records in notepad and put them in array of the fixed size (1000 records by default)
     *  @method addRecord() (as it follows by name) creates new record and adds it to the array
     *  @method editRecord() adds a new value to the existing record, which number received from @param numberOfRecord
     *  @method deleteRecord() deletes a record of pointed number
     *  @method viewRecords printing all records in notepad
     *  @author Filipp Pisarev
    */
    private Record[] records = new Record[1000];

        public Notepad() {
    }

    public void addRecord(String value) {

        int recordNum = 0;

        if (records[0] == null) {
            records[0] = new Record("Record0: " + value);
        } else {
            for (int i = 0; (records[i] != null) && (i < records.length - 1); i++) {
                if (records[i+1] == null) {
                    recordNum = i+1;
                    records[i + 1] = new Record("Record" + recordNum + ": " + value);
                    break;
                }
            }
        }
    }

    public void editRecord(int numberOfRecord, String newValue) {
        if (records[numberOfRecord] != null) {
            records[numberOfRecord].value = "Record" + numberOfRecord + ": " + newValue;
        } else {
            System.out.println("\nWARNING: Record" + numberOfRecord + " is not exist !!!\n");
        }

    }

    public void deleteRecord(int numberOfRecord) {
        {
                records[numberOfRecord] = null;
        }
    }

    public void viewRecords() {
        for (int i = 0; i < records.length; i++) {
            if (records[i] != null) {
                System.out.println(records[i].value);
            }
        }
    }
}
