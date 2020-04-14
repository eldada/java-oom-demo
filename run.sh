#!/usr/bin/env bash

## Compile GenerateOOM.java and run it.
## This script assumes you have java and javac in your PATH.

javac GenerateOOM.java || exit 1

java -cp . -Xmx32m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./ GenerateOOM
