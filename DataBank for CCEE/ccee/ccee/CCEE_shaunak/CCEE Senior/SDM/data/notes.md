# GIT classwork

```sh
git config --global user.email "nilesh@sunbeaminfo.com"
git config --global user.name "Nilesh Ghule"
git config --global core.editor vim

mkdir project1
cd project1

git init
# Creates empty local repository
ls -A

echo "This is first file." > file1.txt
git add file1.txt
git status
git commit -m "file1 created"

echo "This is second file." > file2.txt
echo "This is third file." > file3.txt
git status

git add file2.txt
git add file3.txt
git status

git commit -m "file2 & 3 created"
git status

git log
# Show all commit logs

echo "This is fourth file." > file4.txt
echo "This is fifth file." > file5.txt
echo "New line in file1." >> file1.txt
git status
git status -s
# Shows short git status
#   " M" -- Modified but not staged
#   "M " -- Modified and staged
#   "??" -- New file created but not staged
#   "A " -- New file created and staged
#   " D" -- Deleted but not staged
#   "D " -- Deleted and staged

git add *.txt
git status
git status -s

git commit
git status
git status -s

git log
git log -2
# Show last two logs

echo "This is sixth file." > file6.txt
vim hello.py

git add .
git status

git commit -m "file6 and hello py"
git log
git log --oneline
# Show oneliner logs -- Commit id (SHA) and Commit message

vim hello.py
# add few lines into the file

git diff hello.py
# Show changes hello.py since last commit.
git diff
# Show all changes since last commit.

git checkout hello.py
# Restore last committed version of hello.py
# Newer changes will be lost
```

