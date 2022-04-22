#!/bin/sh

VOLUME=$(pamixer --get-volume)
echo " ${VOLUME}%"
