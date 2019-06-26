# Contributing to Pubs ERP System
Looking to contribute something to Pubs ERP System? 

**Here's to how you can help.**

Please take a moment to review this document in order to make the contribution process easy and effective for everyone 
involved.

Following these guidelines helps to communicate that you respect the time of the developers managing and developing this 
project. In return, they should reciprocate that respect in addressing your issue or assessing patches and features.

## Using the issue tracker
The [issue tracker](https://github.com/magharibihub/pubs_erp/issues) is the preferred channel for 
[bug reports](https://github.com/magharibihub/pubs_erp/issues/new?template=bug_report.md) and 
[features requests](https://github.com/magharibihub/pubs_erp/issues/new?template=feature_request.md&labels=feature) 
and submitting pull requests, but please respect the following restrictions:
* Please **do not** use the issue tracker for personal support requests.
* Please **do not** derail or troll issues. Keep the discussion on topic and respect the opinions of others.

## Issues and labels
Our bug tracker utilizes several labels to help organize and identify issues. Here's what they represent and how we use 
them:
- `bug` - Something isn't working
- `duplicate` - This issue or pull request already exists
- `enhancement` - New feature or request
- `good` - first issue Good for newcomers
- `help` - wanted Extra attention is needed
- `invalid` - This doesn't seem right
- `question` - Further information is requested
- `wontfix` - This will not be worked on

For a complete look at our labels, see the 
[pubs_erp labels page](https://github.com/magharibihub/pubs_erp/labels).


## Bug reports

A bug is a _demonstrable problem_ that is caused by the code in the repository. Good bug reports are extremely helpful, 
so thanks!

Guidelines for bug reports:

* *Validate your Code* &mdash; To ensure your problem isn't caused by a simple error in your own code.
* **Use the GitHub issue search** &mdash; Check if the issue has already been reported.
* **Check if the issue has been fixed** &mdash; Try to reproduce it using the latest `master` or development branch in 
the repository.

A good bug report shouldn't leave contributers needing to chase you up for more information. Please try to be as 
detailed as possible in your report. What is your environment? What steps will reproduce the issue? What platform(s) 
experience the problem? Do other platform(s) show the bug differently? What would you expect to be the outcome? All 
these details will help fix any potential bugs.

Example:
> Describe a clear and concise description of what the bug is.
>
> Provide steps to reproduce the behavior.
>
> Provide clear and concise description of what you expected to happen.
>
> If applicable, add screen-shots to help explain your problem.
>
> Any other information you want to share that is relevant to the issue being reported. This might include the lines of 
code that you have identified as causing the bug, and potential solutions (and your opinions on their merits).

## Feature requests
Feature requests are welcome. But take a moment to find out whether your idea fits with the scope and aims of the 
project. It's up to you to make a strong case to convince the project's developers of the merits of this feature. 
Please provide as much detail and context as possible.

## Pull requests
Good pull requests &mdash; *patches, improvements, new features* &mdash; are a fantastic help. They should remain focused in scope and 
avoid containing unrelated commits.

**Please ask first** before embarking on any significant pull request (e.g. implementing features, refactoring code), 
otherwise you risk spending a lot of time working on something that the project's developers might not want to merge 
into the project.

Please adhere to the coding guidelines and use them throughout the project (indentation, accurate comments, etc.) and 
any other requirements (such as test coverage).

**Be careful when working on the master branch directly!** Significantly, always try to make pull requests and work from a branch.

Adhering to the following process is the best way to get your work included in the project:
1. [Fork](https://help.github.com/articles/fork-a-repo/) the project, clone your fork, and configure the remotes:

   ```bash
   # Clone your fork of the repo into the current directory
   git clone https://github.com/<your-username>/pubs_erp.git
   # Navigate to the newly cloned directory
   cd pubs_erp
   ```
2. If you cloned a while ago, get the latest changes from master:

   ```bash
   git pull https://github.com/magharibihub/pubs_erp.git
   ```
3. Commit your changes in logical chunks. Please adhere to these 
[git commit message guidelines](https://tbaggery.com/2008/04/19/a-note-about-git-commit-messages.html) or your code is 
unlikely be merged into the main project. Use Git's 
[interactive rebase](https://help.github.com/articles/about-git-rebase/) feature to tidy up your commits before making 
them public.
4. [Open a Pull Request](https://help.github.com/articles/about-pull-requests/) with a clear title and description 
against the `master` branch.