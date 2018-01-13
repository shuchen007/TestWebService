/**
 * HelloWorld_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package HelloWorldServer;

public interface HelloWorld_PortType extends java.rmi.Remote {
    public java.lang.String testParams1(java.lang.String x1) throws java.rmi.RemoteException;
    public java.lang.String testParams2(java.lang.String x1, java.lang.String x2) throws java.rmi.RemoteException;
    public java.lang.String testParams0() throws java.rmi.RemoteException;
    public java.lang.String testParams3(java.lang.String x1, java.lang.String x2, java.lang.String x3) throws java.rmi.RemoteException;
}
