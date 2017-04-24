/**
 * login.js
 */

$(function(){
	loginConfig.init();
});

var loginConfig = (function(){
	var currentObj = null;

	return {
		init: function(){
			currentObj = this;
			this.popupModal();
		},

		popupModal:function(){
			$("#loginLink").click();
		}
	};
})();
