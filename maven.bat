set projectLocation=/var/lib/jenkins/workspace/girprojec

cd %projectLocation%

java org.testng.TestNG %projectLocation%\testng.xml

pause
