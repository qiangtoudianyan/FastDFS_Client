package com.github.tobato.fastdfs.cmd.mark;

/**
 * 映射例外
 * 
 * @author wuyf
 *
 */
public class FdfsColumnMapException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1336200127024129847L;

    protected FdfsColumnMapException() {
    }

    protected FdfsColumnMapException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    protected FdfsColumnMapException(String message, Throwable cause) {
        super(message, cause);
    }

    protected FdfsColumnMapException(String message) {
        super(message);
    }

    protected FdfsColumnMapException(Throwable cause) {
        super(cause);
    }

}
