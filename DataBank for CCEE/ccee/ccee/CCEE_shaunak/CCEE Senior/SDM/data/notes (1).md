## GIT - Basic Workflow

```sh
mkdir project2

git init

git checkout -b main

echo "first file" > file1.txt
git add .
git commit -m "file1"
git log --oneline

echo "second file" > file2.txt
echo "third file" > file3.txt
echo "first file -- new line" >> file1.txt

git add file2.txt
git add file3.txt
git status

git reset
# Unstage files added into staging area -- file2.txt and file3.txt

git reset --hard
# Checkout all the changes from last commit
# New files in working directory are not modified or deleted
```

## GIT - Branching (Local repo)

```sh
git log

git log --oneline
# ae4d283 (HEAD -> main) file1

git add .
git commit -m "add"
git log --oneline

git branch branch1
git log --oneline
git checkout branch1

cp demo1.py demo2.py
vim demo2.py
git add .
git commit -m "subtract"

git add .
git commit -m "subtract fixed"

vim demo2.py
git add .
git commit -m "multiply"
git log --oneline

git checkout main
git log --oneline

git checkout branch1
git log --oneline

git checkout main
cp demo1.py demo3.py
vim demo3.py
git add .
git commit -m "divide"
git log --oneline

git log --all --oneline --decorate --graph

git checkout -b branch2
# create new branch "branch2" and checkout it
git log --oneline

vim demo4.py
# create new file demo4.py -- rect area
git add .
git commit -m "rect area"
# commit
git log --oneline

vim demo4.py
# demo4.py -- rect peri
git add .
git commit -m "rect peri"
# commit
git log --oneline

git log --all --oneline --decorate --graph
sudo apt install git-gui
gitk --all

git branch
# show list of all branches
# * represent  current branch

git checkout main
git merge branch1
git log --all --oneline --decorate --graph
gitk --all
```


## GITHUB (Single branch)

* https://github.com/nilesh-g/project3

```sh
cd dev1

git clone https://github.com/nilesh-g/project3.git

cd project3

ls -a

vim .gitignore
# observe file contents and exit
cat README.md

vim demo1.py
# create new file in working dir
git add .
# add file into staging area
git commit -m "demo1"
# commit file into local repo
git push origin main
# push file on remote repo
# username: git-username (nilesh-g)
# password: git classic token

cd ../../dev2

git clone https://github.com/nilesh-g/project3.git

cd project3
ls -a

vim demo2.py
git add .
git commit -m "demo2"
git push

cd ../../dev1
cd project3
ls -a
git pull origin main
ls -a
```

## GIT Branching -- Merge Requests on GitHub

```sh
# create an empty project on github -- name = project2

# go to "project2" directory
git checkout main

git remote -v

git remote add origin git@github.com:nilesh-g/project2.git

git remote -v

git push -u origin main
# upload main branch on github repo.

git branch

git push --all
# upload all branches on github repo.

git checkout -b branch3

echo "hello branch3" > file3.txt
git add .
git commit -m "file3"

git log --oneline

git push -u origin branch3
# upload new branch

# on gitub.com, compare the changes and create pull request.
# then merge request

# on local repo, go to main branch and pull changes
git checkout main
git pull
```

