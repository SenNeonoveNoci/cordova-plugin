var exec = require('cordova/exec');

var PLUGIN_NAME = 'SmartlookPlugin';

var smartlook = function() {};

smartlook.init = function (apiKey, successCallback, failCallback) {
  return exec(successCallback, failCallback, PLUGIN_NAME, 'init', []);
}

module.exports = smartlook;