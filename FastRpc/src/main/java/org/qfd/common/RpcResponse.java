package org.qfd.common;

import java.io.Serializable;

public class RpcResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object result;    // The object returned by the real method
    private Exception exception; // Populated if the real method crashed

    public RpcResponse(Object result, Exception exception) {
        this.result = result;
        this.exception = exception;
    }

    public Object getResult() { return result; }
    public Exception getException() { return exception; }
}
