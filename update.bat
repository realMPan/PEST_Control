@echo off
echo Publish
call gradlew.bat publish
echo Copy
Xcopy /E /y .\\build\\repos\\releases\\com\\PESTControl .\\pestControl\\repos\\releases\\com\\PESTControl
