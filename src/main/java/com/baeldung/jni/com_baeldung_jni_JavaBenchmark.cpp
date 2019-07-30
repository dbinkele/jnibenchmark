#include "com_baeldung_jni_JavaBenchmark.h"
#include <iostream>


int numbers[100] = {[0 ... 99] = 5};
int pos = 0;
/*
 * Class:     com_baeldung_jni_HelloWorldJNI
 * Method:    passNumber
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT void JNICALL Java_com_baeldung_jni_JavaBenchmark_passNumber
  (JNIEnv * env, jobject thisObject, jint number){
    numbers[pos] = number;
    pos++;
}

/*
 * Class:     com_baeldung_jni_JavaBenchmark
 * Method:    sum
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_baeldung_jni_JavaBenchmark_sum
  (JNIEnv * env, jobject thisobject){
        int result = 0;
        for(int i = 0; i < pos; i++){
          result += numbers[i];
        }
        return result;
  }