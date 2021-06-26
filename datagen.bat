@echo off
title Data Generator
rmdir /Q /S src\generated\resources
gradlew.bat runData
PAUSE