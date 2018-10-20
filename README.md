### Git手册
#复制一个已创建的仓库:
$ git clone ssh://user@domain.com/repo.git

#创建一个新的本地仓库:
$ git init

### 创建远程连接并重命名
$git remote add ssm https://git.coding.net/sqeven/icmp.git
#推送本地文件
#git 分支版本强制推送
$git push -u origin master -f

### 本地修改
#显示工作路径下已修改的文件：
$ git status
#显示与上次提交版本文件的不同：
$ git diff
#将该路径下的所有文件添加到暂存区中：
$git add .
#将暂存区中的文件提交到本地资源库
$git commit -m "提交代码注释"
#将本地资源库中文件提交到远程分支上
$git push ssm master
#更新文件到本地
$git pull ssm master

# 搜索
从当前目录的所有文件中查找文本内容：
$ git grep "Hello"

### 提交历史
#从最新提交开始，显示所有的提交记录（显示hash， 作者信息，提交的标题和时间）：
$ git log
#显示所有提交（仅显示提交的hash和message）：
$ git log --oneline
#显示某个用户的所有提交：
$ git log --author="username"
#显示某个文件的所有修改：
$ git log -p <file>

### 分支与标签
#列出所有的分支：
$ git branch
#切换分支：
$ git checkout <branch>
#创建并切换到新分支(将本分支代码全部复制到创建分支上):
$ git checkout -b <branch>
#基于当前分支创建新分支：
$ git branch <new-branch>
#删除本地分支:
$ git branch -d <branch>
#给当前版本打标签：
$ git tag <tag-name>






