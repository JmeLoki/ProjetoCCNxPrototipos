LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := CCNxMule1
LOCAL_SRC_FILES := CCNxMule1.cpp

include $(BUILD_SHARED_LIBRARY)
