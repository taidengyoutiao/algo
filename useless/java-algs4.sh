#!/bin/bash

# this must match the install directory
LIFT_LIB="/usr/local/lift/lib"

# sets the path to the textbook libraries
CLASSPATH=".:${LIFT_LIB}/algs4.jar"

# execute on Windows/Linux using "java" but on OS X using "java_home -exec java"
JAVA="java"
if [ -f /usr/libexec/java_home ]; then
    JAVA="/usr/libexec/java_home -exec java"
fi

# executes with the textbook libraries in the classpath
$JAVA -cp "${CLASSPATH}" "$@"