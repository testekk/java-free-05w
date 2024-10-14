#!/bin/bash
# Thực hiện cấp quyền thực thi cho file này bằng lệnh chmod +x gitCommitMac.sh
# Pull new changes from the remote repository
git pull origin feature/duybg

# Stage all changes
# git add [Your file path] ví dụ git add src/VincentLoopExercise.java
git add gitCommitMac.sh

# Commit changes with a message
# git commit -m "[Your name]: [Your message]"
git commit -m "Vincent: Add Git Commit Mac"

# Push changes to the remote repository
git push origin feature/duybg
