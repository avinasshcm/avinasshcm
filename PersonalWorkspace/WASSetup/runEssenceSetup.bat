echo off
cls

SET ConfigFile=WASConfigDynamic.properties
For /F "tokens=1,2 delims==; eol=;" %%A IN (%ConfigFile%) DO SET %%A=%%B

set ws_ant=%profilePath%/bin/ws_ant.bat

echo Using ant from %ws_ant%

%ws_ant% -f wasExecutionScript.xml

rem Following option with -d is for ant debugging
rem %ws_ant% -d -f interfaceSetup.xml