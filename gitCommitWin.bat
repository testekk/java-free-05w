@echo off
REM Bạn hãy comment toàn bộ file của bạn trước khi commit code nhé ^^

REM Pull new changes from the remote repository
git pull origin feature/20241014

REM Stage all changes
git add src/lesson01/Zoe_Exercise.java

REM Commit changes with a message
REM git commit -m "[Your name]: [Your message]"
git commit -m "Zoe: Bài tập buổi 01"

REM Push changes to the remote repository
git push origin feature/20241014

pause