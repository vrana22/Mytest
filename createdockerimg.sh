#!/bin/bash
IMAGE_NAME="dopsdockerimage"
echo "Start build ....."
docker build -t $IMAGE_NAME .
if [ $? != 0 ]
  then
    echo "ERROR:: Failed to create docker image"
    exit 100
fi
echo "build end"
