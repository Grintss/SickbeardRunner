/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\ANDROID\\workspace\\SickbeardRunner\\aidl\\com\\emtronics\\pythoncommon\\PythonServiceListener.aidl
 */
package com.emtronics.pythoncommon;
public interface PythonServiceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.emtronics.pythoncommon.PythonServiceListener
{
private static final java.lang.String DESCRIPTOR = "com.emtronics.pythoncommon.PythonServiceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.emtronics.pythoncommon.PythonServiceListener interface,
 * generating a proxy if needed.
 */
public static com.emtronics.pythoncommon.PythonServiceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.emtronics.pythoncommon.PythonServiceListener))) {
return ((com.emtronics.pythoncommon.PythonServiceListener)iin);
}
return new com.emtronics.pythoncommon.PythonServiceListener.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_updateLog:
{
data.enforceInterface(DESCRIPTOR);
this.updateLog();
reply.writeNoException();
return true;
}
case TRANSACTION_updateMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.updateMessage(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.emtronics.pythoncommon.PythonServiceListener
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void updateLog() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateLog, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void updateMessage(java.lang.String msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(msg);
mRemote.transact(Stub.TRANSACTION_updateMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_updateLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_updateMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void updateLog() throws android.os.RemoteException;
public void updateMessage(java.lang.String msg) throws android.os.RemoteException;
}
