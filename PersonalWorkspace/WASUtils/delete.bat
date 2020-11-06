echo off
title = Essence CTT QUA
mode con:cols=115 lines=20

set datetimef=%date:~-4%%date:~3,2%%date:~0,2%_%time:~0,2%%time:~3,2%%time:~6,2%
echo %datetimef%

cd ..\logs\

IF EXIST server1 (
zip -r server1_%datetimef%.zip server1
rmdir /s /q server1
mkdir server1
) ELSE (
mkdir server1
)

IF EXIST ffdc (
rmdir /s /q ffdc
mkdir ffdc
) 

cd ..\

IF EXIST temp (
rmdir /s /q temp
mkdir temp
) 

IF EXIST tranlog (
rmdir /s /q tranlog
mkdir tranlog
) 

IF EXIST wstemp (
rmdir /s /q wstemp
mkdir wstemp
) 

cd bin\
cls

