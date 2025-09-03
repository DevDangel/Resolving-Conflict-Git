
# Resolving Git Conflicts

Understanding how to resolve Git conflicts is essential for any developer working in collaborative environments. Being proficient in version control and Git ensures smooth teamwork, minimizes errors, and helps maintain a clean project history. Proper conflict resolution skills are crucial for effective collaboration and project success.

This repository demonstrates how to resolve Git conflicts using two main methods:

## 1. Using the Merge Editor in Visual Studio Code
The Merge Editor in VS Code provides a visual interface to resolve conflicts. You can choose between:
- Accept Current Change
- Accept Incoming Change
- Accept Both Changes
- Compare changes side by side

Steps:
1. Open the conflicted file in VS Code.
2. Use the Merge Editor options to select or combine changes.
3. Save the file and mark it as resolved.
4. Stage and commit the resolution.


## 2. Using the Command Line (Console)
The command line allows you to resolve conflicts manually:
1. Run `git status` to see conflicted files.
2. Use `cat <filename>` to display the contents of the conflicted file and view the conflict markers:
	```cmd
	cat Main.java
	```
	Look for conflict markers:
	```
	<<<<<<< HEAD
	Your changes
	=======
	Incoming changes
	>>>>>>> branch-name
	```

3. If you want to resolve the conflict by keeping only one side, you can use:
	 - For the incoming changes (theirs):
		 ```cmd
		 git checkout --theirs Main.java
		 ```
	 - For your current changes (ours/HEAD):
		 ```cmd
		 git checkout --ours Main.java
		 ```
	 Then stage and commit:
	 ```cmd
	 git add Main.java
	 git commit -m "Resolved conflict by choosing theirs/ours"
	 ```
4. Alternatively, you can manually edit the file to combine both changes as needed, then save and commit as shown above.


5. To automatically remove only the conflict markers from the file (leaving all code), you can use:
	```cmd
	sed -i '/<<<<<<< HEAD/d; /=======/d; />>>>>>> /d' Main.java
	```
	This will delete the lines containing conflict markers, but you still need to review the code to ensure it is correct before committing.


## Tips
- Always review both changes before resolving.
- Use `git log` and `git diff` to understand the context.
- You can use `git mergetool` to open a visual merge tool from the console (requires setup).

---

## Common Git Commands and Their Meaning


Here is a list of common Git commands and their explanations:
- `git bisect`: Find the commit that introduced a bug using binary search.

- `git commit -i HEAD`: Interactively choose changes from the index (staging area) to commit. (Note: Usually used as `git commit -i` or with `git commit --interactive`)
- `pick`: Used in interactive rebase (`git rebase -i`). Means to use/apply the commit as-is in the new history.

- `git init`: Initialize a new Git repository.
- `git clone <url>`: Copy a remote repository to your local machine.
- `git status`: Show the status of changes as untracked, modified, or staged.
- `git add <file>`: Stage changes for the next commit.
- `git add .`: Stage all changes in the current directory.
- `git commit -m "message"`: Commit staged changes with a message.
- `git push`: Upload local commits to the remote repository.
- `git push -u origin <branch>`: Push a branch and set upstream tracking.
- `git pull`: Fetch and merge changes from the remote repository.
- `git fetch`: Download changes from the remote repository without merging.
- `git merge <branch>`: Merge another branch into your current branch.
- `git branch`: List all local branches.
- `git branch <name>`: Create a new branch.
- `git checkout <branch>`: Switch to another branch.
- `git checkout -b <branch>`: Create and switch to a new branch.
- `git log`: Show the commit history.
- `git diff`: Show changes between commits, branches, or files.
- `git reset <file>`: Unstage a file.
- `git rm <file>`: Remove a file from the working directory and staging area.
- `git stash`: Temporarily save changes that are not ready to commit.
- `git stash pop`: Reapply stashed changes.
- `git remote -v`: Show remote repository URLs.
- `git tag`: List tags in the repository.
- `git tag <name>`: Create a new tag.
- `git rebase <branch>`: Reapply commits on top of another base branch.
- `git cherry-pick <commit>`: Apply a specific commit from another branch.
- `git show <commit>`: Show information about a specific commit.
- `git config`: Configure Git settings.
- `git mv <old> <new>`: Rename or move a file.
- `git clean -f`: Remove untracked files from the working directory.
- `git blame <file>`: Show who changed each line in a file.
- `git shortlog`: Summarize `git log` output.
- `git revert <commit>`: Create a new commit that undoes changes from a previous commit.
- `git archive`: Create an archive of files from a repository.
- `git bisect`: Find the commit that introduced a bug using binary search.

---
Follow the examples and steps in this repository to learn both ways to resolve conflicts in Git.

