#!/usr/bin/env node

'use strict';
var argv = require('minimist')(process.argv.slice(2));
var gitRemoteAdd = require('./');

var username = argv.u;
var reponame = argv.r;

gitRemoteAdd(username, reponame, function(err, status) {
  console.log(err, status)
});
