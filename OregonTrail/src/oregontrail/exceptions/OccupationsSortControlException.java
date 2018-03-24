/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.exceptions;

/**
 *
 * @author Angie
 */
public class OccupationsSortControlException extends Exception{

    public OccupationsSortControlException() {
    }

    public OccupationsSortControlException(String string) {
        super(string);
    }

    public OccupationsSortControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public OccupationsSortControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public OccupationsSortControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
