#!/usr/bin/env bash
# compile
g++ -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin com_baeldung_jni_HelloWorldJNI.cpp -o com_baeldung_jni_HelloWorldJNI.o
# install native lib
g++ -dynamiclib -o libnative.dylib com_baeldung_jni_HelloWorldJNI.o -lc