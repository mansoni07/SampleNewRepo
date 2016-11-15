/**
 * HelloWorld_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HelloWorld;

public class HelloWorld_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.HelloWorld.HelloWorld_Service {

    public HelloWorld_ServiceLocator() {
    }


    public HelloWorld_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWorld_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWorldSOAP
    private java.lang.String HelloWorldSOAP_address = "http://www.example.org/";

    public java.lang.String getHelloWorldSOAPAddress() {
        return HelloWorldSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWorldSOAPWSDDServiceName = "HelloWorldSOAP";

    public java.lang.String getHelloWorldSOAPWSDDServiceName() {
        return HelloWorldSOAPWSDDServiceName;
    }

    public void setHelloWorldSOAPWSDDServiceName(java.lang.String name) {
        HelloWorldSOAPWSDDServiceName = name;
    }

    public org.example.www.HelloWorld.HelloWorld_PortType getHelloWorldSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWorldSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWorldSOAP(endpoint);
    }

    public org.example.www.HelloWorld.HelloWorld_PortType getHelloWorldSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.HelloWorld.HelloWorldSOAPStub _stub = new org.example.www.HelloWorld.HelloWorldSOAPStub(portAddress, this);
            _stub.setPortName(getHelloWorldSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWorldSOAPEndpointAddress(java.lang.String address) {
        HelloWorldSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.HelloWorld.HelloWorld_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.HelloWorld.HelloWorldSOAPStub _stub = new org.example.www.HelloWorld.HelloWorldSOAPStub(new java.net.URL(HelloWorldSOAP_address), this);
                _stub.setPortName(getHelloWorldSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWorldSOAP".equals(inputPortName)) {
            return getHelloWorldSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/HelloWorld/", "HelloWorld");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/HelloWorld/", "HelloWorldSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWorldSOAP".equals(portName)) {
            setHelloWorldSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
