@echo off
title Deploying EZ.JWAF Exception
call msg info "[INFO] Deploying EZ.JWAF Exception" & echo.

set BASEDIR=%~sdp0

pushd %BASEDIR%\..\src\exception
  call mvn clean deploy -DperformTest=true -DperformSource=true -DperformDeploy=true
popd

call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 

pause