/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/barbara/jaime/ccnx-0.8.1/android/CCNx-Android-Lib/src/org/ccnx/android/ccnlib/ICCNxService.aidl
 */
package org.ccnx.android.ccnlib;
public interface ICCNxService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.ccnx.android.ccnlib.ICCNxService
{
private static final java.lang.String DESCRIPTOR = "org.ccnx.android.ccnlib.ICCNxService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.ccnx.android.ccnlib.ICCNxService interface,
 * generating a proxy if needed.
 */
public static org.ccnx.android.ccnlib.ICCNxService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.ccnx.android.ccnlib.ICCNxService))) {
return ((org.ccnx.android.ccnlib.ICCNxService)iin);
}
return new org.ccnx.android.ccnlib.ICCNxService.Stub.Proxy(obj);
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
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_registerStatusCallback:
{
data.enforceInterface(DESCRIPTOR);
org.ccnx.android.ccnlib.IStatusCallback _arg0;
_arg0 = org.ccnx.android.ccnlib.IStatusCallback.Stub.asInterface(data.readStrongBinder());
this.registerStatusCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterStatusCallback:
{
data.enforceInterface(DESCRIPTOR);
org.ccnx.android.ccnlib.IStatusCallback _arg0;
_arg0 = org.ccnx.android.ccnlib.IStatusCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterStatusCallback(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.ccnx.android.ccnlib.ICCNxService
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
@Override public int getStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerStatusCallback(org.ccnx.android.ccnlib.IStatusCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerStatusCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterStatusCallback(org.ccnx.android.ccnlib.IStatusCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterStatusCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerStatusCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterStatusCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public int getStatus() throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public void registerStatusCallback(org.ccnx.android.ccnlib.IStatusCallback cb) throws android.os.RemoteException;
public void unregisterStatusCallback(org.ccnx.android.ccnlib.IStatusCallback cb) throws android.os.RemoteException;
}
