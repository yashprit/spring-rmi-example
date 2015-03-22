'use strict';
var
  exec = require("child_process").exec,
  ssh = require("git-repo-url").ssh;

function remote(username, reponame, cb) {

  if (typeof cb !== "function") {
    throw new Error("callback should be function")
  }

  if (username === undefined) {
    throw new Error("username is required");
  }

  if (reponame === undefined) {
    throw new Error("reponame is required");
  }

  var prefix = "git remote add origin ";
  var url = ssh(username, reponame);
  var command = prefix + url;
  exec(command, function(err, status) {
    if (err) {
      cb(err);
      return;
    }
    cb(null, true);
  });
};

module.exports = remote;
