@echo off
REM Bạn hãy comment toàn bộ file của bạn trước khi commit code nhé ^^

REM Pull new changes from the remote repository
git pull origin feature/auteam

REM Stage all changes
git add src/[Tên file cần commit]

REM Commit changes with a message
REM git commit -m "[Your name]: [Your message]"
git commit -m "Vincent: Bài tập buổi 02"

REM Push changes to the remote repository
git push origin feature/auteam

pause