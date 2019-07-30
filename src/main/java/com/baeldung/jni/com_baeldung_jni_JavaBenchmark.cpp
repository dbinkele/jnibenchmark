#include "com_baeldung_jni_JavaBenchmark.h"
#include <iostream>

/*
 * Class:     com_baeldung_jni_HelloWorldJNI
 * Method:    passNumber
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT void JNICALL Java_com_baeldung_jni_JavaBenchmark_passNumber
  (JNIEnv * env, jobject thisObject, jint number){
    numbers[pos] = number;
    std::cout << pos <<"C++: The numbers received are : " << number << std::endl;
}