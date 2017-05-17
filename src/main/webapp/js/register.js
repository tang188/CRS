/**
 * register.js
 */

$(function(){
	registerConfig.init();
});

var registerConfig = (function(){
	var currentObj = null;

	return {
		init: function(){
			currentObj = this;
			this.changeVerifiedCode();
			this.popupModal();
			this.agreeProtocol();
		},

		changeVerifiedCode : function(){
			//点击链接更换验证码图片.
			$("#verifiedCodeImg").click(function(){
				$("#verifiedCodeImg").attr("src",contextPath + "/page/verifiedCode.do?"+new Date().getTime());
			});
		},

		popupModal:function(){
			$("#regLink").click();
		},

		agreeProtocol:function(){
			$("#protocol").click(function(){
				$("#protocolTag").toggleClass("text-success");
			});

			$("#regform").submit(function(){
				var flag = $("#protocolTag").hasClass("text-success")
				if(!flag){
					alert("你还没有同意网站协议！");
					return false;
				}
				return true; 
			});
		}
	};
})();
