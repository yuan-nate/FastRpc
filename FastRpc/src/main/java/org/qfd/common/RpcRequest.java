package org.qfd.common;

import java.io.Serializable;

public class RpcRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String interfaceName;  // e.g., "org.qfd.service.UserService"
    private String methodName;     // e.g., "getUser"
    private Class<?>[] paramTypes; // e.g., [int.class]
    private Object[] parameters;   // e.g., [1]

    // Standard constructor, getters, and setters
    public RpcRequest(String interfaceName, String methodName, Class<?>[] paramTypes, Object[] parameters) {
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.paramTypes = paramTypes;
        this.parameters = parameters;
    }

    public String getInterfaceName() { return interfaceName; }
    public String getMethodName() { return methodName; }
    public Class<?>[] getParamTypes() { return paramTypes; }
    public Object[] getParameters() { return parameters; }
}
