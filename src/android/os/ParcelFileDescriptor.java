/*
 * This file is in PUBLIC DOMAIN. You can use it freely. No guarantee.
 */
package android.os;

import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;

/**
 * @author Fan Hongtao &ltfanhongtao@gmail.com&gt
 */
public class ParcelFileDescriptor implements Parcelable, Closeable {
    private final FileDescriptor mFd;
    
    /** {@hide} */
    public ParcelFileDescriptor(FileDescriptor fd) {
        this(fd, null);
    }

    /** {@hide} */
    public ParcelFileDescriptor(FileDescriptor fd, FileDescriptor commChannel) {
        if (fd == null) {
            throw new NullPointerException("FileDescriptor must not be null");
        }
        mFd = fd;
    }

    /**
     * Retrieve the actual FileDescriptor associated with this object.
     *
     * @return Returns the FileDescriptor associated with this object.
     */
    public FileDescriptor getFileDescriptor() {
        return null;
    }

    /* (non-Javadoc)
     * @see java.io.Closeable#close()
     */
    @Override
    public void close() throws IOException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see android.os.Parcelable#describeContents()
     */
    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see android.os.Parcelable#writeToParcel(android.os.Parcel, int)
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        
    }
}
