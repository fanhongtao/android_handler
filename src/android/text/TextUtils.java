/*
 * This file is in PUBLIC DOMAIN. You can use it freely. No guarantee.
 */
package android.text;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Fan Hongtao &ltfanhongtao@gmail.com&gt
 */
public class TextUtils {
    /**
     * Flatten a CharSequence and whatever styles can be copied across processes
     * into the parcel.
     */
    public static void writeToParcel(CharSequence cs, Parcel p,
            int parcelableFlags) {
        //if (cs instanceof Spanned) {} else {
            p.writeInt(1);
            if (cs != null) {
                p.writeString(cs.toString());
            } else {
                p.writeString(null);
            }
        //}
    }
    
    public static final Parcelable.Creator<CharSequence> CHAR_SEQUENCE_CREATOR
        = new Parcelable.Creator<CharSequence>() {
        /**
         * Read and return a new CharSequence, possibly with styles,
         * from the parcel.
         */
        public CharSequence createFromParcel(Parcel p) {
            int kind = p.readInt();
        
            String string = p.readString();
            if (string == null) {
                return null;
            }
        
            if (kind == 1) {
                return string;
            }
        
           
            return string;
        }
    
        public CharSequence[] newArray(int size)
        {
            return new CharSequence[size];
        }
    };
}
