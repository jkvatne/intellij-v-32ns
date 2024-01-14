call git pull
call .\gradlew.bat buildPlugin
call del "C:\Program Files\JetBrains\CLion 2023.1.5\plugins\Vlang\lib\vlang.jar"
call mkdir "C:\Program Files\JetBrains\CLion 2023.1.5\plugins\Vlang\lib"
call copy "E:\Tools\VLang\intellij-v\build\libs\IntelliJ V-0.0.1-beta.4.jar" "C:\Program Files\JetBrains\CLion 2023.1.5\plugins\Vlang\lib\vlang.jar"