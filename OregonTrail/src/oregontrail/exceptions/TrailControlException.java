/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.exceptions;

/**
 *
 * @author spencer
 */
public class TrailControlException extends Exception {

    public TrailControlException() {
    }

    public TrailControlException(String string) {
        super(string);
    }

    public TrailControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public TrailControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public TrailControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
