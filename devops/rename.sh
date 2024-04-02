#!/bin/bash

# # folders=$(ls -la)
for f in *
do
    if [ -d $f ]
    then
        echo $f
        mv $(ls $f) | awk -F. '{print $1"_"$2}'
    fi
done

# ls | grep -E "[0-9]{2}" | awk -F. '{print $1}'