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

#更新与发布
#列出当前配置的远程端：
$ git remote -v 
#显示远程端的信息（<remote> 是git路径）：
$ git remote show <remote>
#添加新的远程端（<remote> <url> 前者是重命名提交名称 后者是路径）：
$ git remote add <remote> <url>
#下载远程端版本，但不合并到HEAD中：
$ git fetch <remote>
#下载远程端版本，并自动与HEAD版本合并：
$ git remote pull <remote> <url>
#将远程端版本合并到本地版本中：
$ git pull ssm master
#将本地版本发布到远程端：
$ git push ssm <branch>
#删除远程端分支：
$ git push <remote> :<branch> (since Git v1.5.0)
或
git push <remote> --delete <branch> (since Git v1.7.0)
#发布标签:
$ git push --tags

### 合并与重置
#合并
$ git merge <branch>
#将HEAD重置到指定的版本，并抛弃该版本之后的所有修改：
$ git reset --hard <commit>
#将HEAD重置到上一次提交的版本，并保留未提交的本地修改：
$ git reset --keep <commit>
#将HEAD重置到上一次提交的版本，并将之后的修改标记为未添加到缓存区的修改：
$ git reset <commit>
#重置一个提交（通过创建一个截然不同的新提交）
$ git revert <commit>


