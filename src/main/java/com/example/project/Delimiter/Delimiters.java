package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String> delimiter = new ArrayList<String>();
        for (String str : tokens) {
            if (str.equals(openDel)) {delimiter.add(str);}
            if (str.equals(closeDel)) {delimiter.add(str);}
        }
        return delimiter;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(String[] delimiters) {
        /* to be implemented in part (b) */
        int open=0;
        int close=0;
        for (String str : delimiters) {
            if (str.equals(openDel)) {open++;}
            if (str.equals(closeDel)) {close++;}
        }
        return open==close;
    }
}
