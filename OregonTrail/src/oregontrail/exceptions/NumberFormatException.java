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
public class NumberFormatException extends Exception {

    public NumberFormatException() {
    }

    public NumberFormatException(String string) {
        super(string);
    }

    public NumberFormatException(Throwable thrwbl) {
        super(thrwbl);
    }

    public NumberFormatException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
