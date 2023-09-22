```
#第一次在github上创建项目，本地初始化并创建远程连接
$ echo "hello" >> README.md
$ git init 
$ git add README.md
$ git commit -m "first commit"
$ git branch -M master
$ git remote add origin git@github.com:qicongmark/jeeweixin.git
$ git pull origin master
```

```
#对于github上已有项目，直接克隆远程代码到本地
git clone git@github.com:qicongmark/learnGit.git
```

```
#提交代码
$ git add . 
$ git commit -m "qicong"
$ git push origin master
```

```
#从远程获取最新版本并merge（合并）到本地
$ git pull
```

```
#舍弃本地代码,远端版本覆盖本地版本（慎用）
$ git fetch --all 
$ git reset --hard origin/master
$ git fetch
```

```
#保留本地的更改,中止合并,重新拉取
$ git merge --abort
$ git reset --merge
$ git pull
```

```
git init                    #初始化创建本地仓库

git --version               #查看git版本

git remote -v               #查看远程仓库

git add                     #项目放入本地的缓存区

git commit -m               #提交到仓库，并带注释

git status                  #查看文件状态

git log                     #查看日志

git relog                   #当使用reset回到之前的版本时，查看该版本之后的版本

git reset --hard            #标识码可以回到标识码所标记的版本

git checkout --   文件名     #撤销缓冲区中的项目,需要修改之后重新提交到缓冲区

git clone url               #从服务器将项目拷贝到本地

git push origin master      #将本地仓库中的文件提交到服务器的master的分支上

git pull                    #将服务器中的项目拉下来

git pull origin master      #将服务器中的项目拉下来

git remote add origin url   #将本地仓库与远程仓库对接

git push -u origin master   #对接之后将项目提交到远程仓库

git fetch origin master     #从远程获取最新版本到本地，不会merge

git merge origin/master     #合并

git branch 分支名            #在本地创建分支

git branch                  #查看当前所处分支

git branch -d bug_xzx       #删除本地分支

git push origin --delete bug_xz  #删除远程分支

git checkout 分支名          #切换分支

git merge 分支名             #将分支合并入master分支

git push origin master      #将项目提交到master分支

git rm  文件名               #删除文件

git branch -D  分支名        #删除本地某个分支

git remote remove orign     #删除现有的origin

git remote rename origin 新名称  #更新现有的origin名称
```





