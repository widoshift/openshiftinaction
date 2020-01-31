#!/bin/bash

graceful_shutdown () {

  echo "Caught SIGTERM! Gracefully shutting down now"
  i=0
  while :			# This is the same as "while true".
  do
      echo "Gracefully shutting down for $i seconds"
      sleep 1
      i=$[i+1]
  done

}

trap "graceful_shutdown" SIGTERM
echo "pid is $$"

i=0
while :			# This is the same as "while true".
do
    echo "Waiting for SIGTERM, sleeping for 5 seconds now..."
    sleep 5
    i=$[i+1]
done

graceful_shutdown () {

  echo "Caught SIGTERM! Gracefully shutting down now"
  i=0
  while :			# This is the same as "while true".
  do
      echo "Gracefully shutting down for $i seconds"
      sleep 1
      i=$[i+1]
  done

}
