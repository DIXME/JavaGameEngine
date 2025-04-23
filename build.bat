REM this script builds all files that start with the file extention .class and tunrs them in to a .class file with javac
REM then it goes into the out folder and executes the main file

@echo off
cls
echo Building...
setlocal

set "EXT=.java"

for %%F in (*%EXT%) do (
    javac -d out %%~fF
)

endlocal
echo Done!
pause
cls
echo "Would You Like To Run(y/n)? "
