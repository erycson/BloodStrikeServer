package common.net;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("serial")
public class APC implements Serializable {
	private String functionName;
	private Object[] parameters = new Object[] {};
	
	public APC() { }

    public APC(String functionName) {
        this.functionName = functionName;
    }
    
	public String getFunctionName() {
		return functionName;
	}
	
	public Object[] getParameters() {
		return parameters;
	}
	
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	
	public void setParameters(Object[] parameters) {
		this.parameters = parameters;
	}
    
    public void addParameter(Object parameter) {
        List<Object> list = new ArrayList<Object>(Arrays.asList(this.parameters));
        list.add(parameter);
        this.parameters = list.toArray();
    }
    
    public APC clone() {
        APC c = new APC();
        c.setFunctionName(functionName);
        c.setParameters(parameters);
        return c;
    }

    @Override
    public String toString() {
        return "APC [functionName=" + functionName + ", parameters=" + parameters + "]";
    }
}
