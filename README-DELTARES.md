# Introduction

This repository is a fork of the geonetwork repository.
Deltares specific development is done on the 3.0.x-deltares branch which is based on the 3.0.x geonetwork branch.

# Installation

git clone https://github.com/openearth/core-geonetwork.git
Add all submodules (geoserver, bootstrap):

git submodule update --init --recursive

# Synching with the forked 3.0.x-deltares branch 

Make sure your on the 3.0.x-deltares branch

$ git branch
* 3.0.x-deltares

Check the remotes:

$ git remote -v
origin  https://github.com/openearth/core-geonetwork.git (fetch)
origin  https://github.com/openearth/core-geonetwork.git (push)

Getting the latest changes of 3.0.x-deltares branch

$ git pull


#Synching with the upstream and rebasing with 3.0.x-deltares

Getting the Deltares branch in synch with geonetwork consists of 2 steps:

	- fetching upstream changes of the 3.0.x branch of geonetwork.
	- rebasing the 3.0.x-deltares branch.


If not following the upstream, add them:

$ git remote add upstream https://github.com/geonetwork/core-geonetwork.git

The should be visible now:

$ git remote -v
origin  https://github.com/openearth/core-geonetwork.git (fetch)
origin  https://github.com/openearth/core-geonetwork.git (push)
upstream        https://github.com/geonetwork/core-geonetwork.git (fetch)
upstream        https://github.com/geonetwork/core-geonetwork.git (push)


Now fetch the upstream changes.

$ git fetch upstream
remote: Counting objects: 763, done.
remote: Compressing objects: 100% (293/293), done.
Receiving objects: 100% (763/763), 363.64 KiB | 508 KiB/s, done.
Resolving deltas: 100% (240/240), done.9 (delta 59), pack-reused 407

From https://github.com/geonetwork/core-geonetwork
 * [new branch]      2.1.x      -> upstream/2.1.x
 * [new branch]      2.10.x     -> upstream/2.10.x
 * [new branch]      2.11.x     -> upstream/2.11.x
 * [new branch]      2.2.x      -> upstream/2.2.x
 * [new branch]      2.6.x      -> upstream/2.6.x
 * [new branch]      2.8.x      -> upstream/2.8.x
 * [new branch]      3.0.x      -> upstream/3.0.x
 * [new branch]      develop    -> upstream/develop
 * [new branch]      fixing-pom-sonatype -> upstream/fixing-pom-sonatype
 * [new branch]      wizards    -> upstream/wizards
 * [new tag]         3.0.0      -> 3.0.0

 The commits are now on the local branch:
 
$ git status
 On branch 3.0.x
 Your branch is ahead of 'origin/3.0.x' by 47 commits.
  (use "git push" to publish your local commits)

Now push the commits to the origin.

$ git push
