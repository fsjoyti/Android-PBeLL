/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkZipProgress extends CkBaseProgress {
  private long swigCPtr;

  protected CkZipProgress(long cPtr, boolean cMemoryOwn) {
    super(chilkatJNI.CkZipProgress_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkZipProgress obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkZipProgress(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    chilkatJNI.CkZipProgress_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    chilkatJNI.CkZipProgress_change_ownership(this, swigCPtr, true);
  }

  public CkZipProgress() {
    this(chilkatJNI.new_CkZipProgress(), true);
    chilkatJNI.CkZipProgress_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean DirToBeAdded(String filePath) {
    return (getClass() == CkZipProgress.class) ? chilkatJNI.CkZipProgress_DirToBeAdded(swigCPtr, this, filePath) : chilkatJNI.CkZipProgress_DirToBeAddedSwigExplicitCkZipProgress(swigCPtr, this, filePath);
  }

  public boolean ToBeAdded(String filePath, long fileSize) {
    return (getClass() == CkZipProgress.class) ? chilkatJNI.CkZipProgress_ToBeAdded(swigCPtr, this, filePath, fileSize) : chilkatJNI.CkZipProgress_ToBeAddedSwigExplicitCkZipProgress(swigCPtr, this, filePath, fileSize);
  }

  public boolean FileAdded(String filePath, long fileSize) {
    return (getClass() == CkZipProgress.class) ? chilkatJNI.CkZipProgress_FileAdded(swigCPtr, this, filePath, fileSize) : chilkatJNI.CkZipProgress_FileAddedSwigExplicitCkZipProgress(swigCPtr, this, filePath, fileSize);
  }

  public boolean ToBeZipped(String filePath, long fileSize) {
    return (getClass() == CkZipProgress.class) ? chilkatJNI.CkZipProgress_ToBeZipped(swigCPtr, this, filePath, fileSize) : chilkatJNI.CkZipProgress_ToBeZippedSwigExplicitCkZipProgress(swigCPtr, this, filePath, fileSize);
  }

  public boolean FileZipped(String filePath, long fileSize, long compressedSize) {
    return (getClass() == CkZipProgress.class) ? chilkatJNI.CkZipProgress_FileZipped(swigCPtr, this, filePath, fileSize, compressedSize) : chilkatJNI.CkZipProgress_FileZippedSwigExplicitCkZipProgress(swigCPtr, this, filePath, fileSize, compressedSize);
  }

  public boolean ToBeUnzipped(String filePath, long compressedSize, long fileSize, boolean isDirectory) {
    return (getClass() == CkZipProgress.class) ? chilkatJNI.CkZipProgress_ToBeUnzipped(swigCPtr, this, filePath, compressedSize, fileSize, isDirectory) : chilkatJNI.CkZipProgress_ToBeUnzippedSwigExplicitCkZipProgress(swigCPtr, this, filePath, compressedSize, fileSize, isDirectory);
  }

  public boolean FileUnzipped(String filePath, long compressedSize, long fileSize, boolean isDirectory) {
    return (getClass() == CkZipProgress.class) ? chilkatJNI.CkZipProgress_FileUnzipped(swigCPtr, this, filePath, compressedSize, fileSize, isDirectory) : chilkatJNI.CkZipProgress_FileUnzippedSwigExplicitCkZipProgress(swigCPtr, this, filePath, compressedSize, fileSize, isDirectory);
  }

  public void SkippedForUnzip(String filePath, long compressedSize, long fileSize, boolean isDirectory) {
    if (getClass() == CkZipProgress.class) chilkatJNI.CkZipProgress_SkippedForUnzip(swigCPtr, this, filePath, compressedSize, fileSize, isDirectory); else chilkatJNI.CkZipProgress_SkippedForUnzipSwigExplicitCkZipProgress(swigCPtr, this, filePath, compressedSize, fileSize, isDirectory);
  }

  public void AddFilesBegin() {
    if (getClass() == CkZipProgress.class) chilkatJNI.CkZipProgress_AddFilesBegin(swigCPtr, this); else chilkatJNI.CkZipProgress_AddFilesBeginSwigExplicitCkZipProgress(swigCPtr, this);
  }

  public void AddFilesEnd() {
    if (getClass() == CkZipProgress.class) chilkatJNI.CkZipProgress_AddFilesEnd(swigCPtr, this); else chilkatJNI.CkZipProgress_AddFilesEndSwigExplicitCkZipProgress(swigCPtr, this);
  }

  public void WriteZipBegin() {
    if (getClass() == CkZipProgress.class) chilkatJNI.CkZipProgress_WriteZipBegin(swigCPtr, this); else chilkatJNI.CkZipProgress_WriteZipBeginSwigExplicitCkZipProgress(swigCPtr, this);
  }

  public void WriteZipEnd() {
    if (getClass() == CkZipProgress.class) chilkatJNI.CkZipProgress_WriteZipEnd(swigCPtr, this); else chilkatJNI.CkZipProgress_WriteZipEndSwigExplicitCkZipProgress(swigCPtr, this);
  }

  public void UnzipBegin() {
    if (getClass() == CkZipProgress.class) chilkatJNI.CkZipProgress_UnzipBegin(swigCPtr, this); else chilkatJNI.CkZipProgress_UnzipBeginSwigExplicitCkZipProgress(swigCPtr, this);
  }

  public void UnzipEnd() {
    if (getClass() == CkZipProgress.class) chilkatJNI.CkZipProgress_UnzipEnd(swigCPtr, this); else chilkatJNI.CkZipProgress_UnzipEndSwigExplicitCkZipProgress(swigCPtr, this);
  }

}